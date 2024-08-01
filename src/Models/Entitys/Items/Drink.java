package Models.Entitys.Items;

public class Drink extends Item {
    public Drink(String name, double price) {
        super(name, price);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String toString(){
        return  "Drink: " + name + " | Price: " + price;
    }
}