package com.neo.inheritance.balls;


//  You can actually treat this sub class, as it's parent class
//  Because it has inherited all the properties of it's parent class, you can imagine it to be like it's parent class, and interact with it the same way

public class PingPongBall extends Ball {

    public PingPongBall(String kin, String col, int sz) {
        super( kin,col,sz );
    }

    public void kick() {
        position += 7;
    }
}
