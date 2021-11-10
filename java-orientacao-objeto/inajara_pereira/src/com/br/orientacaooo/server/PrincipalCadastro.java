package com.br.orientacaooo.server;

import com.br.orientacaooo.model.dao.FornecedorDAO;
import com.br.orientacaooo.model.dao.ProdutoDAO;

import java.sql.SQLException;

public class PrincipalCadastro {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        FornecedorDAO fDao = new FornecedorDAO();
        ProdutoDAO pDao = new ProdutoDAO();

        System.out.println(pDao.findById(22));
        System.out.println(fDao.findById(5));

    }
}
