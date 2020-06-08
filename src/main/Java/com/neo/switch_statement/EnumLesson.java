package com.neo.switch_statement;

import java.util.Scanner;

public class EnumLesson {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter score here -> ");

        switch (scanner.nextInt()) {
// If the entered number matches the number inside case, it will print out a positive rating.
// Otherwise, it will print out "not good"
            case 90:
                System.out.println("Score is very good!");

//              break means that this statement will end
//                |
                break;
            case 80:
                System.out.println("Score is good");
            case 70:
                System.out.println("Score is average");
            case 60:
                System.out.println("Score is below average");
            default:
                System.out.println("Score is not good");
                break;
        }
    }
}
