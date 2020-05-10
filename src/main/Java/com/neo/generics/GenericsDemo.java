package com.neo.generics;

//  Generics enable types (classes and interfaces) to be parameters when defining classes, interfaces and methods.
//  Type parameters provide a way for you to reuse the same code with different inputs.


import java.util.ArrayList;

class Container<T> {
    public String Student;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    T value;

    public void show() {
        System.out.println(value.getClass().getName());
    }

    public void demo(ArrayList<? extends Number> obj) {
//                                  |
//                               If you say extends, the question mark would be a subclass of Number
//                               If you say super, the question mark would be a super class of Number

    }


}

public class GenericsDemo {

    public static void main(String[] args) {


//                  These only work with classes. They do not work with data types.
//                   |
        Container<Integer> obj = new Container<>();
//                  |
//              This extends number class. Is you go to declaration, you will see that Integer extends the "Number" class.
//              If you want the "T" in "class Container<T>" to only support numbers, then you should add "extends Numbers at the end of "T".
//              Example: class Container<T extends Numbers>


        obj.value = 9;
        obj.show();
        obj.demo(new ArrayList<Number>());

    }
}
