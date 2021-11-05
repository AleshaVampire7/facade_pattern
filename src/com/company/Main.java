package com.company;

public class Main {

    public static void main(String[] args) {
    Waiter waiter=new Waiter();
        System.out.println(waiter.deliverFood(Type.CAKE));
        System.out.println(waiter.deliverFood(Type.DONUT));
    }
}
