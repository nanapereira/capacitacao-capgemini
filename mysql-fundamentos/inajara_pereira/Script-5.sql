use loja;

drop table fornecedor;
drop table produto;

create table fornecedor(
	id int not null auto_increment,
	nome varchar(100),
	primary key(id)
);

create table produto(
	id int not null auto_increment,
	descricao varchar(100),
	id_fornecedor int, -- foreign key|Chave estrangeira
	primary key(id)
);

insert into produto (descricao) values ('Scarpin');
insert into produto (descricao) values ('Sapato');
insert into produto (descricao) values ('Tênis');
insert into produto (descricao) values ('Bota');
insert into produto (descricao) values ('Sapato Social');
insert into produto (descricao) values ('Sapato Social com bico fino');
insert into fornecedor (nome) values ('Arezzo');
insert into fornecedor (nome) values ('Mizuno');
insert into fornecedor (nome) values ('Capodarte');

-- Adiciona chave estrangeira na tabela modelada
alter table produto add constraint fk_produto_fornecedor foreign key (id_fornecedor) references fornecedor(id);
alter table venda add constraint fk_venda_cliente foreign key (id_cliente) references cliente(id);
alter table venda add constraint fk_venda_fornecedor foreign key (id_fornecedor) references fornecedor(id);
alter table venda add constraint fk_venda_vendedor foreign key (id_vendedor) references vendedor(id);
alter table item_venda add constraint fk_item_venda_produto foreign key (id_produto) references produto(id);

-- Remover FK de uma tabela
alter table teste drop constraint fk_teste_teste;

-- Com in na clausula where posso atualizar mais de um registro
update produto set id_fornecedor = 6 where id in (8,11,12);
update produto set id_fornecedor = 5 where id = 10;
update produto set id_fornecedor = 4 where id = 13;

-- Altera o atributo para colocar como OBRIGATÒRIO
alter table produto modify id_fornecedor int not null;
insert into produto(descricao, id_fornecedor) values ('Outro produto qq', 5);

-- Faz a descrição da tabela
desc produto;

-- Adiciona colunas a tabelas existentes
alter table fornecedor add column codigo_fornecedor varchar(10);
alter table fornecedor add column razao_social varchar(100);
alter table fornecedor add column telefone varchar(20);
alter table produto add column codigo_produto varchar(20);
alter table produto add column valor float(10,2);
alter table produto add column situacao varchar(1);

-- Deleta uma coluna da tabela
alter table produto drop column codigo_produto;

select * from fornecedor;
select * from produto;
