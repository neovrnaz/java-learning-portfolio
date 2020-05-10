package com.neo.arrays.iterators;

import java.util.*;


public class CollectionClasses {

//  You can do all this with a simple for loop in IteratorDemo2

    public static void main(String[] args) {

        List <Integer> list1 = new ArrayList<Integer>();
        List <Double> list2 = new LinkedList<Double>();
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Double> set2 = new TreeSet<Double>();

        for (int i = 0; i < 10; i++) {

            //  Array list fill 10 Integers 1 - 10
            list1.add((int) (Math.random() * 10) + 1);

            //  Array list fill 10 Doubles 0 - .99
            list2.add(((int) (Math.random() * 100)) / 100.0);

            //  Hashset fill 10 (As long as there are no duplicates) Integers 1 - 10
            set1.add((int) (Math.random() * 10) + 1);

            //  TreeSet fill 10 (As long as there are no duplicates) Doubles 0 - 99
            set2.add(((int) (Math.random() * 100)) / 100.0);

        }

        Iterator <Integer> here1 = list1.iterator();
        Iterator <Double> here2 = list2.iterator();
        Iterator <Integer> here3 = set1.iterator();
        Iterator <Double> here4 = set2.iterator();


        System.out.println("ArrayList: ");
        while (here1.hasNext()) {
            System.out.println(here1.next() + " ");
        }

        System.out.println("\n\nLinkedList: ");
        while (here2.hasNext()) {
            System.out.println(here2.next() + " ");
        }

        System.out.println("\n\nHashSet: ");
        while (here3.hasNext()) {
            System.out.println(here3.next() + " ");
        }

        System.out.println("\n\nTreeSet: ");
        while (here4.hasNext()) {
            System.out.println(here4.next() + " ");
        }

    }
}
