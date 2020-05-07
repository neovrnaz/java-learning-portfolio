package com.neo.star;

// You can not make a top level class Static


class Main {

    // You can only make nested class either static or non static
    class Test {
    }


//                       Creating a Method
//                      /               \
    public static void main(String[] args) {



//     (The creation of an object)
//     <---- Instantiation ---->
//   Class   Obj     Memory   Constructor
//    |      |         |     /
    Star northStar = new Star();
//           |
//      Object name = instance of Star



//               Calling a method
//              /                \
    northStar.setStar("North Star");

    northStar.setLight(10000000000L);

    northStar.setTimeInSky(10000000000L);

    System.out.println(northStar.getStar());


    }
}
