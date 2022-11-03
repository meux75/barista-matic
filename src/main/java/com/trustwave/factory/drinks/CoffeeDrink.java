package com.trustwave.factory.drinks;

import java.util.List;

import com.trustwave.factory.Drink;
import com.trustwave.factory.Ingredient;

public class CoffeeDrink extends Drink{

    public CoffeeDrink(List<Ingredient> ingredients){
        super("Coffee", ingredients);
    }
}
