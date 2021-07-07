package com.tqk.decorator;

public class Milk extends  Decorator{

    public Milk(Drink drink) {
        super(drink);
        setDes(" 牛奶 ");
        setPrice(2.00D);
    }
}
