package com.neo.composition_vs_inheritence.apartment;

public class Bed {
    private String blanketColor;
    private String brand;
    private String size;


    public void showBed() {
        System.out.println("- A " + size + " size " + brand + " mattress with a " + blanketColor + " blanket");
    }

    public Bed(String blanketColor, String brand, String size) {
        this.blanketColor = blanketColor;
        this.brand = brand;
        this.size = size;
    }

    public String getBlanketColor() {
        return blanketColor;
    }

    public String getBrand() {
        return brand;
    }

    public String getSize() {
        return size;
    }
}
