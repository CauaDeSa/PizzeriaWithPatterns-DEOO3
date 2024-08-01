package Models.Dao;

import Models.Entitys.Orders.Order;

import java.util.List;

public interface IOrderDao {
    Order insert(Order order);
    Boolean update(Order order);
    Boolean delete(String contact);
    List<Order> getAll();
    Order getByCustomerContact(String customerName);
}