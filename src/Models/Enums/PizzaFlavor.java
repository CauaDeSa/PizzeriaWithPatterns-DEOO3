package Models.Enums;

import Models.Entitys.Items.IPizzaFlavor;

public enum PizzaFlavor implements IPizzaFlavor {
    MARGHERITA("Magherita"),
    CALABRESA("Calabresa"),
    CHICKEN_WITH_CATUPIRY("Chicken with catupiry"),
    PORTUGUESE("Portuguese"),
    TUNA("Tuna"),
    FOUR_CHEESES("Four cheese"),
    BROCCOLI("Broccoli");

    private final String flavor;

    PizzaFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String getFlavor() {
        return flavor;
    }
}