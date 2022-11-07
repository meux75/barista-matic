package com.trustwave.barista_matic;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.trustwave.factory.Ingredient;

/**
 * Unit test for App.
 */
public class AppTest {
    Inventory inventory;
    Menu menu;

    @Before
    public void setUp() {
        inventory = new Inventory();
        menu = new Menu();
        menu.drinkFactory();
    }

    @Test
    public void inventoryDisplayTest() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String expectedOutput = """
                    Inventory :
                    Cocoa,10
                    Coffee,10
                    Cream,10
                    Decaf Coffee,10
                    Espresso,10
                    Foamed Milk,10
                    Steamed Milk,10
                    Sugar,10
                    Whipped Cream,10
                """;

        inventory.display();

        Assert.assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void menuDisplayTest() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String expectedOutput = """
                    Menu:
                    1,Caffe Americano,$3.30,true
                    2,Caffe Mocha,$3.35,true
                    3,Caffee Latte,$2.55,true
                    4,Cappuccino,$2.90,true
                    5,Coffee,$2.75,true
                    6,Decaf Coffee,$2.75,true
                """;
        menu.display(inventory);

        Assert.assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void invalidInputTest() {
        assertTrue(false == menu.dispense(9, inventory));
    }

    @Test
    public void validInputTest() {
        assertTrue(menu.dispense(1, inventory));
    }

    @Test
    public void espressoIngredientTest() {

        assertTrue(inventory.getIngredients().stream()
                .filter(in -> in.getName().equalsIgnoreCase("espresso"))
                .mapToInt(iq -> iq.getQuantity())
                .sum() == 10);
    }

    @Test
    public void dispenseEspressoIngredientTest() {

        assertTrue(menu.dispense(1, inventory));
        assertTrue(inventory.getIngredients().stream()
                .filter(in -> in.getName().equalsIgnoreCase("espresso"))
                .mapToInt(iq -> iq.getQuantity())
                .sum() == 7);
        assertTrue(menu.dispense(1, inventory));
        assertTrue(menu.dispense(1, inventory));
        assertFalse(menu.dispense(1, inventory));
    }
}
