package com.neo.inheritance.plants;

public class SweetBirch extends Plant {

//  Growth rate is medium, 20 feet over a 20 year period
//  12 inches in a foot
//  2.54 cm in an inch
//  365 days in year
//  365 * 20 = days in 20 year period

//  2.54cm * 12in * 20feet * 365days * 20years = total number of inches



    public static int rate = 0;
    String pokeweedPlant = "Sweet Birch";

    public void sweetBirchGrowth() {
        System.out.println("The " + pokeweedPlant + " plant grows at a rate of " + rate + "cm per day");

    }
}
