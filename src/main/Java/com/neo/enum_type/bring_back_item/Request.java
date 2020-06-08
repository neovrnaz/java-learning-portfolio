package com.neo.enum_type.bring_back_item;

import java.util.Scanner;

import static com.neo.enum_type.bring_back_item.ChineseMenu.*;

public class Request {

    static ChineseMenu thisItem = ChineseMenu.item;


    // Used price of each item to find the given menu item and prints out item along with price
    public static void getPrice() {
        switch (thisItem) {
            case SOUP_CHICKEN:
                System.out.println(SOUP_CHICKEN + " costs " + ChineseMenu.valueOf(19));
                break;

            case SOUP_VEGETABLE:
                System.out.println(SOUP_VEGETABLE + " costs " + ChineseMenu.valueOf(18));

            default:
                System.out.println();

        }
    }

    public void menuOptions() {

        // Instantiate ChineseMenu with priceOfSoupChicken and then assigning to to priceOfItem so that we may getValue
        ChineseMenu priceOfSoupChicken = SOUP_CHICKEN;
        int priceOfItem = priceOfSoupChicken.getValue();

        System.out.println("\nOriental Menu:");
        System.out.println("┏┳┳┳┳┳┳┳┳┳┳┳┳┳┳┳┳┳┳┳┳┳┳┓");
        System.out.println("╿  1. Soup Chicken     ╿");
        System.out.println("╿  2. Vegetable Soup   ╿");
        System.out.println("╿  3. Chicken Noodles  ╿");
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━┛\n");

        System.out.println("Employee says: \"Hello there! Please select one of our menu options\"\n");
        System.out.print("I would like a number: ");

        Scanner scanner = new Scanner(System.in);
        int pickedItem = scanner.nextInt();
        String additionalItem = scanner.nextLine();
        if (pickedItem == 1) {
            System.out.println("\n" + ChineseMenu.valueOf(19) + " COSTS $" + priceOfItem);
        } else if (pickedItem == 2) {
            System.out.println("\n" + ChineseMenu.valueOf(18) + " COSTS $" + priceOfItem);
        } else if (pickedItem == 3) {
            System.out.println("\n" + ChineseMenu.valueOf(21) + " COSTS $" + priceOfItem);
        } else {
            System.out.println("I'm not sure that item is on the menu. Would you like a spring roll instead?");
            System.out.println("Please answer \"yes\" for a spring roll");
            if (scanner.nextLine().equals("yes")) {
                System.out.println("Okay, " + ChineseMenu.valueOf(5) + " COSTS $" + priceOfItem);
            } else {
                System.out.println("Oh okay :( Come again later...");
            }
        }

    }

}
