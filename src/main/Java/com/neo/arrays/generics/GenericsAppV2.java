package com.neo.arrays.generics;

import java.util.ArrayList;

public class GenericsAppV2 {

//  Classes and Abstract classes are considered types

    public static void main(String[] args) {

//                                        This allows for more type safety. If you try to use myList.add()
//              Angle Brackets                with any data type other than String, you will get an error
//                |     |                             |
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Hello World");



        String myValue = (String) myList.get(0);

        System.out.println(myValue);

//        System.out.println(myList);
    }
}
