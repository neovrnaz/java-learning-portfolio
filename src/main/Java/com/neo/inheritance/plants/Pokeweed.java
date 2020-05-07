package com.neo.inheritance.plants;

public class Pokeweed extends Plant {

    public static int rate = 0;
    String pokeweedPlant = "Pokeweed";

    public void pokeweedGrowth() {
        System.out.println("The " + pokeweedPlant + " plant grows at a rate of " + rate + "cm per day");

    }
}
