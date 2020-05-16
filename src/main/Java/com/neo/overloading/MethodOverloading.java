package com.neo.overloading;

class MethodOverloading {

    int num1;
    int num2;
    String operation;


    //   ⌄⌄⌄⌄ Constructor Overloading ⌄⌄⌄⌄
    public MethodOverloading() {
        num1 = 0;
        num2 = 0;
        operation = "Nothing";
    }

    public MethodOverloading(int i) {
        num1 = i;
        num2 = 0;
        operation = "Nothing";
    }

    public MethodOverloading(int i, int k, String op) {
        num1 = i;
        num2 = k;
        operation = op;
    }
//   ⌃⌃⌃⌃ Constructor Overloading ⌃⌃⌃⌃


    //     ⌄⌄⌄⌄ Method Overloading ⌄⌄⌄⌄
    public void add(int i, int k) {

        System.out.println(i + k);
    }

    public void add(double i, double k) {

        System.out.println(i + k);
    }

    public void add(int i, int k, String op) {

        System.out.println(i + k + op);
    }
//     ⌃⌃⌃⌃ Method Overloading ⌃⌃⌃⌃

}
