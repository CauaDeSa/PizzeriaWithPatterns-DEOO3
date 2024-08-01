package Models.Entitys.Orders;

import Models.Entitys.Items.Item;
import Models.Entitys.Users.User;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private User attendant;
    private final User owner;
    private List<Item> items;

    public Order(User attendant, User owner, Item item) {
        this.attendant = attendant;
        this.owner = owner;
        this.items = new ArrayList<>();
        this.items.add(item);
    }

    public void setAttendant(User attendant) {
        this.attendant = attendant;
    }

    public User getOwner() {
        return owner;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public String toString() {
        return  owner.getName() + " order"  +
                "\nMade by.: " + attendant.getName() +
                "\nContact.: " + owner.getContact() +
                "\n\nOrder items\n" + items.toString();
    }
}