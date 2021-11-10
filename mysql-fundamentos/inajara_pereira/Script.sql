-- Cria um bando de dados
create schema loja;

-- Diz qual banco estou utilizando
use loja;

-- Cria uma tabela no banco
CREATE TABLE CONTATO(
nome varchar(100),
telefone int,
sexo char
);

-- Insere registros na tabela
insert into contato(nome, telefone, sexo) values ('Inajara Pereira',999617033,'F');

-- Exclui uma tabela
drop table CONTATO;

-- Criando novamente a tabela e substituindo tipo telefone
CREATE TABLE CONTATO(
nome varchar(100),
telefone bigint,
sexo char
);

-- Insere registros na tabela
insert into CONTATO(nome, telefone, sexo) values ('Inajara Pereira',48999617033,'F');
insert into CONTATO(nome, telefone, sexo) values ('Alicio da Cunha',47992614235,'M');
insert into CONTATO(nome, telefone, sexo) values ('Valquiria Matter',47999999999,'F');

-- Pesquisa tudo em uma tabela
select * from contato;

-- Mostra a estrutura da tabela os atributos e tipos
describe contato;



