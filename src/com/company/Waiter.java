package com.company;

import com.company.Food.Cake;
import com.company.Food.Donuts;
import com.company.Food.ISweets;

import static com.company.Type.CAKE;
import static com.company.Type.DONUT;

public class Waiter {
    public String deliverFood(Type sweet){
        switch (sweet){
            case DONUT:
                Ingredients ingredients=new Ingredients();
                ISweets donut=new Donuts();
                String item=ingredients.getDonutI();
                donut.prepareSweets(item);
                System.out.println(donut.deliverIt());
            case CAKE:
                Ingredients ingredients2=new Ingredients();
                ISweets cake=new Cake();
                String item2=ingredients2.getCakeI();
                cake.prepareSweets(item2);
                System.out.println(cake.deliverIt());
        }
        return null;
    }
}
