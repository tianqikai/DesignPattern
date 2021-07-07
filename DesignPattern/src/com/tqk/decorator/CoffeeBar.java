package com.tqk.decorator;

public class CoffeeBar {
    public static void main(String[] args) {
        Drink order =new LongBlack();
        System.out.println("价格："+order.cost());
        System.out.println("描述: "+order.getDes());

        order =new Milk(order);
        System.out.println("价格："+order.cost());
        System.out.println("描述: "+order.getDes());

        order =new Chocolate(order);
        System.out.println("价格："+order.cost());
        System.out.println("描述: "+order.getDes());

    }
}
