package com.neo.composition_vs_inheritence.apartment;

public class Plant {

    String color;
    int size;
    int weight;
    int height;
    int diameter;


    public void showPlant() {
        System.out.println("- A plant that's " + color + " with a height of " + height + " and a diameter of " + diameter);
    }

    public Plant(String color, int size, int weight, int height, int diameter) {
        this.color = color;
        this.size = size;
        this.weight = weight;
        this.height = height;
        this.diameter = diameter;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public int getDiameter() {
        return diameter;
    }
}
