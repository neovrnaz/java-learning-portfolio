package com.neo.arrays.generics.java_generics;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GenericsApplication {

//  <T> Types
//  <E> Element (Usually paired with ArrayList)
//  <K> Key (Usually paired with HashMap)
//  <V> Value (Usually paried with HashMap)


//  Generics keep the promise, to allow the developer to be flexable, without sacrificing type safety

    public static void main(String[] args) {
        Container<Integer, String> container = new Container<Integer, String>(12, "Hello");



        int val1 = container.getItem1();
        String val2 = container.getItem2();

        Set<String> mySet1 = new HashSet<String>();
        mySet1.add("first");
        mySet1.add("second");
        mySet1.add("laptop");

        Set<String> mySet2 = new HashSet<String>();
        mySet2.add("first");
        mySet2.add("second");
        mySet2.add("desktop");

        Set<String> resultSet = union(mySet1, mySet2);
        Iterator<String> itr = resultSet.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

//             This is a completely generic method

//      We have to specify that we will use <E> in the method. We are defining the type parameters.
//               \     This is the return value
//                \     |
    public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
        Set<E> result = new HashSet<E>(set1);
        result.addAll(set2);
        return result;

    }


}
