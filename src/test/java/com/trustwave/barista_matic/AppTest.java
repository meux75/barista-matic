package com.trustwave.barista_matic;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.trustwave.factory.Ingredient;

/**
 * Unit test for App.
 */
public class AppTest 
{
    Inventory inventory;
    Menu menu;

    @Before
    public void setUp(){
        inventory = new Inventory();
        menu = new Menu();
        menu.drinkFactory();
    }

    @Test
    public void inventoryDisplayTest(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String expectedOutput = "Inventory :\n" +
                "Cocoa,10\n" +
                "Coffee,10\n" +
                "Cream,10\n" +
                "Decaf Coffee,10\n" +
                "Espresso,10\n" +
                "Foamed Milk,10\n" +
                "Steamed Milk,10\n" +
                "Sugar,10\n" +
                "Whipped Cream,10\n";

        inventory.display();

        Assert.assertEquals(expectedOutput, outContent.toString());        
    }

    @Test
    public void menuDisplayTest(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String expectedOutput = "Menu:\n" +
                "1,Caffe Americano,$3.30,true\n" +
                "2,Caffe Mocha,$3.35,true\n" +
                "3,Caffee Latte,$2.55,true\n" +
                "4,Cappuccino,$2.90,true\n" +
                "5,Coffee,$2.75,true\n" +
                "6,Decaf Coffee,$2.75,true\n";

        menu.display(inventory);

        Assert.assertEquals(expectedOutput, outContent.toString());        
    }

    @Test
    public void invalidInputTest()
    {
        assertTrue( false == menu.dispense(9, inventory) );
    }

    @Test
    public void validInputTest()
    {
        assertTrue( menu.dispense(1, inventory) );
    }

    @Test
    public void espressoIngredientTest(){
        int espressoQuantity = 0;
        for (Ingredient i : inventory.getIngredients()) {
            if( i.getName().compareToIgnoreCase("espresso") == 0 ){
                espressoQuantity = i.getQuantity();
            }
        }
        
        assertTrue( espressoQuantity == 10 );
    }

    @Test
    public void dispenseEspressoIngredientTest(){
        assertTrue( menu.dispense(1, inventory) );
        int espressoQuantity = 0;
        for (Ingredient i : inventory.getIngredients()) {
            if( i.getName().compareToIgnoreCase("espresso") == 0 ){
                espressoQuantity = i.getQuantity();
            }
        }
        assertTrue( espressoQuantity == 7 );
        assertTrue( menu.dispense(1, inventory) );
        assertTrue( menu.dispense(1, inventory) );
        assertFalse( menu.dispense(1, inventory) );
    }
}
