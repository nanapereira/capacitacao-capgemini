package com.br.orientacaooo.model.dao;

import com.br.orientacaooo.infra.ConexaoMysql;
import com.br.orientacaooo.model.entity.Produto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO implements GenericDAO<Produto> {

    private String query;
    private final ConexaoMysql conexao;

    public ProdutoDAO() throws SQLException, ClassNotFoundException {
        conexao = new ConexaoMysql();
    }

    @Override
    public void save(Produto produto) throws SQLException {
        query = "insert into produto(codigo_produto, preco_produto, descricao_produto) values (?, ?, ?);";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            stmt.setInt(1, produto.getCodigoProduto());
            stmt.setDouble(2, produto.getPrecoProduto());
            stmt.setString(3, produto.getDescricaoProduto());
            stmt.execute();
            this.conexao.commit();
        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }
    }

    @Override
    public void update(Produto produto) throws SQLException {
        query = "update produto set preco_produto = ?, descricao_produto = ? where codigo_produto = ?;";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            stmt.setDouble(1, produto.getPrecoProduto());
            stmt.setString(2, produto.getDescricaoProduto());
            stmt.setInt(3, produto.getCodigoProduto());
            stmt.executeUpdate();
            this.conexao.commit();
        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }
    }

    @Override
    public void delete(int id) throws SQLException {
        query = "DELETE FROM produto WHERE codigo_produto = ?;";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            this.conexao.commit();
        } catch (SQLException se) {
            this.conexao.rollback();
            throw se;
        }
    }

    @Override
    public List<Produto> findAll() throws SQLException {
        query = "SELECT codigo_produto, preco_produto, descricao_produto from produto;";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            ResultSet resultSet = stmt.executeQuery();
            List<Produto> listaProduto = new ArrayList<>();
            while (resultSet.next()) {
                Produto p = new Produto(resultSet.getInt("codigo_produto"),
                        resultSet.getDouble("preco_produto"),
                        resultSet.getString("descricao_produto"));
                listaProduto.add(p);
            }
            return listaProduto;
        } catch (SQLException se) {
            throw se;
        }
    }

    @Override
    public Produto findById(int id) throws SQLException {
        query = "select * from produto where codigo_produto = ?;";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();
            if (resultSet.next()) {
                return new Produto(resultSet.getInt("codigo_produto"),
                        resultSet.getDouble("preco_produto"),
                        resultSet.getString("descricao_produto"));
            }
        } catch (SQLException se) {
            throw se;
        }
        return null;
    }
}
