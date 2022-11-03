package com.trustwave.barista_matic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.trustwave.factory.Drink;
import com.trustwave.factory.IngredientEnum;

public class Inventory {

    List<IngredientEnum> ingredients;

    public Inventory() {
        ingredients = new ArrayList<IngredientEnum>();
        ingredients.add(IngredientEnum.COCOA);
        ingredients.add(IngredientEnum.COFFEE);
        ingredients.add(IngredientEnum.CREAM);
        ingredients.add(IngredientEnum.DECAF_COFFEE);
        ingredients.add(IngredientEnum.ESPRESSO);
        ingredients.add(IngredientEnum.FOAMED_MILK);
        ingredients.add(IngredientEnum.STEAMED_MILK);
        ingredients.add(IngredientEnum.SUGAR);
        ingredients.add(IngredientEnum.WHIPPED_CREAM);

        Collections.sort(ingredients);
    }

    public void restock() {
        ingredients.clear();
        IngredientEnum cocoa = IngredientEnum.COCOA;
        cocoa.setQuantity(10);
        ingredients.add(cocoa);
        IngredientEnum coffee = IngredientEnum.COFFEE;
        coffee.setQuantity(10);
        ingredients.add(coffee);
        IngredientEnum cream = IngredientEnum.CREAM;
        cream.setQuantity(10);
        ingredients.add(cream);
        IngredientEnum decaf = IngredientEnum.DECAF_COFFEE;
        decaf.setQuantity(10);
        ingredients.add(decaf);
        IngredientEnum espresso = IngredientEnum.ESPRESSO;
        espresso.setQuantity(10);
        ingredients.add(espresso);
        IngredientEnum foamed = IngredientEnum.FOAMED_MILK;
        foamed.setQuantity(10);
        ingredients.add(foamed);
        IngredientEnum steam = IngredientEnum.STEAMED_MILK;
        steam.setQuantity(10);
        ingredients.add(steam);
        IngredientEnum sugar = IngredientEnum.SUGAR;
        sugar.setQuantity(10);
        ingredients.add(sugar);
        IngredientEnum whip = IngredientEnum.WHIPPED_CREAM;
        whip.setQuantity(10);
        ingredients.add(whip);

        Collections.sort(ingredients);
    }

    public void display() {
        System.out.println("Inventory :");
        for (IngredientEnum ingredient : this.ingredients) {
            System.out.printf("%s,%d\n", ingredient.getName(), ingredient.getQuantity());
        }
    }

    public List<IngredientEnum> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<IngredientEnum> ingredients) {
        this.ingredients = ingredients;
    }

    public boolean canDispence(Drink d) {
        if (d.isAvailable(ingredients)) {
            System.out.println("Dispensing : " + d.getName());
            for (IngredientEnum i : d.getIngredients()) {
                IngredientEnum in = ingredients.get(ingredients.indexOf(i));
                in.setQuantity(in.getQuantity() - i.getQuantity());
            }
            return true;
        }
        return false;
    }
}
