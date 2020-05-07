package com.neo.speaking;


public class Speaker {

    // These are called instance variables
    private String speaker;
    private String speech;
    private int timespeaking;
//    final int speakers;
    //

    public void announce() {
        System.out.println( "Welcome to the Conference " + speaker + "!");
    }

    public void speak() {

    }


    public void prepBefore() {
        System.out.println( speaker + " is prepping before the Conference...");
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public void setTimespeaking(int timespeaking)
    {
        this.timespeaking = timespeaking;
    }

    public String getSpeaker() {
        return speaker;
    }

    public int getTimespeaking() {
        return timespeaking;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    public String getSpeech() {
        return speech;
    }


}


