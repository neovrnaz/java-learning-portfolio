package com.neo.arrays;

public class EnhancedFor {

    public static void main(String[] args) {
        int[] alice = {3,4,5,6,7,8,9,10,11};

        for (int element : alice) {
            System.out.println(element * element);
        }
    }
}
