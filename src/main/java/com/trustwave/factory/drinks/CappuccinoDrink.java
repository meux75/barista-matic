package com.trustwave.factory.drinks;

import java.util.List;

import com.trustwave.factory.Drink;
import com.trustwave.factory.Ingredient;

public class CappuccinoDrink extends Drink {

    public CappuccinoDrink(List<Ingredient> ingredients) {
        super("Cappuccino", ingredients);
    }
}
