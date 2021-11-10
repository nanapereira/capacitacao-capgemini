package com.br.orientacaooo.model.dao;

import java.sql.SQLException;
import java.util.List;

public interface GenericDAO<T> {

    void save(T t) throws SQLException;

    void update(T t) throws SQLException;

   void delete(int id) throws SQLException;

    List<T> findAll() throws SQLException;

    T findById(int id) throws SQLException;

}
