package com.neo.inheritance.balls;

public class Main {

    public static void main(String[] args) {

        Ball[] ballList = new Ball[5];
        ballList[0] = new Ball("Ball","Green", 6);
        ballList[1] = new PingPongBall("Ping Pong Ball","Yellow", 1);
        ballList[2] = new BowlingBall("Bowling Ball","Blue", 5);
        ballList[3] = new Ball("Ball", "Red", 2);
        ballList[4] = new Ball("Ball", "Purple", 3);

        for ( int i = 0; i < 5; i++ ) {
            ballList[i].kick();
            System.out.println( ballList[i] );
        }

    }
}
