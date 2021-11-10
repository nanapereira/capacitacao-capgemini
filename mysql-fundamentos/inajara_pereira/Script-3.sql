-- Setando o banco a ser utilizado
use loja;

-- Criando tabela com os atriutos
create table cliente(
	id 				int not null auto_increment primary key,
	codigo_cliente 	varchar(10),
	nome 			varchar(100),
	razao_social 	varchar(100),
	data_cadastro 	date,
	cnpj 			varchar(20),
	telefone 		varchar(20),
);

-- Inserção de registros
insert into cliente(nome) values ('Inajara');
insert into cliente(nome, data_cadastro) values ('Palloma', now());
insert into cliente(nome, data_cadastro, telefone) values ('Inajara', now(), '(48)9 9961 7033');
insert into cliente(nome, data_cadastro, telefone) values ('João', now(), '(48)9 9999 9999');
insert into cliente(nome, data_cadastro, telefone) values ('Maria', now(), '(48)9 8888 8888');
insert into cliente(nome, data_cadastro, telefone) values ('Pedro', now(), '(48)988888888');
insert into cliente(codigo_cliente, nome, razao_social, data_cadastro, cnpj, telefone) values ('L230T', 'Loja B', 'Loja Brasileira', now(), 'XX. XXX. XXX/0001-XX','(48)988888888');


-- Criando tabela para testar update
create table teste_atualizacao(
	nome 			varchar(100),
	data_cadastro 	date
);

-- Inserire conteúdos na tabelas
insert into teste_atualizacao(nome) values ('Inajara');
insert into teste_atualizacao(nome) values ('Palloma');
insert into teste_atualizacao(nome, data_cadastro) values ('Inajara', now());
insert into teste_atualizacao(nome, data_cadastro) values ('Palloma', now());

-- Atualizar um registro **PREFERENCIALMENTE SEMPRE FAZER PELO ID**
update teste_atualizacao set data_cadastro = now() where NOME = 'Inajara';
update cliente set cnpj = '888' where id = 1;
update cliente set cnpj = '777' where NOME = 'Palloma';
update cliente set cnpj = '666' where NOME = 'Inajara';

-- Pesquisa o conteudo da tabela
select  * from teste_atualizacao ta;
select * from cliente where CNPJ = '666';

-- Exclui registros da tabela
delete from cliente where id = '2';

-- Inserire conteúdos na tabela e setando id deletado
insert into cliente(id, nome, data_cadastro) values (2, 'Val', now());

-- Inserire conteúdos na tabela e setando id para incrementar
insert into cliente(id, nome, data_cadastro) values (30, 'Ambrosia', now());
insert into cliente(nome, data_cadastro) values ('Beatriz', now());

delete from cliente;

-- Pesquisa registros da tabela
select * from cliente c ;