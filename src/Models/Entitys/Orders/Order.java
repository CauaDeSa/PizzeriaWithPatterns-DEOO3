package Models.Entitys.Order;

import Models.Entitys.Items.Item;
import Models.Entitys.Users.User;

import java.util.List;

public class Order {
    private final int id;
    private final User owner;
    private List<Item> items;

    public Order(int id, User owner) {
        this.id = id;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public User getOwner() {
        return owner;
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
}