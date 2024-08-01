package Services;

import DTOs.OrderDTO;
import Models.Dao.OrderDaoImpl;
import Models.Entitys.Orders.Order;

public class OrderService {
    private final AdmServiceProxy admServiceProxy;
    private final OrderDaoImpl instance;

    public OrderService() {
        admServiceProxy = AdmServiceProxy.getInstance();
        instance = OrderDaoImpl.getInstance();
    }

    public Order CreateOrder(OrderDTO orderDTO) {
        Order order = new Order(admServiceProxy.getLastAccess(), orderDTO.getOwner(), orderDTO.getItem());
        return instance.insert(order);
    }

    public Order getOrderByCustomerContact(String contact) {
        return instance.getByCustomerContact(contact);
    }

    public Boolean updateOrder(Order order) {
        order.setAttendant(admServiceProxy.getLastAccess());
        return instance.update(order);
    }

    public Boolean deleteOrder(String contact) {
        return instance.delete(contact);
    }
}