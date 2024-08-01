package Models.Entitys.Items;

public abstract class Item {
    protected int id;
    protected String name;
    protected double price;

    public Item(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public abstract int getId();
    public abstract String getName();
    public abstract double getPrice();
}