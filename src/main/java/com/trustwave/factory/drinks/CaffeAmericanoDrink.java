package com.trustwave.factory.drinks;

import java.util.List;

import com.trustwave.factory.Drink;
import com.trustwave.factory.Ingredient;

public class CaffeAmericanoDrink extends Drink {

    public CaffeAmericanoDrink(List<Ingredient> ingredients) {
        super("Caffe Americano", ingredients);
    }
}
