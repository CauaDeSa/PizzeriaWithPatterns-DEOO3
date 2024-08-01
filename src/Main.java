import Controllers.MainController;
import DTOs.AdministratorDTO;
import DTOs.OrderDTO;
import Models.Entitys.Items.Drink;
import Models.Entitys.Items.Item;
import Models.Entitys.Items.Pizza;
import Models.Enums.PizzaFlavor;
import Services.Factories.AdmFactoryImpl;
import Services.Factories.CustomerFactoryImpl;
import Services.Factories.IUserFactory;
import Models.Entitys.Users.User;

public class Main {
    public static void main(String[] args) {
        MainController mainController = new MainController();
        IUserFactory customerFactory = new CustomerFactoryImpl();
        IUserFactory admFactory = new AdmFactoryImpl();

        //Creating adminstrator with factory and saving at database
        var likeThis = admFactory.Create("Caua", "Caua@", "Password");

        //Adm login
        System.out.println(
                mainController.administratorLogin(new AdministratorDTO("Caua@", "Password")) != null ? "Successfully logged in!" : "Something went wrong"
        );

        //Creating order and saving at database
        User user = customerFactory.Create("Ednilson", "016");
        Item coca = new Drink("Coca-cola 2L", 10.0);
        OrderDTO newOrder = new OrderDTO(user, coca);

        System.out.println("\nNew Order\n\n" + mainController.createOrder(newOrder));

        //Editing order
        var rescuedOrder = mainController.getOrderByCustomerContact("016");
        var antartic = new Drink("Antartic 1.5L", 9.0);
        var ednilsonPizza = new Pizza(PizzaFlavor.FOUR_CHEESES, 40.0);

        System.out.println("\nPizza before alter: " + ednilsonPizza);
        ednilsonPizza.addFlavor(PizzaFlavor.BROCCOLI);
        System.out.println("\nPizza after alter: " + ednilsonPizza);

        //Adding item
        rescuedOrder.addItem(antartic);
        rescuedOrder.addItem(ednilsonPizza);
        mainController.UpdateOrder(rescuedOrder);
        System.out.println("\nOrder after inserts\n\n" + rescuedOrder);

        //Removing item
        rescuedOrder.removeItem(coca);
        mainController.UpdateOrder(rescuedOrder);
        System.out.println("\nOrder after removes\n\n" + rescuedOrder);

        System.out.println();

        //Deleting order
        System.out.println(mainController.deleteOrder(rescuedOrder.getOwner().getContact()) ? "Order successfully deleted" : "Error deleting order");

        //Adm logout
        mainController.administratorLogout();
        System.out.println("\nLogging out...");
        if (mainController.getOrderByCustomerContact("016") == null)
            System.out.println("\nAccess denied, please try logging in");
    }
}