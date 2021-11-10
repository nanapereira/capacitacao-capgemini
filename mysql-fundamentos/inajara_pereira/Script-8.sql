use loja;

select * from cliente;
select * from venda;
select * from vendedor;
select * from fornecedor;

select * from venda v where id_cliente = 9;

select c.id, c.nome, count(codigo_venda) 'qtd compras' from venda v inner join cliente c on c.id = v.id_cliente 
	group by v.id_cliente order by c.nome;
	
select c.id as 'codigo interno', c.nome as 'Cliente', id_fornecedor, count(id_fornecedor) 'qtde de compra em de cada forncedor' 
	from venda v inner join cliente c on c.id = v.id_cliente 
		group by id_fornecedor, id_cliente order by id_cliente;
	
-- UCASE - UPPERCASE - TUDO EM MAIUSCULO
-- LCASE - lowercase - tudo em minusculo
select  nome, UCASE(nome) 'as', lCASE(nome)'ds' from cliente;
select UCASE('naná') 'as', lCASE('NANÁ')'ds';

select codigo_venda, total, id_vendedor, v2.nome from venda v inner join vendedor v2 on v2.id = v.id_vendedor 
	where data_venda between '2015-01-01' and '2015-01-01' and id_vendedor =1 and v.total > 0 order by 3;
	
alter table venda add column vl_comissao float(10,2);

-- Chamada da procedure
call gerar_comissao('2015-01-01', '2015-05-30', @a);
select @a;

call atualizar_vl_comissao_por_vendedor(2, 3.3);


-- Chamada da View
select * from v_cliente_fornecedor;