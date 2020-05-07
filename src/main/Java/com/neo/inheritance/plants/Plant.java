package com.neo.inheritance.plants;

import java.util.Scanner;


//            Plant is a superclass
//             |
public class Plant {

    public void grow() {

        Scanner scanner = new Scanner(System.in);
        Pokeweed pokeweed = new Pokeweed();
        SweetBirch sweetBirch = new SweetBirch();

        sweetBirch.sweetBirchGrowth();


        System.out.println("How many days has your plant been growing for?: ");
        while (!scanner.hasNextInt()) {
            scanner.nextInt();
            System.out.println("Invalid format. Please try again: ");
        }
        int days = scanner.nextInt();
        System.out.println("Your plant has been growing for " + days + "days \n");


        int growth = days * Pokeweed.rate;
        System.out.println("Your plant is " + growth + "cm high!");
    }
}
