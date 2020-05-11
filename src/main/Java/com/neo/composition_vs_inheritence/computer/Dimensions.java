package com.neo.composition_vs_inheritence.computer;

public class Dimensions {
     private String width;
     private String height;
     private String depth;

    public Dimensions(String width, String height, String depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public String getWidth() {
        return width;
    }

    public String getHeight() {
        return height;
    }

    public String getDepth() {
        return depth;
    }
}
