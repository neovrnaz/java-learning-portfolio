package com.neo.super_method;

//   This is a super class
//    |
class A {
    public A() {
        System.out.println("in A");
    }

    public A(int i) {
        System.out.println("in A with int");
    }
}

//    class B is a subclass now that it extends A
//    |
class B extends A {
    public B() {

//  Even if you don't call super here, it will still be given by the compiler
//         |
        super();
        System.out.println("in B");
    }

    public B(int i) {

//      Super is saying that it will call the constructor of the super class. Notice,
//      if you put an int in here, it will call the second constructor of the super class
//        |
        super(i);
        System.out.println("in B with int");
    }
}

public class SuperDemo {

    public static void main(String[] args) {

//     Notice how B calls A and B. When you create an object from a subclass,
//     it will also call the constructor from the super class
//      |
        B obj2 = new B();
    }
}
