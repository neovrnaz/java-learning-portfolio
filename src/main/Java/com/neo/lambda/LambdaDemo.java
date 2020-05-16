package com.neo.lambda;


interface A {
     void show();
}

interface B {
    void show(int i);
}


//   We are using this class only once so why even create a class?
//   |
class Xyz implements A {
    public void show() {
        System.out.println("Hello");
    }
}



public class LambdaDemo {
    public static void main(String[] args) {

        A obj;
        obj = new A() {
//                              This block of code here is called an Anonymous Inner Class
//                                 |
            public void show() {
                System.out.println("");
            }
        };
        obj.show();


        B obj2;
        obj2 = i -> System.out.println("B " + i);

        obj2.show(5);

    }

}
