package com.neo.static_keyword;


public class StaticKeywordDemo {


    public static void main(String[] args) {


    Abc.i = 37;


        Abc.show();

    }
}



class Abc {

    static int i = 38;

    public static void show() {
        System.out.println("Hi");
    }

    public static void tell() {
        System.out.println(i);
    }

}