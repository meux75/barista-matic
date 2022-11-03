package com.trustwave.factory.drinks;

import java.util.List;

import com.trustwave.factory.Drink;
import com.trustwave.factory.Ingredient;

public class CaffeMochaDrink extends Drink {

    public CaffeMochaDrink(List<Ingredient> ingredients) {
        super("Caffe Mocha", ingredients);
    }
}
