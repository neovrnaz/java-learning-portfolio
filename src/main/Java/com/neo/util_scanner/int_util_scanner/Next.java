package com.neo.util_scanner.int_util_scanner;

import java.util.Scanner;

public class Next {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your age: ");


        while (!scanner.hasNextInt()) {
            System.out.println("Please try again");
            scanner.next();
        }
        int age = scanner.nextInt();


        System.out.println("Your age is: " + age);



    }
}
