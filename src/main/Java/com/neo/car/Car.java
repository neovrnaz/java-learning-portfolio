package com.neo.car;


//                          Why use nested classes?

//      1. It is a way of logically grouping classes that are only used in one place
//      2. It increases encapsulation
//      3. Nested classes are more readable and maintainable,


public class Car {


//   You use variables to remember anything
//   Always declare instance variables as private

//   Private means that the member is only visible from withen the class, not from any other class
//     |
    private static int price;
//             |
//           NEVER use static variables. Static variables are global



    public void move() {

//      This is an object and an instance
//            |
        new Car();



        for(int counter = 10; counter <=10; counter++) {
            System.out.println(counter);
        }
// int counter can not be used outside of this for loop
    }


// Final means that you can not have any inheritence with this class
// If this class was private, ___, and ___, will prevent you from instansiating the object in the Driver class
    public static class Engine {


//                  A variable can be assigned as many times as you want (but can only be declared only once withen the same scope)
//                      |
        public static int horsepower = 19;
        public int maxSpeed;
//                    |
//                  A variable is only usable inside the block that it was declared in. A block is any code inside curly braces



//  There is no need to declare private members final
//  All compilers will treat private methods as final

        public void start() {
            horsepower = 10000;
            price = 1200;
            this.stop();
//           |
//          this is referring to only Engine class. You cannot use this.stop(); in the class Car for example
        }

        public void stop() {
        }

        public void run() {
            stop();
        }

        public void tester() {
            int test = 12;

            System.out.println(test);
        }


    }
//    One class per file unless the secondary classes are private to the primary class in the file


//                                   args is only accessible inside this main method
//                                     |
    public static void main(String[] args) {
        int test = 10;

        System.out.println(test);

        Car c = new Car();
        Engine e = new Engine();
        e.start();
        e.tester();

        Engine e2 = new Engine();



    }

}
