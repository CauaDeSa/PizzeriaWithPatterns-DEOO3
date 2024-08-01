package Services;

import DTOs.OrderDTO;
import Models.Dao.OrderDaoImpl;
import Models.Entitys.Orders.Order;
import Models.Entitys.Users.Customer;
import Models.Entitys.Users.User;

public class OrderService implements IOrderService {
    private final OrderDaoImpl instance;

    public OrderService() {
        instance = OrderDaoImpl.getInstance();
    }

    public Order CreateOrder(User attendant, OrderDTO orderDTO) {
        Customer owner = new Customer(0, orderDTO.getOwnerName(), orderDTO.getOwnerPhone());
        Order order = new Order(attendant, owner);
        return instance.insert(order);
    }
}