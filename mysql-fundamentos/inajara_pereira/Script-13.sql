use revisao2;

-- INNER ligação obrigatória
select p.descricao_produto from produto p
inner join fornecedor_produto fp
inner join fornecedor f on f.codigo_fornecedor = fp.codigo_fornecedor;

-- LEFT ligação NÃO obrigatória
select p.descricao_produto from produto p
left join fornecedor_produto fp
left join fornecedor f on f.codigo_fornecedor = fp.codigo_fornecedor;

-- RIGHT ligação NÃO obrigatótia
select p.descricao_produto from produto p
right join fornecedor_produto fp
right join fornecedor f on f.codigo_fornecedor = fp.codigo_fornecedor;

insert into fornecedor(codigo_fornecedor, NOME_FORNECEDOR) values (6, 'PICHAU');
alter table produto add column codigo_fornecedor int not null;
insert into produto(codigo_fornecedor, codigo_produto)
values (6,    10);

select * from PRODUTO;
select * from FORNECEDOR;

create table fornecedor_produto(
    codigo_fornecedor int not null,
    codigo_produto int not null
);

insert into fornecedor_produto(codigo_fornecedor, codigo_produto)
values (6,    10),
       (6,    11);

select * from fornecedor_produto;