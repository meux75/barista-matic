package com.trustwave.factory.ingredients;

import com.trustwave.factory.Ingredient;

public class Coffee extends Ingredient{

    public Coffee(int quantity) {
		super("Coffee", (float) 0.75,  quantity);
	}
    
}
