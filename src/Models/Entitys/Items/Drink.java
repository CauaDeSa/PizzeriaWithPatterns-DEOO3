package Models.Entitys.Items;

public class Drink extends Item {
    public Drink(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}