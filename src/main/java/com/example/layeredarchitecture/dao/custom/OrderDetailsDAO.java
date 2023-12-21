package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.dao.CrudDAO;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface OrderDetailsDAO extends CrudDAO<OrderDetailDTO> {
     boolean saveOrderDetail(String orderId, OrderDetailDTO orderDetails) throws SQLException, ClassNotFoundException;
}
