package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CrudDAO <T>{
    ArrayList<T> getAll() throws SQLException, ClassNotFoundException ;
    boolean save(T dto) throws SQLException, ClassNotFoundException ;

    void update(T dto) throws SQLException, ClassNotFoundException ;

    void delete(String id) throws SQLException, ClassNotFoundException ;

    boolean exit(String id) throws SQLException, ClassNotFoundException ;
    String generateNewId() throws SQLException, ClassNotFoundException;

    ArrayList<T> search(String id) throws SQLException, ClassNotFoundException ;

    ArrayList<T> getAllIds() throws SQLException, ClassNotFoundException;
}