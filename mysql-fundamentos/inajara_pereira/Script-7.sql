use loja;

-- Criando uma tabela e setando valores default
create table tabela3 (SITUACAO boolean default true, nome varchar(5), data_cadastro datetime default now());
insert into tabela3 values(false, 'Bota3', now());
insert into tabela3 (nome) values('Bota2');
insert into tabela3 (SITUACAO, nome) values(false, 'Bota2');
select * from tabela3;

-- Retorna a próxima sequencia a ser inserida na table
select auto_increment from information_schema.TABLES where TABLE_NAME = 'venda' and TABLE_SCHEMA = 'loja';

-- Consulta e ordenar por campos
select descricao, codigo_produto , valor from produto;
select descricao, codigo_produto, valor from produto order by descricao desc;
select descricao, codigo_produto, valor from produto order by codigo_produto desc;
select descricao, codigo_produto, valor from produto order by valor desc;
select descricao, codigo_produto, valor from produto where descricao like '%no%';
select descricao, codigo_produto, valor from produto where descricao like 'dr%';
select descricao, codigo_produto, valor from produto where descricao like '%ne';

-- Controlar total de linhas da tabela
select count(id) from item_venda;
select count(*) from item_venda;

-- Aliases nas colunas
select count(*) as 'Total de linhas na tabela' from item_venda;
select id as 'codigo do produto', descricao as 'Descrição', 
	codigo_produto as 'Código interno', valor as 'Valor' from produto order by id desc;

-- Função de formatação
select id as 'codigo do produto', descricao as 'Descrição', 
	codigo_produto as 'Código interno', concat('R$', format(valor, 2)) 'Valor' from produto order by id desc;

-- Buscanco maior e menor valor de uma coluna
select max(valor) from produto;
select min(valor) from produto;
select max(valor) + min(valor) from produto;

-- Evitar escrever query com ligação entre tabelas utilizandno WHERE -> Cláusula de condição
select codigo_produto as 'Cod.Interno', descricao as 'Produto', valor as 'Preço unitário', 
	f.nome as 'Fornecedor', f.telefone  'Contato fornec' from produto p,
	fornecedor f where p.id_fornecedor = f.id and p.id_fornecedor is not null;

-- Junção de tabelas
select * from produto p inner join fornecedor f on p.id_fornecedor = f.id;
select p.descricao as 'Produto', f.nome as 'Fornecedor' from produto p inner join fornecedor f on f.id = p.id_fornecedor;
select codigo_produto as 'Cod.Interno', descricao as 'Produto', valor as 'Preço unitário', 
	f.nome as 'Fornecedor', f.telefone  'Contato fornec' from produto p inner join fornecedor f on p.id_fornecedor = f.id;
select codigo_produto as 'Cod.Interno', descricao as 'Produto', valor as 'Preço unitário', 
	f.nome as 'Fornecedor', f.telefone  'Contato fornec' from produto p inner join fornecedor f on p.id_fornecedor = f.id
	where valor > 1500;

-- Consulta com condições
select * from cliente where id in(1,2);
select * from cliente where id < 4;
select * from cliente where id <=5;
select * from cliente where id not in(2,6);
select id_cliente from venda;
select id, nome from cliente;

-- Subconsulta dentro do select
select c.nome, c.data_cadastro from cliente c where id in(select id_cliente from venda v where id);

-- Formas diferentes de fazer a mesma consulta -> Subquery
select c.id, c.nome, c.data_cadastro  from cliente c where id not in(select id_cliente from venda v where v.id_cliente = c.id);
select c.id, c.nome, c.data_cadastro  from cliente c where id not in(select id_cliente from venda v where id);

select (select c.nome from cliente c where c.id = v.id_cliente) as 'Nome Cliente', v.* from venda v;
select c.nome, v.* from venda v inner join cliente c on c.id = v.id_cliente;


select c.id, c.nome, count(codigo_venda) 'qtd compras' from venda v inner join cliente c on c.id = v.id_cliente 
	group by v.id_cliente order by c.nome;

use loja;

select * from cliente;
select * from venda;
select * from fornecedor;

select * from venda v where id_cliente = 9;

select c.id, c.nome, count(codigo_venda) 'qtd compras' from venda v inner join cliente c on c.id = v.id_cliente 
	group by v.id_cliente order by c.nome;
	
select c.id as 'codigo interno', c.nome as 'Cliente', id_fornecedor, count(id_fornecedor) 'qtde de compra em de cada forncedor' 
	from venda v inner join cliente c on c.id = v.id_cliente 
	group by id_fornecedor, id_cliente order by id_cliente;
	