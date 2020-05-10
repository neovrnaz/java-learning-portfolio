package com.neo.arrays.iterators;

import java.util.ArrayList;
import java.util.ListIterator;

public class NextPrevious {
    public static void main(String[] args) {

        ArrayList <Integer> list1 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        ListIterator<Integer> i = list1.listIterator();

        for( ; i.hasNext(); ) {
            System.out.print(i.next() + " ");
        }
        System.out.println("\n");

        for( ; i.hasPrevious(); ) {
            System.out.print(i.previous() + " ");
        }
        System.out.println("\n");


    }

}
