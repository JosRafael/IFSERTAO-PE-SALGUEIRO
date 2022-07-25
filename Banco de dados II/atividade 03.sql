DROP database biblioteca;
CREATE DATABASE biblioteca;
use biblioteca;

create table autores(
    codigo int primary key,
    nome varchar(45) not null,
    nacionalidade varchar(45)
);
create table editoras(
    codigo int primary key,
    nome varchar(45) not null,
    endereco varchar(45),
    contato varchar(45)
);
create table funcionarios(
    cpf bigint,
    nome varchar(45) not null,
    endereco varchar(45) not null,
    telefone bigint not null,
    salario decimal(10,2),
    funcao varchar(45),
    primary key(cpf)
);

create table usuarios(
    cpf bigint,
    nome varchar(45) not null,
    endereco varchar(45),
    telefone bigint,
    constraint pk_usuarios primary key(cpf)
);

create table livros(
    numero int primary key,
    titulo varchar(100) not null,
    genero varchar(45) not null,
    edicao smallint not null,
    ano_publicacao year not null,
    cpf_funcionario bigint,
    codigo_editora int,
    cpf_usuarioRetirar bigint,
    cpf_usuarioReservar bigint
);

create table livros_autores(
    numero_livro int,
    codigo_autor int,
    primary key(numero_livro,codigo_autor)
);
insert into livros VALUES
(10277843, 'O Pelicano', 'Romance', 12, 1984, NULL, 213400, NULL, NULL),
(32166500, 'Salomão - O Homem...', 'Romance', 2, 2011, 61254590781, 6655000, NULL, NULL),
(45112239, 'Steve Jobs- a Biografia', 'Biografia', 48, 2011, NULL, 2287000, 19321122213, NULL),
(67392219, 'Empregabilidade - co...', 'Administração', 22, 1977, 32361298734, 9898000, NULL, NULL),
(67554421, 'Bagagem', 'Poesia', 5, 1972, NULL, 6655000, NULL, 19321122213),
(77680012, 'A Duração do dia', 'Poesia', 1, 2010, NULL, 2134000, 1012020232, NULL),
(87659908, 'Tecnologia que Mud...', 'Tecnologia', 2, 2007, NULL, 2134000, NULL, 70964411900);

INSERT INTO usuarios VALUES
	(10122020232, 'Maria de Lourdes Amaral', NULL, 35440089),
	(19321122213, 'José Francisco de Paula', NULL, 27219756),
	(22539910976, 'Ivete Medina Chernell', NULL, 48170352),
	(45399109881, 'Raquel Santos', NULL, 87603451),
	(70964411900, 'Luiza Souza Prado', NULL, 34559087);

INSERT INTO autores VALUES
	(22564411, 'Walter Isaacson', 'Americana'),
	(55490076, 'Adélia Prado', 'Brasileira'),
	(77548854, 'Ana Lucia Jankovic Barduchi', 'Brasileira'),
	(85668900, 'Ethevaldo Siqueira', 'Brasileira'),
	(90984133, 'Steven K. Scott', 'Americana');
    
	
INSERT INTO livros_autores VALUES
	(32176500, 22564411),
	(45112239, 22564411),
	(10277843, 55490076),
	(67554421, 55490076),
	(77680012, 55490076),
	(67392217, 77548854),
	(87659908, 85668900),
	(32176500, 90984133);
    
INSERT INTO funcionarios VALUES
	(20321295096, 'João Alberto Smith', 'Itatiba', 22447865, 0.00, NULL),
	(23161197700, 'Ana Salles Azir', 'Salto', 22317865, 0.00, 'Recepcionista'),
	(30361290876, 'Ademir José Silva', 'Campinas', 22317865, 0.00, NULL),
	(32361298734, 'Luís Henrique Talles', 'Campinas', 21531785, 0.00, NULL),
	(45403612087, 'Francisco José Almeida', 'Indaiatuba', 25417761, 0.00, NULL),
	(61254590871, 'Lucia Vicentim', 'Salto', 21316565, 0.00, 'Bibliotecaria');

INSERT INTO editoras VALUES
	(2134000, 'Saraiva', 'São Paulo', 8003434),
	(2287000, 'Eras', 'Brasilia', 8002432),
	(3557000, 'Summer', 'Curitiba', 8002198),
	(6655000, 'Pontos', 'São Paulo', 8005600),
	(9898000, 'Marks', 'Rio de Janeiro', 8009000);

    
