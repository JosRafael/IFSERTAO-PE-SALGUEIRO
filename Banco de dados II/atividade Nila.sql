CREATE DATABASE sistema_bancario;
use sistema_bancario;

create table HistoricoPadrao(
	codigoHistorico tinyint primary key auto_increment,
    descricao varchar(80) not null default ""
);

create table CaixaMovimento(
	lancamentoCaixa smallint primary key auto_increment,
    codigoHistorico tinyint default 0,
    documento varchar(12) not null default "",
    data_mov date not null,
    valor real not null,
    foreign key (codigoHistorico)
		references HistoricoPadrao(codigoHistorico)
);

create table ContaBanco(
	conta real primary key,
    agencia real default 0.0,
    nomeBanco varchar(40) not null default ""
);

create table BancoMovimento(
	lancamentoBanco smallint primary key auto_increment,
    conta real not null,
    lancamentoCaixa smallint not null,
    data_lancamento date not null,
    tipoLancamento char(1) not null default "",
    valor real default 0.00,
    foreign key (conta)
		references ContaBanco(conta),
	foreign key (lancamentoCaixa)
		references CaixaMovimento(lancamentoCaixa)
);

create table ContasPagarReceber(
	lancamentoContaPG int primary key auto_increment,
    codigoHistorico tinyint default 0,
    dataVencimento date not null,
    documento varchar(12) not null default "",
    valor real default 0.00,
    tipo char(2) not null default "",
    situacao char not null default "",
    foreign key (codigoHistorico)
		references CaixaMovimento(codigoHistorico),
	CONSTRAINT chec_tipo CHECK(tipo in ('D', 'C'))
);