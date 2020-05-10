package com.neo.arrays.generics;

import java.util.ArrayList;

public class GenericsApp {

    public static void main(String[] args) {

        ArrayList myList = new ArrayList();
        myList.add("Hello World");
        myList.add(3);
        myList.add(false);


        String myValue = (String) myList.get(0);
        Integer myValue2 = (Integer) myList.get(1);

        System.out.println(myValue);
        System.out.println(myValue2);

//        System.out.println(myList);
    }
}
