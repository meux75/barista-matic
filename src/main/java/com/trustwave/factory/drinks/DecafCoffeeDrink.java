package com.trustwave.factory.drinks;

import java.util.List;

import com.trustwave.factory.Drink;
import com.trustwave.factory.Ingredient;

public class DecafCoffeeDrink extends Drink {

    public DecafCoffeeDrink(List<Ingredient> ingredients) {
        super("Decaf Coffee", ingredients);
    }
}
