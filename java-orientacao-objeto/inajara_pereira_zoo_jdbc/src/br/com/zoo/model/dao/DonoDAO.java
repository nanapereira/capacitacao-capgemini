package br.com.zoo.model.dao;

import br.com.zoo.infra.ConexaoMysql;
import br.com.zoo.model.entity.Dono;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DonoDAO implements GenericDAO<Dono> {

    private String query;
    private ConexaoMysql conexao;

    public DonoDAO() throws SQLException, ClassNotFoundException {
        conexao = new ConexaoMysql();
    }


    @Override
    public void save(Dono dono) throws SQLException {
        query = "insert into dono( nome, telefone) values ( ?, ? )";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            stmt.setString(1, dono.getNome());
            stmt.setString(2, dono.getTelefone());
            stmt.execute();
            this.conexao.commit();
        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }
    }

    @Override
    public void saveAll(List<Dono> donos) throws SQLException {
        query = "insert into dono( nome, telefone) values ( ?, ? )";
        for (Dono dono : donos) {
            try {
                PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
                stmt.setString(1, dono.getNome());
                stmt.setString(2, dono.getTelefone());
                stmt.execute();
            } catch (SQLException e) {
                this.conexao.rollback();
                throw e;
            }
        }
        this.conexao.commit();
    }

    @Override
    public void update(Dono dono) throws SQLException {
        query = "update dono set nome = ? where codigo = ?;";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            stmt.setString(1, dono.getNome());
            stmt.setInt(2, dono.getCodigo());
            stmt.executeUpdate();
            this.conexao.commit();
        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }
    }


    @Override
    public List<Dono> findAll() throws SQLException {
        query = "SELECT * from dono;";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            ResultSet resultSet = stmt.executeQuery();
            List<Dono> donos = new ArrayList<>();
            while (resultSet.next()) {
                Dono dono = new Dono(
                        resultSet.getInt("codigo"),
                        resultSet.getString("nome"),
                        resultSet.getString("telefone"));
                donos.add(dono);
            }
            return donos;
        } catch (SQLException se) {
            throw se;
        }
    }

    @Override
    public Dono findById(int id) throws SQLException {
        query = "select * from dono where codigo = ?;";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();
            if (resultSet.next()) {
                return new Dono(resultSet.getInt("codigo"),
                        resultSet.getString("nome"),
                        resultSet.getString("telefone"));
            }
        } catch (SQLException se) {
            throw se;
        }
        return null;
    }

    @Override
    public void delete(int id) throws SQLException {
        query = "DELETE FROM dono WHERE codigo = ?;";
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
}

