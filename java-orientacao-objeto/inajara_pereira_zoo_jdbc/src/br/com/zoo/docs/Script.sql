use zoologico;

create table dono(
	codigo int primary key not null auto_increment,
	nome varchar(50),
	telefone varchar(20)
);

create table animal(
  	codigo int primary key not null auto_increment,
	nome varchar(30),
	especie varchar(10),
	sexo char(1),
	caracteristica varchar(100),
	data_cadastro varchar(10),
	data_nascimento varchar(10),
	codigo_dono int,
	FOREIGN KEY (codigo_dono) REFERENCES dono(codigo)
);

desc dono;
select * from dono;

desc animal;
select * from animal;