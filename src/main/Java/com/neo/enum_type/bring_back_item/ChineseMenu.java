package com.neo.enum_type.bring_back_item;

import java.util.HashMap;
import java.util.Map;

enum ChineseMenu {
    SOUP_CHICKEN(19), SOUP_VEGETABLE(18), NOODLES_CHICKEN(21), SPRING_ROLL(5);

    static ChineseMenu item;

    public void Request(ChineseMenu item) {
        ChineseMenu.item = item;
    }


    private final static Map map = new HashMap<>();
    static {
        for (ChineseMenu item : ChineseMenu.values()) {
            map.put(item.value, item);
        }
    }

    private final int value;

    private ChineseMenu(int value) {
        this.value = value;
    }

    // Handles the mapping of the integer into the HashMap
    public static ChineseMenu valueOf(int item) {
        return (ChineseMenu) map.get(item);
    }

    public int getValue() {
        return value;
    }

}
