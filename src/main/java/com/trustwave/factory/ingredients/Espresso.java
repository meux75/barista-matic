package com.trustwave.factory.ingredients;

import com.trustwave.factory.Ingredient;

public class Espresso extends Ingredient {
    public Espresso(int quantity) {
		super("Espresso", (float) 1.10, quantity);
	}

}
