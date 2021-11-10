drop procedure atualizar_vl_comissao_por_vendedor;
delimiter $$
create procedure atualizar_vl_comissao_por_vendedor(in vendedor int, in porcentagem double)
	begin
		if (vendedor != null) then
			update vendedor
			set n_porcvende = porcentahem
			where id = vendedor;
		end if;
	end
delimiter ;