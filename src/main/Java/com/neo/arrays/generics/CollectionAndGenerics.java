package com.neo.arrays.generics;

import java.util.ArrayList;
import java.util.Collection;



public class CollectionAndGenerics {

    public static void main(String[] args) {


//        int[] values = new int[4];
//        Object[] values1 = new Object[4];
//        values1[0] = "George";
//        values1[1] = 7;

//                  This concept of mentioning which kind of data you have is called Generics
//                    |                               |
        Collection<Integer> values = new ArrayList<Integer>();
        values.add(3);
//        values.add("Jack");
//        values.add(5.8f);
        values.add(77);
        values.add(88);

        values.add(9);

//          This is an old way of doing it.
//    This can be traded for the enhanced for loop

//        Iterator i = values.iterator();
//
//        while (i.hasNext()) {
//            System.out.println(i.next());
//        }



        for (Integer i : values) {
            System.out.println(i);
        }

    }
}
