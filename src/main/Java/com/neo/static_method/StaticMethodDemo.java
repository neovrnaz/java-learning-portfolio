package com.neo.static_method;



class A {


//  Instance variables belong to instances
//  An instance variable requires an instance of an object
    int num1;

//  A static variable is called a class variable
//  We do not need an object to access a class variable (But you need class reference to / You are not supposed to access a class variable via an object
//  Why do we not need an object to access class variables?
//  A: Static variables belongs to class and not objects (They are called class variables). It is shared by each and every instance or object of the class.
//  A class variable will be shared amoung all the methods
    public static int num2;
//    |
//   Class variables should never be public


    public static void show() {
        num2 = 9;
    }

//  A non static variable can not go into a static method


//          static means fixed
//            |
    public static void increment() {
        num2++;
    }
}


public class StaticMethodDemo {

    public static void main(String[] args) {


//  You can't declare a variable as static inside a method because it would not be able to be used outside of the method
//          Any variable declared within a method is meant to be local to that method
//            |
        int test;


//        You can not declare a variable as static in ANY method. Static variables have to be declared at class level
//          |
        int test2;


        A.num2 = 5;


        A obj1 = new A();
        A obj2 = new A();
        A obj3 = new A();

        obj1.num1=2;
        obj2.num1=3;
        obj3.num1=4;

        A.num2 =2;
        obj2.num2=3;
        obj3.num2=4;


    }
}
