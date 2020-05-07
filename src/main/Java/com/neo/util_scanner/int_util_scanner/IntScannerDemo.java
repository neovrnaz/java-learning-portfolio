package com.neo.util_scanner.int_util_scanner;

//                Class
//                  |
import java.util.Scanner;
//           |
//        Package

//  When using the Scanner class, one must create a scanner object

public class IntScannerDemo {

    public static void main(String[] args) {

//      Name of class            Constructor
//         |                   /             \
        Scanner scanner = new Scanner(System.in);
//                 |                      |
//            Object Name               Telling the scanner where it's going to get it's information from (the keyboard)




        int days = 0;

        System.out.println("How many days has the plant been growing for? ");


//                         Scans the next token of the input as an int
//                           |
        while (!scanner.hasNextInt()) {
            System.out.println("Please try again");
            scanner.next();

            if (days <= 0) {
                System.out.println("Your plant hasen't grown at all :(");
            }
            if (days >= 30) {
                System.out.println("Your plant can't grow for much longer");
                System.exit(0);
            }
        }

        days = scanner.nextInt();

        System.out.println("The plant has been growing for " + days + " days");


    }
}




