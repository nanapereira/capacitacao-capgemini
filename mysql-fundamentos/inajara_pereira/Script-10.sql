create or replace view v_cliente_fornecedor as
	select c.id as 'codigo interno', c.nome 
		as 'Cliente', id_fornecedor, count(id_fornecedor) 'qtde de compra em de cada forncedor' 
			from venda v inner join cliente c on c.id = v.id_cliente 
				group by id_fornecedor, id_cliente order by id_cliente;