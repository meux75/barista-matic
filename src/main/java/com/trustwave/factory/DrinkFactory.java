package com.trustwave.factory;

import java.util.ArrayList;
import java.util.List;

public class DrinkFactory {
    public Drink getDrink(DrinkEnum type) {

        switch (type) {
            case COFFEE: {
                List<IngredientEnum> coffeeIngredients = new ArrayList<IngredientEnum>();
                IngredientEnum coffee = IngredientEnum.COFFEE;
                IngredientEnum sugar = IngredientEnum.SUGAR;
                IngredientEnum cream = IngredientEnum.CREAM;
                coffee.setQuantity(3);
                sugar.setQuantity(1);
                cream.setQuantity(1);
                coffeeIngredients.add(coffee);
                coffeeIngredients.add(cream);
                coffeeIngredients.add(sugar);

                CoffeeDrink coffeeDrink = new CoffeeDrink();
                coffeeDrink.setName("Coffee");
                coffeeDrink.setIngredients(coffeeIngredients);

                return coffeeDrink;
            }
            case DECAF_COFFEE: {
                List<IngredientEnum> coffeeIngredients = new ArrayList<IngredientEnum>();
                IngredientEnum coffee = IngredientEnum.DECAF_COFFEE;
                IngredientEnum sugar = IngredientEnum.SUGAR;
                IngredientEnum cream = IngredientEnum.CREAM;
                coffee.setQuantity(3);
                sugar.setQuantity(1);
                cream.setQuantity(1);
                coffeeIngredients.add(coffee);
                coffeeIngredients.add(cream);
                coffeeIngredients.add(sugar);

                DecafCoffeeDrink decafCoffeeDrink = new DecafCoffeeDrink();
                decafCoffeeDrink.setName("Decaf Coffee");
                decafCoffeeDrink.setIngredients(coffeeIngredients);

                return decafCoffeeDrink;
            }
            case CAFFE_LATTE: {
                List<IngredientEnum> coffeeIngredients = new ArrayList<IngredientEnum>();
                IngredientEnum espresso = IngredientEnum.ESPRESSO;
                IngredientEnum steamMilk = IngredientEnum.STEAMED_MILK;
                espresso.setQuantity(2);
                steamMilk.setQuantity(1);
                coffeeIngredients.add(espresso);
                coffeeIngredients.add(steamMilk);

                CaffeLatteDrink caffeLatteDrink = new CaffeLatteDrink();
                caffeLatteDrink.setName("Caffe Latte");
                caffeLatteDrink.setIngredients(coffeeIngredients);

                return caffeLatteDrink;
            }
            case CAFFE_AMERICANO: {
                List<IngredientEnum> coffeeIngredients = new ArrayList<IngredientEnum>();
                IngredientEnum espresso = IngredientEnum.ESPRESSO;
                espresso.setQuantity(3);
                coffeeIngredients.add(espresso);

                CaffeAmericanoDrink caffeAmericanoDrink = new CaffeAmericanoDrink();
                caffeAmericanoDrink.setName("Caffe Americano");
                caffeAmericanoDrink.setIngredients(coffeeIngredients);

                return caffeAmericanoDrink;
            }
            case CAFFE_MOCHA: {
                List<IngredientEnum> coffeeIngredients = new ArrayList<IngredientEnum>();
                IngredientEnum espresso = IngredientEnum.ESPRESSO;
                IngredientEnum cocoa = IngredientEnum.COCOA;
                IngredientEnum steamedMilk = IngredientEnum.STEAMED_MILK;
                IngredientEnum whippedCream = IngredientEnum.WHIPPED_CREAM;
                espresso.setQuantity(1);
                cocoa.setQuantity(1);
                steamedMilk.setQuantity(1);
                whippedCream.setQuantity(1);
                coffeeIngredients.add(espresso);
                coffeeIngredients.add(steamedMilk);
                coffeeIngredients.add(whippedCream);
                coffeeIngredients.add(cocoa);

                CaffeMochaDrink caffeMochaDrink = new CaffeMochaDrink();
                caffeMochaDrink.setName("Caffe Mocha");
                caffeMochaDrink.setIngredients(coffeeIngredients);

                return caffeMochaDrink;
            }
            case CAPPUCCINO: {
                List<IngredientEnum> coffeeIngredients = new ArrayList<IngredientEnum>();
                IngredientEnum espresso = IngredientEnum.ESPRESSO;
                IngredientEnum steamedMilk = IngredientEnum.STEAMED_MILK;
                IngredientEnum foamedMilk = IngredientEnum.FOAMED_MILK;
                espresso.setQuantity(2);
                steamedMilk.setQuantity(1);
                foamedMilk.setQuantity(1);
                coffeeIngredients.add(espresso);
                coffeeIngredients.add(foamedMilk);
                coffeeIngredients.add(steamedMilk);

                CappuccinoDrink cappuccino = new CappuccinoDrink();
                cappuccino.setName("Cappuccino");
                cappuccino.setIngredients(coffeeIngredients);

                return cappuccino;
            }
        }

        return null;
    }
}
