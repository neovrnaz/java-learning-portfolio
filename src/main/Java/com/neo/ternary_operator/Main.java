package com.neo.ternary_operator;

public class Main {


    public static void main(String[] args) {

        int i = 1;
        int j = 5;

//        if (i == 1 )
//            j = 6;
//        else
//            j = 7;

        j = i==1 ? 6 : 7;

        System.out.println(i);


        Object obj1;
        Object obj2;

        if (true) {
            obj1 = new Integer(10);
        }
        else {
            obj1 = new Double(15.0);
        }



        obj2 = true ? new Integer(10) : new Double(15.0);


//                          It looks at both values an sees that one is a Double. So output is 10.0
//                           |
        System.out.println(obj2);
    }




}
