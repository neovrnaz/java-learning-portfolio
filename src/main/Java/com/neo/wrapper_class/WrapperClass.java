package com.neo.wrapper_class;

import java.util.ArrayList;
import java.util.Arrays;

public class WrapperClass {
    public static void main(String[] args) {
        // Autoboxing is the automatic conversion that the
        // Java compiler makes between the primitive types
        // and their corresponding object wrapper classes.

        int i = 5;


        ArrayList<Integer> myList = new ArrayList<Integer>(5);
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(50);
        myList.remove(0);

        for (Integer x : myList) {
            System.out.println(x);

            System.out.println("Size = " + myList.size());
        }

        Integer ii = new Integer(i); // Boxing
        Integer jj = i;              // Autoboxing

        int j = jj.intValue();       // Unboxing
        int k = jj;                  // Auto unboxing


        ArrayList<Integer> values = new ArrayList<Integer>();
        values.add(5);
        values.add(7);

    }
}
