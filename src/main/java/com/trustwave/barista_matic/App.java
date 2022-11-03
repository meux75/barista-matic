package com.trustwave.barista_matic;

import java.util.Scanner;

public class App {
    static Inventory inventory = new Inventory();
    static Menu menu = new Menu();

    public static void main(String[] args) {
        inventory.restock();
        inventory.display();
        menu.drinkFactory();
        menu.display();
        do {
            System.out.println("Enter Option >");
            String input = new Scanner(System.in).nextLine();
            boolean validInput = true;

            if (!input.isEmpty()) {
                // char c = (input.length() > 1) ? 0 : input.toLowerCase().charAt(0);

                if ("q".equalsIgnoreCase(input)) {
                    System.exit(0);
                }

                if ("r".equalsIgnoreCase(input)) {
                    inventory.restock();
                } else {
                    validInput = false;
                }
                if (validInput) {
                    inventory.display();
                    // menu.display();
                } else {
                    System.out.println("Invalid selection: " + input);
                }
            }
        } while (true);
    }
}