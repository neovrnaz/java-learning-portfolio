package com.neo.composition_vs_inheritence.apartment;

public class Room {
    private Bed bed;
    private Plant plant;
    private Properties properties;
    private Chair chair;
    private Couch couch;




    public Room(Plant plant, Properties properties, Bed bed, Chair chair, Couch couch) {
        this.bed = bed;
        this.plant = plant;
        this.properties = properties;
        this.chair = chair;
        this.couch = couch;
    }

    public void showRoom() {
        System.out.println("Welcome to this apartment tour \n -------- \n This apartment contains... ");
    }










}
