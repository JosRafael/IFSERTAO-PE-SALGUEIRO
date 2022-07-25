DROP DATABASE questao_prova;
CREATE DATABASE questao_prova;
use questao_prova;

CREATE TABLE Cliente(
	cpf varchar(30) primary key not null,
    nome varchar(30) not null ,
    numConta varchar (10) not null ,
    telefone bigint not null,
    cidade varchar(30) 
);
CREATE TABLE Carro(
	CHASSI varchar(30) primary key,
	modelo varchar(30),
    cor varchar(30),
    ano year,
    valor varchar(30) DEFAULT ''
);
CREATE TABLE Aluguel(
	CHASSI varchar(30) not null,
	cpf varchar(30) not null,
    dataEntrada date,
    dataSaida date,
    primary key(CHASSI, cpf)
);
insert into Cliente VALUES
	(111111, 'Ana', '2317', 019, 'Campinas' ),
	(222222, 'Fábio', '1711', 019, 'Jundiaí' ),
	(121111, 'Maria', '7121', 011, 'São Paulo' ),
	(321222, 'Flávio', '2211', 019,'Campinas'),
	(123111, 'Fernando', '1123',  031,'Rio de janeiro' ),
	(217222, 'Marta', '3211', 021, 'Belo Horizonte');

insert into Carro VALUES
	('A21', 'Uno', 'Prata',  2003, NULL ),
	('2AC', 'Gol ', 'Preto', 2004, null),
	('33A', 'Corsa', 'Branco', 2005, null ),
	('12C', 'Uno', 'Verde', 2001, null),
	('1C2', 'Astra', 'Prata', 2005, null ),
	('22A', 'Gol', 'Prata', 2005, null );

insert into Aluguel VALUES
	('111111', '33A', '2006-07-21', '2006-08-05'),
	('222222', '12C', '2006-07-21', NULL),
	('222222', '33A', '2006-07-23', '2006-08-06'),
	('222222', '1C2', '2006-07-24', NULL);

	
INSERT INTO Carro (valor, cor, ano, chassi, modelo) VALUES (12000, "Preto", 2006, "19B", "Celta");
UPDATE Cliente SET nome = "André" WHERE cpf = "321222";
UPDATE Carro SET cor = "Azul" WHERE modelo = "Uno" OR modelo = "Corsa";
DELETE FROM Cliente WHERE cidade = "Campinas";
DELETE FROM Carro WHERE ano = 2003 OR ano = 2004;
DELETE FROM Aluguel;






