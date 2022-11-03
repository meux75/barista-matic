package com.trustwave.barista_matic;

import java.util.Scanner;

public class App {
    static Inventory inventory = new Inventory();
    static Menu menu = new Menu();

    public static void main(String[] args) {
        inventory.display();
        menu.drinkFactory();
        menu.display(inventory);
        do {
            System.out.println("Enter Option >");
            String input = new Scanner(System.in).nextLine();
            boolean validInput = true;

            if (!input.isEmpty()) {
                if ("q".equalsIgnoreCase(input)) {
                    System.exit(0);
                }

                if ("r".equalsIgnoreCase(input)) {
                    inventory = new Inventory();
                } else {
                    int in = -1;
                    try {
                        in = Integer.parseInt(input);
                        validInput = menu.dispense(in, inventory);
                    } catch (Exception e) {
                        validInput = false;
                    }
                }
                if (validInput) {
                    inventory.display();
                    menu.display(inventory);
                } else {
                    System.out.println("Invalid selection: " + input);
                }
            }
        } while (true);
    }
}