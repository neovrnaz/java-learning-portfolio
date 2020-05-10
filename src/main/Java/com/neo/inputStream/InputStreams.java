package com.neo.inputStream;

import java.io.IOException;


public class InputStreams {



//  When using an input stream, you need us throws IOException



    public static void main(String[] args) throws IOException {


//  Reads the next byte of data in an input stream
        int input = System.in.read();

//  Allows you to input information to the keyboard


        System.out.println(input + "\n\nAskii Key" + "\n---------\n\n");
//  Askii stands for American Standard Code for Information Interchange


        try {
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }


        for (int i = 0; i <= 127; i++) {
            System.out.printf("%d : %c \n", i, i);
        }
    }

}
