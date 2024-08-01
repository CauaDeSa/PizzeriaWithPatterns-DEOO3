package Models.Entitys.Items;

import Models.Enums.PizzaFlavor;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends Item implements IPizzaFlavor {
    private List<IPizzaFlavor> flavors;

    public Pizza(PizzaFlavor flavor, double price) {
        super(flavor.getFlavor() + " Pizza", price);
        this.flavors = new ArrayList<IPizzaFlavor>();
        this.flavors.add(flavor);
    }

    public void addFlavor(IPizzaFlavor f) {
        flavors.add(f);
        name = getFlavor() + " Pizza";
        price += 15;
    }

    public void removeFlavor(IPizzaFlavor f) {
        flavors.remove(f);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getFlavor() {
        StringBuilder f = new StringBuilder("\n");
        int size = this.flavors.size();

        for (int i = 0; i < size; i++) {
            f.append(this.flavors.get(i).getFlavor());

            if (size > 1 && i == 0) {
                f.append(" and ");
            }
        }

        return f.toString();
    }

    public String toString() {
        return name + " | " + getPrice();
    }
}