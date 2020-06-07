package com.neo.hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {

//                               HashSet doesn't allow for duplicates but ArrayList does
//                                  |
        Set<Integer> mySet = new HashSet<Integer>();
        List<String> details = Arrays.asList(
                "Name",
                "Description",
                "Tools",
                "Years Experience",
                "References",
                "Objective"
        );

        int k = 100;
        Integer it1 = new Integer(k);

        int m = it1.intValue();
        System.out.println(m*m); // prints 10000

        mySet.add(1);

        mySet.add(2);
        mySet.add(3);
        mySet.add(4);
        mySet.add(5);
        mySet.add(6);
        mySet.add(7);
        mySet.add(8);
        mySet.add(9);
        mySet.add(10);

        for (Integer anInt: mySet) {
            System.out.println(anInt);
        }
    }
}
