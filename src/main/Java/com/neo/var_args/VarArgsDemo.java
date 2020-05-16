package com.neo.var_args;

import java.util.Arrays;

public class VarArgsDemo {
    public static void main(String[] args) {
        Display showThis = new Display();
        showThis.show(5, 3, 5, 2);
    }
}

class Display {
//                      Allows an unknown amount of parameters to be passed to show()
//                        |
    public void show(int ... a) {

        for (int i : a) {
            System.out.println(i);
        }
    }

    public void show(int a) {
        System.out.println(a + " in show(int a)");
    }
}


