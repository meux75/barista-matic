package com.trustwave.factory;

public enum IngredientEnum{

    COFFEE("Coffee", 0.75f, 10),
    DECAF_COFFEE("Decaf Coffee", 0.75f,10),
    SUGAR("Sugar", 0.25f,10),
    CREAM("Cream",0.25f,10),
    STEAMED_MILK("Steamed Milk",0.35f,10),
    FOAMED_MILK("Foamed Milk",0.35f,10),
    ESPRESSO("Espresso", 1.10f,10),
    COCOA("Cocoa", 0.90f,10),
    WHIPPED_CREAM("Whipped Cream", 1.00f,10);

    private float cost;
    public float getCost() {
        return cost;
    }
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    private String name;

    public String getName() {
        return name;
    }

    IngredientEnum(String name, Float cost, int quantity) {
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }

    public boolean isAvailable(int needQuantity){
        if (this.quantity >= needQuantity) {
            return true;
        }
        return false;
    }

}
