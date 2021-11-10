use escola;

select NOME,
	case when MAE_CODIGO then "Tem mãe" else "Não tem mãe" end as 'MÃE',
	case when PAI_CODIGO then "Tem pai" else "Não tem pai" end as 'PAI'
 		from FILHO;
 
-- Traz todos os filhos, incluindo os sem mãe, e todas as mães com filho.
select f.nome as 'Nome do filho',
	case when f.MAE_CODIGO is null then 'Não tem mãe' else m.NOME end as 'MÃE'
    	from filho f left join mae m on f.MAE_CODIGO = m.CODIGO;

insert into mae (codigo, nome) values (6, 'Mãe sem filho');
-- Traz todos as mães, incluindo as que não tem filho, e todos os filhos com mães.
select f.nome as 'Nome do filho',
	case when f.MAE_CODIGO is null then 'Não tem filho' else m.NOME end as 'MÃE'
    	from filho f right join mae m on f.MAE_CODIGO = m.CODIGO;
  
select f.nome as 'NOME DO FILHO', m.nome as 'NOME DA MAE', 
	case when f.PAI_CODIGO is null then 'Não tem pai' else p.nome end as 'PAI'
		from filho f inner join mae m on m.CODIGO = f.MAE_CODIGO left join pai p on p.CODIGO = f.PAI_CODIGO;
  
select count(codigo) from filho where PAI_CODIGO is null or MAE_CODIGO is null;

select p.NOME as 'Nome do pai', count(f.CODIGO) as 'Qtd de filhos'
	from filho f inner join pai p on f.PAI_CODIGO = p.CODIGO group by p.nome;
  
-- Order by pelo indice da coluna 2
select f.nome as 'Nome do filho', m.NOME as 'Nome da mãe' 
    from filho f inner join mae m on f.MAE_CODIGO = m.CODIGO order by 2;

select f.nome as 'Nome do filho', m.NOME as 'Nome da mãe' 
    from filho f inner join mae m on f.MAE_CODIGO = m.CODIGO WHERE m.NOME = 'Gabriela' or m.NOME = 'Juliana';
   
-- Trazer os nome dos filhos que não são do 'Juca' e 'Juliano' utilizando a negação
select f.nome as 'Nome do filho', p.NOME as 'Nome do pai' 
    from filho f left join pai p on f.PAI_CODIGO = p.CODIGO WHERE p.NOME != 'Juca' and p.NOME != 'Juliano';
   
-- Trazer os nome dos filhos que não são do 'Juca' e 'Juliano' utilizando o diferente
select f.nome as 'Nome do filho', p.NOME as 'Nome do pai' 
    from filho f left join pai p on f.PAI_CODIGO = p.CODIGO WHERE p.NOME <> 'Juca' and p.NOME <> 'Juliano';

-- Trazer os nome dos filhos que não são do 'Juca' e 'Juliano' utilizando not in()
Trazer os nome dos filhos que não são do 'Juca' e 'Juliano' utilizando a negação
	select f.nome as 'Nome do filho', p.NOME as 'Nome do pai' 
    	from filho f inner join pai p on f.PAI_CODIGO = p.CODIGO where p.NOME not in('Juca','Juliano');
   
select p.nome as 'Nome do pai' from filho f inner join pai p 
	on f.PAI_CODIGO = p.CODIGO  group by p.NOME having count(p.nome)>1;

-- O union executa a junção dos selects com o distinct entre as tabelas
select m.nome as 'Nome dos pais' from filho f inner join mae m on f.MAE_CODIGO = m.CODIGO  group by m.NOME having count(m.nome)>1
	union select p.nome as 'Nome dos pais' from filho f inner join pai p on f.PAI_CODIGO = p.CODIGO  group by p.NOME having count(p.nome)>1;

-- O union all traz todos os resultados independente das repetições
select m.nome as 'Nome dos pais' from filho f inner join mae m on f.MAE_CODIGO = m.CODIGO  group by m.NOME having count(m.nome)>1
	union all select p.nome as 'Nome dos pais' from filho f inner join pai p on f.PAI_CODIGO = p.CODIGO  group by p.NOME having count(p.nome)>1;

select p.nome as 'Nome do pai', m.nome as 'Nome da mãe', count(f.codigo) as 'Qtd de filhos' from filho f 
	inner join mae m on m.CODIGO = f.MAE_CODIGO inner join pai p on p.CODIGO = f.PAI_CODIGO
		group by m.codigo, p.codigo order by 1;
	
-- Mostrar os nomes dos pais e mãe, e caso tenha um filho, mostrar “Tem um filho”,
-- caso possua dois filhos mostrar “Tem um casal”, caso tem mais filhos “Eles não dormem”.
select p.nome as 'Nome do pai', m.nome as 'Nome da mãe', count(f.codigo) 'Qtd', 
	case when count(f.codigo)=1 then 'Tem um filho' 
		 when count(f.codigo)=2 then 'Tem um casal' 
		 when count(f.codigo)=3 then 'Eles não dormem'
		 else 'Eles não tem filhos' end as 'Filhos'
			from filho f inner join mae m on m.CODIGO = f.MAE_CODIGO inner join pai p on p.CODIGO = f.PAI_CODIGO
				group by p.nome, m.nome;
			
-- Trazer a quantidade de filhos que não tem pai e nem mãe.
select count(codigo) from filho where mae_codigo is null and pai_codigo is null;

-- Trazer apenas as mães que não tenham filhos
select count(f.codigo) from filho f left join mae m on m.CODIGO = f.MAE_CODIGO
	where mae_codigo is null group by m.nome;

-- Select da tabela mãee subselect da tabela filho
select * from mae m where not exists(select * from filho f where f.MAE_CODIGO = m.CODIGO);

-- Trazer os filhos e o nome do pai, dos filhos que possuem “ri” no nome, ordenando pelo nome do pai decrescente
select f.nome, p.nome from filho f inner join pai p on p.CODIGO = f.PAI_CODIGO
	where f.nome like '%ri%'order by p.nome desc;

-- Trazer os nomes dos pais, e outra coluna com a quantidade de caracteres que o nome do pai possui (Exemplo: SELECT LENGTH(‘Pedro’) FROM DUAL)
select nome, length(nome) as 'qt' from pai;

select * from filho;