package com.neo.composition_vs_inheritence.house;

public class Plant {

    String color;
    int size;
    int weight;
    int height;

    public Plant(String color, int size, int weight, int height, int diameter) {
        this.color = color;
        this.size = size;
        this.weight = weight;
        this.height = height;
        this.diameter = diameter;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    int diameter;






}
