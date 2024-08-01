package Models.Entitys.Items;

import java.util.List;

public class Pizza extends Item implements IPizzaFlavor {
    private List<IPizzaFlavor> flavors;

    public Pizza(int id, String name, double price) {
        super(id, name, price);
    }

    public void addFlavor(IPizzaFlavor f) {
        flavors.add(f);
    }

    public void removeFlavor(IPizzaFlavor f) {
        flavors.remove(f);
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

    @Override
    public String getFlavor() {
        StringBuilder f = new StringBuilder();

        for(IPizzaFlavor flavor : this.flavors) {
            f.append(flavor.getFlavor());
        }

        return f.toString();
    }
}