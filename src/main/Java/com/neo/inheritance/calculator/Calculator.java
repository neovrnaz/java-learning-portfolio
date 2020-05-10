package com.neo.inheritance.calculator;

import java.util.Scanner;

public class Calculator {

    TreeData a = new TreeData();


    public void Cal() {

        double cm = 2.54;
        long inches = 12;
        long feet = 20;
        long days = 365;
        long years = 20;
        long rate;



        try {
            rate = (long) (cm * inches * feet * days * years);
            System.out.println(rate);
        }

        catch (Exception e) {

            System.out.println("INVALID INPUT");
        }

    }





}
