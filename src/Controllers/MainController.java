package Controllers;

import DTOs.AdministratorDTO;
import DTOs.OrderDTO;
import Models.Entitys.Orders.Order;
import Models.Entitys.Users.Administrator;
import Services.*;

public class MainController {
    private final OrderService orderService;
    private final IAdmService admService;
    private AdministratorDTO currentAdm;

    public MainController() {
        orderService = new OrderService();
        admService = AdmServiceProxy.getInstance();
    }

    public Administrator administratorLogin(AdministratorDTO requestedAdm){
        var adm = admService.loginAdministrator(requestedAdm);

        if (adm == null)
            return null;

        currentAdm = requestedAdm;
        return adm;
    }

    public void administratorLogout(){
        currentAdm = null;
    }

    public Order createOrder(OrderDTO order) {
        if (currentAdm == null)
            return null;
        return orderService.CreateOrder(order);
    }

    public Order getOrderByCustomerContact(String contact) {
        if (currentAdm == null)
            return null;
        return orderService.getOrderByCustomerContact(contact);
    }

    public Boolean UpdateOrder(Order order) {
        if (currentAdm == null)
            return false;
        return orderService.updateOrder(order);
    }

    public Boolean deleteOrder(String contact) {
        if (currentAdm == null)
            return false;
        return orderService.deleteOrder(contact);
    }
}