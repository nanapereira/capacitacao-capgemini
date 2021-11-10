package br.com.zoo.model.dao;

import java.sql.SQLException;
import java.util.List;

public interface GenericDAO<T> {

    void save(T t) throws SQLException;

    void saveAll(List<T> t) throws SQLException, ClassNotFoundException;

    void update(T t) throws SQLException;

    List<T> findAll() throws SQLException;

    T findById(int id) throws SQLException;

    void delete(int id) throws SQLException;

}
