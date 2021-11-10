create database agenda;

use agenda;

create table formacao(
	id int not null auto_increment primary key,
	nome varchar(200)
);

create table estado(
	id int not null auto_increment primary key,
	nome varchar(30)
);

create table cidade(
	id int not null auto_increment primary key,
	nome varchar(100)
);

alter table cidade add column id_estado int;
alter table cidade add constraint fk_cidade_estado foreign key (id_estado) references estado(id);

create table endereco(
	id int not null auto_increment primary key,
	rua  varchar(100),
	numero int,
	bairro varchar(50),
	cep varchar(10),		
	complemento varchar(50),
	observacao varchar(100)
);

alter table endereco add column id_cidade int;
alter table endereco add constraint fk_endereco_cidade foreign key (id_cidade) references cidade(id);

create table pessoa(
	id int not null auto_increment primary key,
	nome varchar(100),
	idade int,
	sexo char,
	altura decimal(3,2),
	peso decimal(5,2)
);

alter table pessoa add column id_endereco int;
alter table pessoa add column id_formacao int;

alter table pessoa add constraint fk_pessoa_endereco foreign key (id_endereco) references endereco(id);
alter table pessoa add constraint fk_pessoa_formacao foreign key (id_formacao) references formacao(id);

alter table cidade modify id_estado int not null;
alter table endereco modify id_cidade int not null;

insert into formacao(nome) values ('Desenvolvimento de software');
insert into estado(nome) values ('Paraná');
insert into estado(nome) values ('Santa Catarina');
insert into cidade(nome, id_estado) values ('Guaíra', 1);
insert into cidade(nome, id_estado) values ('Florianópolis', 2);
insert into endereco(rua, numero, bairro, id_cidade) values ('Alvorada', '388', 'Centro', 1);
insert into pessoa (nome, sexo, id_formacao, id_endereco) values ('Valquíria', 'F', 1, 1);


select * from cidade;
select * from estado;
select * from endereco;
select * from formacao;
select * from pessoa;