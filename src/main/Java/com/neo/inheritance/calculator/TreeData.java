package com.neo.inheritance.calculator;


public class TreeData extends Calculator {



//  Growth rate is medium, 20 feet over a 20 year period
//  12 inches in a foot
//  2.54 cm in an inch
//  365 days in year
//  365 * 20 = days in 20 year period

//  2.54cm * 12in * 20feet * 365days * 20years = total number of inches

    static public class Data {

        static double cm = 2.54;
        static int inches = 12;
        static int feet = 20;
        static int days = 365;
        static int years = 20;
        static long rate;



    }


}
