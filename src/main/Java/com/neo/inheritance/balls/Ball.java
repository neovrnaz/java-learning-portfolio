package com.neo.inheritance.balls;


//  Polymorphism - At it's simpilest, polymorphism simply refers to overloading. Two methods with the same name, but with slightly different parameters


//  A super class does not have to be fully implemented

public class Ball {

    protected String kind;
    private String color;
    private int size;
    public int position;

    public Ball(String kin, String col, int sz) {
        kind = kin;
        color = col;
        size = sz;
        position = 0;
    }


    public void kick() {
        position += 3;
    }

    public String toString() {
        return "This " + kind + " is " + color + " and a size of " + size + " at a position of " + position;
    }

}

