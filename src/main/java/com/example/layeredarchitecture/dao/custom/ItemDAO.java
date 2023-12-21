package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.dao.CrudDAO;
import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO extends CrudDAO<ItemDTO> {
    /* ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException ;
     boolean saveItem(ItemDTO dto) throws SQLException, ClassNotFoundException ;
     void updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException ;

     void deleteItem(String id) throws SQLException, ClassNotFoundException ;

     boolean existItem(String code) throws SQLException, ClassNotFoundException ;
     String generateNewId() throws SQLException, ClassNotFoundException;
      ArrayList<ItemDTO> searchItem(String id) throws SQLException, ClassNotFoundException;
      ArrayList<ItemDTO>getAllItemIds() throws SQLException, ClassNotFoundException;*/
     boolean updateItemqty(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;
     ItemDTO findItem(String newItemCode) throws SQLException, ClassNotFoundException;
}
