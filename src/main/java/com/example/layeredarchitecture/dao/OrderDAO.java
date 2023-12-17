package com.example.layeredarchitecture.dao;


import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;


public interface OrderDAO {
     String generateNewId() throws SQLException, ClassNotFoundException;

      boolean existsOrderid(String orderId, Connection connection) throws SQLException, ClassNotFoundException;
      boolean saveOrder(String orderId, LocalDate orderDate, String customerId, Connection connection) throws SQLException, ClassNotFoundException;
}
