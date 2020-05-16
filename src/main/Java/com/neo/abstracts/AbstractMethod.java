package com.neo.abstracts;

public class AbstractMethod {

    public static void main(String[] args) {
        IPhone obj1 = new IPhone();
        SamsungS4 obj2 = new SamsungS4();
        obj1.showConfig();
        obj2.showConfig();
    }

    public static void show(Phone obj) {
        obj.showConfig();
    }



}

abstract class Phone {
    public abstract void showConfig();

// You can also define methods here also
}

class IPhone extends Phone {
    public void showConfig() {
        System.out.println("4GB RAM, iOS 13 ");
    }
}

class SamsungS4 extends Phone {
    public void showConfig() {
        System.out.println("2GB RAM, Android 10");
    }
}
