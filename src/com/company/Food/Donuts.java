package com.company.Food;

import java.lang.reflect.Type;

public class Donuts implements ISweets {
    public String Item;

    @Override
    public void prepareSweets(String required) {
        Item="Delicious donut with "+required;
    }

    @Override
    public String deliverIt() {
        return Item;
    }
}
