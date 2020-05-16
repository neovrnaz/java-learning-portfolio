package com.neo.composition_vs_inheritence.apartment;

public class Properties {

    private String location;
    private String type;
    private int price;

    public void showProperties() {
        System.out.println("- A " + type + " located in " + location + " for " + price);
    }


    public Properties(String location, int price, String type) {
        this.location = location;
        this.price = price;
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}
