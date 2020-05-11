package com.neo.composition_vs_inheritence.car;

public class Car extends Vehicle {

//  The statement "Car is a vehicle" is correct when dealing with Inheritence
//  The statemnt "Car has a relationship with a vehicle" is correct when dealing with Composition

    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
