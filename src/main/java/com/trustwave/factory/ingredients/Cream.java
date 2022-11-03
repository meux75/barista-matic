package com.trustwave.factory.ingredients;

import com.trustwave.factory.Ingredient;

public class Cream extends Ingredient {
    public Cream(int quantity) {
        super("Cream", (float) 0.25, quantity);
    }

}
