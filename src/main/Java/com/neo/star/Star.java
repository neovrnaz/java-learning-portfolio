package com.neo.star;

public class Star {


// Every method in java returns either some value or nothing

//      Private variables are accessable only in this class
//       |
//      |                  Global variables can be used throughout all methods in the entire class. DO NOT DECLARE VARIABLES AS GLOBAL
//     |                    |
    private static long light;
    private static String star;
    private static long timeInSky;
//            |
//          static keyword

    public void setStar(String star) {
        System.out.println("*");
        this.star = star;
    }

    Star(){

        System.out.println("HelloWorld");
    }


//       Access modifiers regulate what classes can use a method
//         |
//        |                      Local variable can only be used in this method
//       |                        |
//      |    Return type         |
//     |      |                 |
    public void setTimeInSky(long timeInSky) {
//                   |        \         /
//             Method Name     Parameters

        this.timeInSky = timeInSky;
//      |  |
//      |  Dot operator is used to access the member of a package or a class
//      |
//      Provides access to the global variable

    }

    public String getStar() {
        return star;
    }


    public void setLight(long light) {
        this.light = light;
    }


    public long getLight() {
        return light;
    }


    public long getTimeInSky() {
        return timeInSky;
    }

}
