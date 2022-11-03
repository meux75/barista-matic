package com.trustwave.factory;

import java.util.ArrayList;
import java.util.List;

public class DrinkFactory {
    public Drink getDrink(DrinkEnum type) {

        switch (type) {
            case COFFEE: {
                List<Ingredient> ingredients = new ArrayList<Ingredient>();
                ingredients.add(new Coffee(3));
                ingredients.add(new Cream(1));
                ingredients.add(new Sugar(1));

                return new CoffeeDrink(ingredients);
            }
            case DECAF_COFFEE: {
                List<Ingredient> ingredients = new ArrayList<Ingredient>();
                ingredients.add(new Coffee(3));
                ingredients.add(new Cream(1));
                ingredients.add(new Sugar(1));

                return new DecafCoffeeDrink(ingredients);
            }
            case CAFFE_LATTE: {
                List<Ingredient> ingredients = new ArrayList<Ingredient>();
                ingredients.add(new Espresso(2));
                ingredients.add(new SteamedMilk(1));

                return new CaffeLatteDrink(ingredients);
            }
            case CAFFE_AMERICANO: {
                List<Ingredient> ingredients = new ArrayList<Ingredient>();
                ingredients.add(new Espresso(3));

                return new CaffeAmericanoDrink(ingredients);
            }
            case CAFFE_MOCHA: {
                List<Ingredient> ingredients = new ArrayList<Ingredient>();
                ingredients.add(new Espresso(1));
                ingredients.add(new Cocoa(1));
                ingredients.add(new WhippedCream(1));
                ingredients.add(new SteamedMilk(1));

                return new CaffeMochaDrink(ingredients);
            }
            case CAPPUCCINO: {
                List<Ingredient> ingredients = new ArrayList<Ingredient>();
                ingredients.add(new Espresso(2));
                ingredients.add(new FoamedMilk(1));
                ingredients.add(new SteamedMilk(1));

                return new CappuccinoDrink(ingredients);
            }
        }

        return null;
    }
}
