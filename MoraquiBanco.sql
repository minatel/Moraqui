DROP TABLE IF EXISTS contrato; 
DROP TABLE IF EXISTS atributos;
DROP TABLE IF EXISTS moradia; 
DROP TABLE IF EXISTS visita;
DROP TABLE IF EXISTS gerenciador;
DROP TABLE IF EXISTS locatario;
DROP TABLE IF EXISTS locator; 
DROP TABLE IF EXISTS itens;
DROP TABLE IF EXISTS usuario; 
DROP SEQUENCE IF EXISTS seq_CodUsuario;
DROP SEQUENCE IF EXISTS seq_Codgerenciador;
DROP SEQUENCE IF EXISTS seq_Codlocatario;
DROP SEQUENCE IF EXISTS seq_Codlocator;
DROP SEQUENCE IF EXISTS seq_CodMoradia;
DROP SEQUENCE IF EXISTS seq_CodContrato;

CREATE SEQUENCE seq_CodUsuario
    INCREMENT 1
    MINVALUE 1
    MAXVALUE 999999999
    START 1
    CACHE 1;
CREATE TABLE Usuario(
	codUsuario INT DEFAULT NEXTVAL('seq_codUsuario'),
	Nome varchar(100),
	RG int,
	CPF int,
	DataNasce date,
	Senha varchar(50),
	Endereco varchar(100),
	CEP int,
	Sexo varchar(20),
	Situacao boolean,
	Tipo varchar(20),
	CONSTRAINT UNRg UNIQUE (Rg),
	CONSTRAINT PKUsuario PRIMARY KEY(CodUsuario)
);

CREATE SEQUENCE seq_CodGerenciador
    INCREMENT 1
    MINVALUE 1
    MAXVALUE 999999999
    START 1
    CACHE 1;
CREATE TABLE Gerenciador(
	CodGerenciador INT DEFAULT NEXTVAL('seq_CodGerenciador'),
	CodUsuario int,
	CONSTRAINT PKGerenciador PRIMARY KEY (CodGerenciador),
	CONSTRAINT FKGerenciador FOREIGN KEY (CodUsuario) REFERENCES Usuario(CodUsuario) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE SEQUENCE seq_CodLocatario
    INCREMENT 1
    MINVALUE 1
    MAXVALUE 999999999
    START 1
    CACHE 1;
CREATE TABLE Locatario(
	CodLocatario INT DEFAULT NEXTVAL('seq_CodLocatario'),
	CodUsuario int,
	Fumante boolean,
	Alergias varchar(100),
	CONSTRAINT PKLocatario PRIMARY KEY (CodLocatario),
	CONSTRAINT FKLocatario FOREIGN KEY(CodUsuario) REFERENCES Usuario(CodUsuario) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE SEQUENCE seq_CodLocator
    INCREMENT 1
    MINVALUE 1
    MAXVALUE 999999999
    START 1
    CACHE 1;
CREATE TABLE Locator(
	CodLocator INT DEFAULT NEXTVAL('seq_CodLocator'),
	CodUsuario int,
	CONSTRAINT PKLocator PRIMARY KEY(CodLocator),
	CONSTRAINT FKLocator FOREIGN KEY(CodUsuario) REFERENCES Usuario(CodUsuario) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE Itens(
	CodItens int,
	Nome varchar(50),
	Quant int,
	Descricao varchar(200),
	CONSTRAINT PKItens PRIMARY KEY(CodItens)
);

CREATE SEQUENCE seq_CodMoradia
    INCREMENT 1
    MINVALUE 1
    MAXVALUE 999999999
    START 1
    CACHE 1;
CREATE TABLE Moradia(
	CodMoradia INT DEFAULT NEXTVAL('seq_CodMoradia'),
	CodLocator int,
	Endereco varchar(100),
	CEP int,
	Tipo varchar(50),
	Area float,
	Genero varchar(20),
	QuantMorador int,
	ValorUnitario float,
	CONSTRAINT PKMoradia PRIMARY KEY(CodMoradia),
	CONSTRAINT FKMoradia FOREIGN KEY (CodLocator) REFERENCES Locator(CodLocator) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE Visita(
	CodLocatario int,
	CodMoradia int,
	Datavisita date,
	HoraVisita time, 
	Descricao varchar(200),
	Status varchar(50),
	CONSTRAINT PKVisita PRIMARY KEY(CodLocatario, CodMoradia),
	CONSTRAINT FKVisLocatario FOREIGN KEY (CodLocatario) REFERENCES Locatario(CodLocatario),
	CONSTRAINT FKVisMoradia FOREIGN KEY (CodMoradia) REFERENCES Moradia(CodMoradia) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE Atributos(
	CodItens int,
	CodMoradia int,
	CONSTRAINT FKAtributos PRIMARY KEY (CodItens,CodMoradia),
	CONSTRAINT PKAtribItens FOREIGN KEY (CodItens) REFERENCES Itens(CodItens) ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT PKAtribMorad FOREIGN KEY(CodMoradia) REFERENCES Moradia(CodMoradia)ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE SEQUENCE seq_CodContrato
    INCREMENT 1
    MINVALUE 1
    MAXVALUE 999999999
    START 1
    CACHE 1;
CREATE TABLE Contrato(
	CodContrato INT DEFAULT NEXTVAL('seq_CodContrato'),
	CodMoradia int,
	CodLocatario int,
	CodLocator int,
	Valor float,
	DataInic date,
	Datafim date,
	Especificacoes varchar(200),
	CONSTRAINT PKContrato PRIMARY KEY (CodContrato),
	CONSTRAINT FKContMorad FOREIGN KEY (CodMoradia) REFERENCES Moradia(CodMoradia) ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT FKContLocat FOREIGN KEY (CodLocatario) REFERENCES Locatario(CodLocatario) ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT FKContLocad FOREIGN KEY (CodLocator) REFERENCES Locator(CodLocator) ON DELETE CASCADE ON UPDATE CASCADE
);


	





