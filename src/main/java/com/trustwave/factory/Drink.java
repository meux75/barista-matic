package com.trustwave.factory;

import java.util.List;

public abstract class Drink implements Comparable<Drink> {
    private int number;
    private String name;
    private List<Ingredient> ingredients;

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public Drink(String name, List<Ingredient> ingredients) {
        super();
        this.name = name;
        this.ingredients = ingredients;
        computeCost();
    }

    private float cost;

    @Override
    public int compareTo(Drink o) {
        return this.name.compareTo(o.getName());
    }

    public int getNumber() {
        return number;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
        computeCost();
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void computeCost() {
        for (Ingredient ingredient : ingredients) {
            this.cost += (ingredient.getUnitCost() * ingredient.getQuantity());
        }
    }

    public float getCost() {
        return cost;
    }

    public boolean isAvailable(List<Ingredient> inventory) {
        if (inventory == null || inventory.isEmpty()) {
            return false;
        }

        for (Ingredient i : this.ingredients) {
            if (inventory.contains(i)) {
                Ingredient in = inventory.get(inventory.indexOf(i));
                if (in.getQuantity() < i.getQuantity()) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
