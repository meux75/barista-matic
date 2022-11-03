package com.trustwave.barista_matic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.trustwave.factory.Drink;
import com.trustwave.factory.DrinkEnum;
import com.trustwave.factory.DrinkFactory;

public class Menu {
    List<Drink> drinkItems;
    DrinkFactory factory;

    public Menu() {
        drinkItems = new ArrayList<Drink>();
        factory = new DrinkFactory();

    }

    public void drinkFactory() {
        drinkItems.add(factory.getDrink(DrinkEnum.COFFEE));
        drinkItems.add(factory.getDrink(DrinkEnum.DECAF_COFFEE));
        drinkItems.add(factory.getDrink(DrinkEnum.CAFFE_AMERICANO));
        drinkItems.add(factory.getDrink(DrinkEnum.CAFFE_LATTE));
        drinkItems.add(factory.getDrink(DrinkEnum.CAFFE_MOCHA));
        drinkItems.add(factory.getDrink(DrinkEnum.CAPPUCCINO));

        Collections.sort(drinkItems);
        for (Drink drink : drinkItems) {
            drink.setNumber(drinkItems.indexOf(drink) + 1);
        }
    }

    public void display(Inventory inventory) {
        System.out.println("Menu:");
        for (Drink drink : drinkItems) {
            System.out.printf("%d,%s,$%.2f,%s\n", drink.getNumber(), drink.getName(), drink.getCost(), drink.isAvailable(inventory.getIngredients()));
        }
    }

    public boolean dispense(int i, Inventory inventory){
        if ((i) > drinkItems.size() || i < 1) {
            return false;
        }

        Drink d = drinkItems.get(i-1);
        return inventory.canDispence(d);
    }

}
