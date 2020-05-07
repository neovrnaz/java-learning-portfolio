package com.neo.util_scanner;

import java.util.Scanner;


class DayOfMonthSuffix {

    public int dayOfMonth = 23;

    public int addSuffix() {

        if (dayOfMonth > 31) {
            System.out.println("Invalid Input");
            System.exit(1);
        }
        if (dayOfMonth <= 0) {
            System.out.println("Invalid Input");
            System.exit(1);
        } return dayOfMonth;
    }
}


public class ScannerDemo {

    DayOfMonthSuffix suffix = new DayOfMonthSuffix();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String dayOfWeek = scanner.nextLine();
        System.out.println(dayOfWeek + " " );

    }
}


