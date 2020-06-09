package com.neo.calculator;


import java.util.Scanner;

public class Calculator {

// A calculator that divides two numbers

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter num1 ");

        int x = 1;

        do {
            try {
                int num1 = scanner.nextInt();
                System.out.println("Enter num2 ");
                int num2 = scanner.nextInt();

                int num3 = num1 / num2;
                System.out.println(num3);
                x = 2;
            }
            catch (Exception e) {
                System.out.println("INVALID USER INPUT \n");
                try
                {
                    Thread.sleep(1000);
                }
                catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Enter num1 ");
            }
        } while (x == 1);

    }
}
