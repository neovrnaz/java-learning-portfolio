package com.neo.static_method;

import static java.lang.System.out;
import static com.neo.static_method.StaticImportSample.showHello;


public class StaticImports {


    static {
        out.println("Hi");
    }

    public static void main(String[] args) {

        showHello();

        out.println("Hello World");
    }


    static {
        out.println("Hi2");
    }

}
