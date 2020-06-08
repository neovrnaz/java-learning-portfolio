package com.neo.switch_statement;


// You generally use if for checking one statement and switch statements
// for checking multiple statements.

enum MobilePhone {

    // Notice that these aren't Strings
    GOOGLE, SAMSUNG, HTC
}

public class SwitchDemo {
    int batteryLife = 7;
    MobilePhone brand;

    public SwitchDemo(MobilePhone brand) {
        this.brand = brand;
    }

    public static void main(String[] args) {

        SwitchDemo firstPhone = new SwitchDemo(MobilePhone.GOOGLE);
        firstPhone.printWhichBranch();
        SwitchDemo secondPhone = new SwitchDemo(MobilePhone.SAMSUNG);
        secondPhone.printWhichBranch();
        SwitchDemo thirdPhone = new SwitchDemo(MobilePhone.HTC);
        thirdPhone.printWhichBranch();

    }

    public void printWhichBranch() {
        switch (brand) {
            case GOOGLE:
                System.out.println("Google has " + batteryLife);
                break;
            case SAMSUNG:
                System.out.println("Samsung has " + batteryLife);
                break;
            default:
                System.out.println("No specs have been released for the ");
        }
    }
}
