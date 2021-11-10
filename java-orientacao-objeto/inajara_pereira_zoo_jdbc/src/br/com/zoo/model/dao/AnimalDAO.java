package br.com.zoo.model.dao;

import br.com.zoo.infra.ConexaoMysql;
import br.com.zoo.model.entity.Animal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AnimalDAO implements GenericDAO<Animal> {

    private String query;
    private ConexaoMysql conexao;

    public AnimalDAO() throws SQLException, ClassNotFoundException {
        conexao = new ConexaoMysql();
    }

    @Override
    public void save(Animal animal) throws SQLException {
        query = "insert into animal( nome, especie, sexo, caracteristica, data_cadastro, data_nascimento, codigo_dono) " +
                "values ( ?, ?, ?, ?, ?, ?, ? );";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            stmt.setString(1, animal.getNome());
            stmt.setString(2, animal.getEspecie());
            stmt.setString(3, animal.getSexo());
            stmt.setString(4, animal.getCaracteristica());
            stmt.setString(5, animal.getDataCadastro());
            stmt.setString(6, animal.getDataNascimento());
            stmt.setInt(7, animal.getCodigoDono());
            stmt.execute();
            this.conexao.commit();
        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }
    }

    @Override
    public void saveAll(List<Animal> animais) throws SQLException {
        query = "insert into animal( nome, especie, sexo, caracteristica, data_cadastro, data_nascimento, codigo_dono) " +
                "values ( ?, ?, ?, ?, ?, ?, ? );";
        for (Animal animal : animais) {
            try {
                PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
                stmt.setString(1, animal.getNome());
                stmt.setString(2, animal.getEspecie());
                stmt.setString(3, animal.getSexo());
                stmt.setString(4, animal.getCaracteristica());
                stmt.setString(5, animal.getDataCadastro());
                stmt.setString(6, animal.getDataNascimento());
                stmt.setInt(7, animal.getCodigoDono());
                stmt.execute();
            } catch (SQLException e) {
                this.conexao.rollback();
                throw e;
            }
        }
        this.conexao.commit();
    }


    @Override
    public void update(Animal animal) throws SQLException {
        query = "update animal set nome = ? where codigo = ?;";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            stmt.setString(1, animal.getNome());
            stmt.setInt(2, animal.getCodigo());
            stmt.executeUpdate();
            this.conexao.commit();
        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }
    }

    @Override
    public List<Animal> findAll() throws SQLException {
        query = "SELECT * from animal;";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            ResultSet resultSet = stmt.executeQuery();
            List<Animal> animais = new ArrayList<>();
            while (resultSet.next()) {
                Animal animal = new Animal(
                        resultSet.getInt("codigo"),
                        resultSet.getString("nome"),
                        resultSet.getString("especie"),
                        resultSet.getString("sexo"),
                        resultSet.getString("caracteristica"),
                        resultSet.getString("data_cadastro"),
                        resultSet.getString("data_nascimento"),
                        resultSet.getInt("codigo_dono"));
                animais.add(animal);
            }
            return animais;
        } catch (SQLException se) {
            throw se;
        }
    }

    @Override
    public Animal findById(int id) throws SQLException {
        query = "select * from animal where codigo = ?;";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();
            if (resultSet.next()) {
                return new Animal(resultSet.getInt("codigo"),
                        resultSet.getString("nome"),
                        resultSet.getString("especie"),
                        resultSet.getString("sexo"),
                        resultSet.getString("caracteristica"),
                        resultSet.getString("data_cadastro"),
                        resultSet.getString("data_nascimento"),
                        resultSet.getInt("codigo_dono"));
            }
        } catch (SQLException se) {
            throw se;
        }
        return null;
    }

    @Override
    public void delete(int id) throws SQLException {
        query = "DELETE FROM animal WHERE codigo = ?;";
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


