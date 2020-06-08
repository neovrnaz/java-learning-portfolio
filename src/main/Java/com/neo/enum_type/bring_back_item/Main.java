package com.neo.enum_type.bring_back_item;


public class Main {
    static ChineseMenu item;

    public Main(ChineseMenu item) {
        Main.item = item;
    }

    public static void main(String[] args) {
        Request requestAItem = new Request();
        requestAItem.menuOptions();
    }
}