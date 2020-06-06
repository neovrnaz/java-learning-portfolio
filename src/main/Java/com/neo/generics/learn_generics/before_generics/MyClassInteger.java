package com.neo.generics.learn_generics.before_generics;

public class MyClassInteger {


//                      Integer vs int
//    Use "Integer" when you want to treat int like any other object
//      |
    Integer i;

    MyClassInteger(Integer i) {
        this.i = i;
    }

    void printStuff() {
        System.out.println(i);
    }

}
