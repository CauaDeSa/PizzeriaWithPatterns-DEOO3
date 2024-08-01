package Models.Dao;

import Models.Entitys.Orders.Order;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderDaoImpl implements IOrderDao {
    private static OrderDaoImpl instance;
    private final Map<String, Order> orders;

    private OrderDaoImpl() {
        orders = new HashMap<>();
    }

    public static OrderDaoImpl getInstance() {
        if (instance == null) {
            instance = new OrderDaoImpl();
        }
        return instance;
    }

    @Override
    public Order insert(Order order) {
        return orders.putIfAbsent(order.getOwner().getContact(), order) == null ? order : null;
    }

    @Override
    public Boolean update(Order order) {
        return orders.put(order.getOwner().getContact(), order) != null;
    }

    @Override
    public Boolean delete(String contact) {
        return orders.remove(contact) != null;
    }

    @Override
    public List<Order> getAll() {
        return new ArrayList<>(orders.values());
    }

    @Override
    public Order getByCustomerContact(String customerPhone) {
        return orders.get(customerPhone);
    }
}