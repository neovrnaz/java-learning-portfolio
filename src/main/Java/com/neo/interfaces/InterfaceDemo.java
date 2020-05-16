package com.neo.interfaces;

/*
    There are 3 types of interfaces
    1.  Marker -> without any methods or constants
    2.  Functional(SAM) -> Single abstract method
    3.  Normal
 */

//  Interface is a block, like abstract class, except every method will be public and abstract


interface Dbc {
    void show();
}

class DbcImpl implements Dbc {
    public void show() {
        System.out.println("in DbcImpl show()");
    }
}


interface yyy {}


//        Interface supports multiple inheritance. e.g extends Dbc,yyy
//         |
interface Abc {
    void show();
}


public class InterfaceDemo {


    public static void main(String[] args) {
        Dbc obj1 = new DbcImpl();


//                     You cannot instantiate Abc without implementation
//                       |
        Abc obj = new Abc() {
            public void show() {
                System.out.println("in show");
            }
        };

        Abc obj2 = () -> System.out.println("Lambda in show");




        obj.show();
        obj2.show();
    }
}

