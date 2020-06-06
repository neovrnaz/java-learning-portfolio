package com.neo.generics.learn_generics.after_generics;

public class NumericFunctions<T extends Number> {
    T obj;

    public NumericFunctions(T obj) {
        this.obj = obj;
    }

    double square() {
        return obj.intValue() * obj.doubleValue();
    }
}
