package com.trustwave.barista_matic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.trustwave.factory.Drink;
import com.trustwave.factory.Ingredient;
import com.trustwave.factory.ingredients.Cocoa;
import com.trustwave.factory.ingredients.Coffee;
import com.trustwave.factory.ingredients.Cream;
import com.trustwave.factory.ingredients.DecafCoffee;
import com.trustwave.factory.ingredients.Espresso;
import com.trustwave.factory.ingredients.FoamedMilk;
import com.trustwave.factory.ingredients.SteamedMilk;
import com.trustwave.factory.ingredients.Sugar;
import com.trustwave.factory.ingredients.WhippedCream;

public class Inventory {

    List<Ingredient> ingredients;

    public Inventory() {
        ingredients = new ArrayList<Ingredient>();

        ingredients.add(new Cocoa(10));
        ingredients.add(new Coffee(10));
        ingredients.add(new Cream(10));
        ingredients.add(new DecafCoffee(10));
        ingredients.add(new Espresso(10));
        ingredients.add(new FoamedMilk(10));
        ingredients.add(new SteamedMilk(10));
        ingredients.add(new Sugar(10));
        ingredients.add(new WhippedCream(10));

        Collections.sort(ingredients);
    }

    public void display() {
        System.out.println("Inventory :");
        for (Ingredient ingredient : this.ingredients) {
            System.out.printf("%s,%d\n", ingredient.getName(), ingredient.getQuantity());
        }
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public boolean canDispence(Drink d) {
        if (d.isAvailable(ingredients)) {
            System.out.println("Dispensing : " + d.getName());
            for (Ingredient i : d.getIngredients()) {
                Ingredient in = ingredients.get(ingredients.indexOf(i));
                in.setQuantity(in.getQuantity() - i.getQuantity());
            }
            return true;
        }
        return false;
    }
}
