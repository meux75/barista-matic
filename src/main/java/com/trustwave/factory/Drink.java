package com.trustwave.factory;

import java.util.List;

public abstract class Drink implements Comparable<Drink>{
    private int number;
    private String name;
    private List<IngredientEnum> ingredients;
    public List<IngredientEnum> getIngredients() {
        return ingredients;
    }

    private float cost;

    @Override
    public int compareTo(Drink o) {
       return this.name.compareTo(o.getName());
    }

    public int getNumber() {
        return number;
    }

    public void setIngredients(List<IngredientEnum> ingredients) {
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

    public abstract void despensingDrink();

    private void computeCost(){
        for (IngredientEnum ingredient : ingredients) {
            cost += ingredient.getCost() * ingredient.getQuantity();
        }

    }
    public float getCost() {
        return cost;
    }

    public boolean isAvailable(List<IngredientEnum> inventory){
        if (inventory == null || inventory.isEmpty()) {
            return false;
        }

        for (IngredientEnum i : this.ingredients) {
            if (inventory.contains(i)) {
                IngredientEnum in = inventory.get(inventory.indexOf(i));
                if (in.getQuantity() < i.getQuantity()) {
                    return false;
                }
            }else {
                return false;
            }
        }

        return true;
    }
}
