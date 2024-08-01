package DTOs;

import Models.Entitys.Items.Item;
import Models.Entitys.Users.User;

public class OrderDTO {
    private final User owner;
    private final Item item;

    public OrderDTO(User owner, Item item) {
        this.owner = owner;
        this.item = item;
    }

    public User getOwner() {
        return owner;
    }

    public Item getItem() {
        return item;
    }
}