package com.neo.threads;

// The Runnable interface should be implemented by any class
// whose instances are to be executed by a thread

// The interface is designed to provide a common protocol for objects
// that wish to execute code while they are active

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

//                            This means "Please let me use threads. I promise I will use the run method".
//                               |
public class Dice implements Runnable {
    String type;
    int diceRoll;
    int timeRollTakes;


    Random random = new Random();


    public Dice(String x) {
        type = x;
        diceRoll = random.nextInt(6 - 1) + 1;

        // Creates the amount of time before the dice lands
        timeRollTakes = ThreadLocalRandom.current().nextInt(1000, 4000 + 1);
    }

    Thread thread = new Thread();

    // run() is required for Runnable
    @Override
    public void run() {
        try {
            System.out.println("Rolling the dice...");
            Thread.sleep(timeRollTakes);
            System.out.printf("The %s dice landed on %d\n", type, diceRoll);
            Thread.sleep(199);
        } catch (Exception e) {}
    }



}
