package com.neo.arrays.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {


    public static void main(String[] args) {

//  Iterators store and return objects.
//  Iterators are a simple way to loop through different data structures.
//  Iterators do not start on a value, they start before a value. So you can think of them as in between values.

//                    When you create it, it's not actually on the 15, it's before the 15
//                    |
//       list ==   ⎮ 15 ⎮ 22 ⎮ 19 ⎮ 99 ⎮
//                /      \              \
//      Where it's      .next() moves       When you are here and you use
//      actually at          it here             .remove(), it removes 99


//      Iterate over an array list
//          |
//          |
        ArrayList<Integer>list = new ArrayList<Integer>();


        list.add(15);
        list.add(22);
        list.add(10);
        list.add(99);

//                              You don't say new list.iterator. The reason for this is because there are different implementations, for the different data structures,
//                               |                                   that it can iterate through. A hash set wouldn't implement it in the same way an array would
        Iterator<Integer>here = list.iterator();
        while(here.hasNext()) {
        System.out.println(" here.next() " + here.next());
        }
        System.out.println("\n");


        for (Iterator<Integer> there = list.iterator(); there.hasNext();) {
            Integer i =  there.next();
            System.out.println("Looping through i: " + i);
        }
        System.out.println("\n");


        ListIterator everywhere = list.listIterator();

        System.out.println("nextIndex = " + everywhere.nextIndex());
        System.out.println("previousIndex = " + everywhere.previousIndex());
        System.out.println("\n");


        System.out.println("list = " + list + "\n");
        System.out.println("indexOf(22) = " + list.indexOf(22));



    }
}
