package com.example.layeredarchitecture.dao;


import java.sql.SQLException;


public interface OrderDAO {
     String generateNewId() throws SQLException, ClassNotFoundException;


}
