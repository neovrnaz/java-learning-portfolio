package com.neo.speaking;

public class Main {

    public static void main(String[] args) {

        Speaker a = new Speaker();
        a.setSpeaker("John");
        a.prepBefore();
        a.setTimespeaking(60);

        a.announce();

        System.out.println(a.getSpeaker() + " is on the stage for " + a.getTimespeaking() + " Minutes");

        a.setSpeech("\"first Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Thank you for having me.\"\n");
        System.out.println(a.getSpeech());



        Speaker b = new Speaker();
        b.setSpeaker("Paul");
        b.prepBefore();
        b.setTimespeaking(25);

        b.announce();

        System.out.println(b.getSpeaker() + " is on the stage for " + b.getTimespeaking() + " Minutes");


        b.setSpeech("\"second Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Thank you for having me.\"\n");
        System.out.println(b.getSpeech());

    }
}
