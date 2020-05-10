package com.neo.arrays.iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {

    public static void main(String[] args) {
        ArrayList <Integer> list1 = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++)
            list1.add((int) (Math.random() * 10) +1 );

        System.out.println("ArrayList: ");
        for (Iterator<Integer> i = list1.iterator(); i.hasNext(); ) {
            System.out.println(i.next() + " ");
        }
        System.out.println();



    }
}
