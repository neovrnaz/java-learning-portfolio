package com.neo.composition_vs_inheritence.apartment;


public class Main {

    public static void main(String[] args) {



        Dimensions dimensions = new Dimensions(10, 15, 10);

        Plant thePlant = new Plant("green", 5, 10, 3, 2);
        Couch theCouch = new Couch("tan", "Lazy Boy");
        Bed theBed = new Bed("blue", "Temper Pedic", "queen");
        Chair theChair = new Chair("gray", "wood");
        Properties theProperties = new Properties("SD", 1200, "studio");


        Room theRoom = new Room(thePlant, theProperties, theBed, theChair, theCouch);

        theRoom.showRoom();
        theCouch.showCouch();
        thePlant.showPlant();
        theBed.showBed();
        theChair.showChair();
        theProperties.showProperties();


    }
}
