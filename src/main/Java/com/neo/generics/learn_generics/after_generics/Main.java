package com.neo.generics.learn_generics.after_generics;


//  Problem: We are repeating ourselves in before_generics.MyClassDouble and before_generics.MyClassInteger ect.

//  Solution: Integer. We can create just one class that takes different types of variables


public class Main {

    public static void main(String[] args) {

//  Now when we want to initialize a class we would go...
        NumericFunctions<Integer> iObj = new NumericFunctions<>(3);
        System.out.println(iObj.square());

    }
}
