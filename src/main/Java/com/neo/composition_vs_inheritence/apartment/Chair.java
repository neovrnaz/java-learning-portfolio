package com.neo.composition_vs_inheritence.apartment;

public class Chair {
    String color;
    String material;

    public void showChair() {
        System.out.println("- A " + color + material + " chair ");
    }


    public Chair(String color, String material) {
        this.color = color;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }
}
