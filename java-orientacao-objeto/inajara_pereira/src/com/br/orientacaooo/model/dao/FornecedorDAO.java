package com.br.orientacaooo.model.dao;

import com.br.orientacaooo.infra.ConexaoMysql;
import com.br.orientacaooo.model.entity.Fornecedor;
import com.br.orientacaooo.model.entity.Produto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FornecedorDAO implements GenericDAO<Fornecedor> {

    private final ConexaoMysql conexao;
    private String query;

    public FornecedorDAO() throws SQLException, ClassNotFoundException {
        conexao = new ConexaoMysql();
    }

    @Override
    public void save(Fornecedor fornecedor) throws SQLException {
        query = "insert into fornecedor(nome_fornecedor, cnpj) values (?, ?);";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            stmt.setString(1, fornecedor.getNome());
            stmt.setString(2, fornecedor.getCnpj());
            stmt.execute();
            this.conexao.commit();
        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }
    }

    @Override
    public void update(Fornecedor fornecedor) throws SQLException {
        query = "update fornecedor set NOME_FORNECEDOR = ?, CNPJ = ? where CODIGO_FORNECEDOR = ?;";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            stmt.setString(1, fornecedor.getNome());
            stmt.setString(2, fornecedor.getCnpj());
            stmt.setInt(3, fornecedor.getCodigo());
            stmt.executeUpdate();
            this.conexao.commit();
        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }
    }

    @Override
    public void delete(int id) throws SQLException {
        query = "DELETE FROM fornecedor WHERE codigo_fornecedor = ?;";
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
    public List<Fornecedor> findAll() throws SQLException {
        query = "SELECT codigo_fornecedor, nome_fornecedor, cnpj from fornecedor;";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            ResultSet resultSet = stmt.executeQuery();
            List<Fornecedor> listaFornecedores = new ArrayList<>();
            while (resultSet.next()) {
                Fornecedor f = new Fornecedor(resultSet.getInt("codigo_fornecedor"),
                        resultSet.getString("nome_fornecedor"),
                        resultSet.getString("cnpj"));
                listaFornecedores.add(f);
            }
            return listaFornecedores;
        } catch (SQLException se) {
            throw se;
        }
    }

    @Override
    public Fornecedor findById(int id) throws SQLException {
        query = "select * from fornecedor where codigo_fornecedor = ?;";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();
            if (resultSet.next()) {
                return new Fornecedor(resultSet.getInt("codigo_fornecedor"),
                        resultSet.getString("nome_fornecedor"),
                        resultSet.getString("cnpj"));
            }
        } catch (SQLException se) {
            throw se;
        }
        return null;
    }
}