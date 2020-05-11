package com.neo.arrays.generics.java_generics;

//  THE CONVENTION IS TO USE CAPITAL LETTERS.
//  The convention was broken here (To prove a point that you can have any variable inside of the angle brackets)



//              A class is a blueprint, a template, a specification of what a Container is
//                |      Now, i1 and i2 is capable of being any kind of object. It is completly generic
//               |         |
public class Container<i1, i2> {

    i1 item1;
    i2 item2;


    public Container(i1 item1, i2 item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public void printItems() {

        System.out.println("Printing items of a container");
        System.out.println("Item 1: " + item1);
        System.out.println("Item 2: " + item2);
    }

    public i1 getItem1() {
        return item1;
    }

    public void setItem1(i1 item1) {
        this.item1 = item1;
    }

    public i2 getItem2() {
        return item2;
    }

    public void setItem2(i2 item2) {
        this.item2 = item2;
    }

}
