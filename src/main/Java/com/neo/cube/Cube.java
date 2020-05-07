package com.neo.cube;


// Keypoints;
//  Static variables are the same for all objects
//  Non static variables are different for all objects
//  You can't use non-static variable in a static block


class Cube {

    int length;
    int height;
    int breadth;

    public int getCubeVolume() {
        return (length * breadth * height);
    }

    public void setVolume(int length) {
        this.length = length;
    }


// Constuctor overloading is when you define multiple constructors with different arguments

//   This is the default constructor
//    |
     Cube() {
        length = 12;
        breadth = 12;
        height = 12;
//        |
//       If you declare a variable inside a method, it will only be visible inside this method
    }

    /**
     *
     * @param l
     * @param b
     * @param h
     * @param j
     */

//      Constructor:
// A constructor is a member method
// It has the same name as the class
// It will never return anything
// It will be used to allocate memory


//  This is constructor

/*
 * If you change the cube parameters, pressing ⌥⏎  will give the option to update usages to reflect signature changes.
 * You can also add a parameter and a gutter icon will ask to update the usages.
 * Enter a default value and all places that call this method will use this default value. This new way of refactoring works
 *  for classes too. Remember too look out for the refactoring gutter icon when you make changes to your code.
*/

//     This constructor will get excecuted when you create an object
//     /
    Cube(int l,int b,int h) {
        length = l;
        breadth = b;
        height = h;
    }

}


class Main {

//           Means that only one instance of a static field exists
//            |
    public static void main(String[] args) {

        Cube a;
        a = new Cube();
        Cube b = new Cube(20, 20, 20);



        System.out.println(a.getCubeVolume());
        System.out.println(b.getCubeVolume());

        a.getCubeVolume();

        new Cube();


    }
}
