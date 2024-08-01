package Services;

import DTOs.OrderDTO;
import Models.Entitys.Orders.Order;
import Models.Entitys.Users.User;

public interface IOrderService {
    Order CreateOrder(User attendant, OrderDTO dto);
}