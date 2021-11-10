use revisao2;

create table produto(
    codigo_produto INT not null auto_increment primary key,
    preco_produto int,
    descricao_produto varchar(30)
);

insert into produto(DESCRICAO_PRODUTO)
             VALUES('Feijao'),
             ('arroz'),
             ('carne de frango'),
             ('macarrao'),
             ('lentilha'),
            ('polvilho'); 

insert into produto(DESCRICAO_PRODUTO)
             VALUES('Feijao carioquinha'),
             ('Feijao branco'),
             ('Feijao marrom');

create table FORNECEDOR(
    CODIGO_FORNECEDOR INT not null auto_increment primary key,
    NOME_FORNECEDOR VARCHAR(100) not null,
    CNPJ VARCHAR(20)
);

-- um produto so pode TER UM E SOMENTE UM FORNECEDOR 

UM PARA MUITOS
FORNECEDOR        ---->     PRODUTO
        1                    N

insert into FORNECEDOR(NOME_FORNECEDOR)
            VALUES('mazer');

-- MUITOS PARA MUITOS 
-- muitos fornecedores fornecendo muitos produtos
-- muitos produtos sao fornecidos por varios
-- fornecedores
-- um produto pode TER MAIS DE UM FORNECEDOR 
MUITOS PARA MUITOS

FORNECEDOR        ---->     PRODUTO
        N                    N

create table fornecedor_produto(
    codigo_fornecedor int not null,
    codigo_produto int not null
);

insert into produto(descricao_produto)
values('memoria corsair 16bg'),
('memoria kingston 16gb');

insert into fornecedor_produto(codigo_fornecedor, codigo_produto)
values (3,    10),
       (4,    10),
       (3,    11),
       (5,    12);
      
insert into fornecedor(codigo_fornecedor, NOME_FORNECEDOR) values (4, 'Fornecedor4'), (5, 'Fornecedor5');
insert into fornecedor(codigo_fornecedor, NOME_FORNECEDOR) values (3, 'Fornecedor3');
       
select * from PRODUTO;
select * from fornecedor_produto;
select * from FORNECEDOR;