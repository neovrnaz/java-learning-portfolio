package com.neo.threads;

public class Main {

    public static void main(String[] args) {

//                                   You can't pass a class through here unless the class implements Runnable
//                                        |
        Thread thread1 = new Thread(new Dice("first"));
        Thread thread2 = new Thread(new Dice("second"));

        thread1.start();
        thread2.start();


    }
}
