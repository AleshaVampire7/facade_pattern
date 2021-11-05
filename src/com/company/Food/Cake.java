package com.company.Food;

public class Cake implements ISweets {
    public String Item;

    @Override
    public void prepareSweets(String required) {
        Item="Delicious cake with "+required;
    }

    @Override
    public String deliverIt() {
        return Item;
    }
}
