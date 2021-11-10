create database revisao;
use revisao;

create table endereco(
	id int not null auto_increment primary key,
	nome_rua varchar(100),
	numero int,
	complemento varchar(50),
	bairro varchar(50),
	cidade varchar(50),
	estado varchar(20),
	cep varchar(10),
	ponto_referencia varchar(20),
	observacao varchar(100)
);

create table pessoa(
	id int not null auto_increment primary key,
	nome varchar(10),
	sobrenome varchar(30),
	idade int,
	sexo char,
	altura decimal(3,2),
	peso decimal(5,2)
);


-- Populando a tabela
insert into pessoa(nome, sobrenome, idade, sexo, altura, peso) values ('Inajara', 'Pereira', 35, 'F', 1.70, 85);
insert into pessoa(nome, sobrenome, idade, sexo, altura, peso) values ('Maria', 'Mercedes', 20, 'F', 1.60, 50.00);
insert into pessoa(nome, sobrenome, idade, sexo, altura, peso) values ('João', 'Silva', 70, 'M', 1.58, 50.00);
insert into endereco(nome_rua, numero, complemento, bairro, cidade, estado, cep, ponto_referencia, observacao) 
	values ('João Pio Duarte Silva', '180', 'Apto 201B', 'Córrego Grande', 'Florianópolis', 
	'Santa Catarina', '88037-000', 'Natatorium', 'Home office');

insert into endereco(nome_rua, numero, complemento, cidade, estado, cep, ponto_referencia, observacao) 
	values ('João Pio Duarte Silva', '180', 'Apto 201B', 'Florianópolis', 
	'Santa Catarina', '88037-000', 'Natatorium', 'Home office');

insert into endereco(id_pessoa) values (1);

-- Atualizando registro da tabela
update pessoa set nome = 'informacao', sobrenome = 'mudei o valor do sobrenome', idade = 10 where id = 3;

-- Deletando um registro da tabela
delete from pessoa where id = 2;

-- Adicionando a FK do id da pessoa na tabela endereco
alter table endereco add column id_pessoa int;
alter table endereco add constraint fk_endereco_pessoa foreign key (id_pessoa) references pessoa(id);

-- Atribuindo resgistro padrao para os valores
update endereco  set bairro = 'PADRAO';

-- Modifica o atributo para torna-lo obrigatório.
alter table endereco modify nome_rua varchar(100) not null;
alter table endereco modify bairro varchar(100) not null;


-- Consultando registros da tabela
select * from pessoa p;
select * from endereco e;