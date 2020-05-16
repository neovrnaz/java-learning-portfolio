package com.neo.composition_vs_inheritence.apartment;

public class Couch {
    private String color;
    private String brand;


    Dimensions dimensions = new Dimensions(5, 12, 4);


    public void showCouch() {
        System.out.println("- A " + color + " " + brand + ". The dimensions are " + dimensions);
    }

    public Couch(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

}
