package com.neo.enum_type.ticket_booth;

import java.util.Scanner;

public class Main {
    static AgeLimit age;

    public Main(AgeLimit age) {
        Main.age = age;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creates an objects for minor and adult, that are to be used with price listings
        AgeLimit minor = AgeLimit.MINOR_MAX;
        AgeLimit adult = AgeLimit.ADULT_MAX;


        // Creates a ticketCostRange object to be used with price listings
        Main ticketCostRange = new Main(age);
        ticketCostRange.getTicketCostForAge(AgeLimit.ADULT_MAX);

        // Lists the prices for minors and adults
        System.out.println("Minor Pays: $" + ticketCostRange.getTicketCostForAge(minor));
        System.out.println("Adult Pays: $" + ticketCostRange.getTicketCostForAge(adult));

        System.out.println("How old are you? -> ");

        // Scanner to check person's age and how much they are to pay
        int realAge = scanner.nextInt();
        System.out.println("\nI am " + realAge + " years old!\n");
        if (realAge <= 17) {
            System.out.println("You pay: $" + TicketCostRange.MINOR_TICKET_COST.getTicketCost());
        } else if (realAge >= 18 && realAge <= 59) {
            System.out.println("You pay: $" + TicketCostRange.ADULT_TICKET_COST.getTicketCost());
        } else if (realAge >= 59 && realAge < 110) {
            System.out.println("You pay: $" + TicketCostRange.SENIOR_TICKET_COST.getTicketCost());
        } else {
            System.out.println("You can't be that old");
        }
    }


    // Java switch. Checks age and gets back the respective ticket cost
    public int getTicketCostForAge(AgeLimit ageLimit) {
        switch (ageLimit) {
            case MINOR_MAX:
                return TicketCostRange.MINOR_TICKET_COST.getTicketCost();

            case ADULT_MAX:
                return TicketCostRange.ADULT_TICKET_COST.getTicketCost();

            default:
                return TicketCostRange.SENIOR_TICKET_COST.getTicketCost();
        }
    }

}