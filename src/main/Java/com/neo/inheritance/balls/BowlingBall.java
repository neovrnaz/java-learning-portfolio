package com.neo.inheritance.balls;

public class BowlingBall extends Ball {

    public BowlingBall(String kin, String col, int sz) {
        super( kin,col,sz );
    }

    public void kick() {
        position += 0;
    }
}
