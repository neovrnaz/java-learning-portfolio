package com.neo.casting;


class Test {

    public void show(int i) {
        System.out.println(i);
    }
}


public class CastingDemo {

    public static void main(String[] args) {
//  Explicit casting
//  Variable to variable cast

        Test obj = new Test();
        obj.show((int) 243.4534);


        double source = 150.99999;
        int destination = (int) source;
        System.out.println(destination);


        byte b = 123;
        int i = (int) b;
        System.out.println(i);


//  Object to variable cast
        Integer wholeNumber = new Integer(400);
        int dest = wholeNumber.intValue();
        System.out.println(dest);

//  Object to variable cast
        String val = "4";
        int intObject = Integer.parseInt(val);
        System.out.println(intObject);


//  Implicit casting
        int x = 45;
        double y = 3.4;
        double xy = x + y;
        System.out.println(xy);

//      Each data type has a corresponding object
//       |
        int Integer;
        double Double;
        long Long;
    }
}
