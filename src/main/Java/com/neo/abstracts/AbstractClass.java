package com.neo.abstracts;

public class AbstractClass {


    public static void main(String[] args) {

//                            You can't instantiate an abstract class, but you can instantiate a non abstract class
//                              |
        JohnPhone obj = new AlexPhone();
        obj.call();
    }
}


abstract class JohnPhone {
    public void call() {
        System.out.println("calling");
    }
    public abstract void move();
    public abstract void dance();
    public abstract void cook();
}


//  Abstract class
abstract class GeorgePhone extends JohnPhone {
    public void move() {
        System.out.println("Moving...");
    }
}


//  Concrete class
class AlexPhone extends GeorgePhone {
    public void dance() {
        System.out.println("Dancing...");
    }

    public void cook() {
        System.out.println("Cooking...");
    }
}