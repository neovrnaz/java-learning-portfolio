package com.neo.polymorphism;

public class Application {

//       Many
//        |
//      Poly morphism
//             |
//           Behaviour


    public void show() {
        System.out.println("Showing");
    }

    public static void main(String[] args) {
        Application objA = new Application();
        objA.show();

        Bonus objB = new Bonus();
        objB.show();
    }
}

class Bonus extends Application {
    @Override
    public void show() {
        super.show();
    }
}
