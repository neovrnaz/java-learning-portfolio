package com.neo.composition_vs_inheritence.computer;

public class Main {

    public static void main(String[] args) {

//  This is the result of composition

        Dimensions dimensions = new Dimensions("20", "20", "5");
        Case theCase = new Case("220B", "Dell", "240", dimensions);


//                                                                                           If you don't need to create a varible because you won't be using
//                                                                                           it for anything else, you only want to pass it into a method.
//                                                                                           So that's created a class without using a variable
//                                                                                                  |
        Monitor theMonitor = new Monitor("27in Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherBoard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherBoard);

        thePC.powerUp();


    }
}
