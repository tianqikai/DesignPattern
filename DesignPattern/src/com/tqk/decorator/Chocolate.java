package com.tqk.decorator;

public class Chocolate extends  Decorator{

    public Chocolate(Drink drink) {
        super(drink);
        setDes(" 巧克力 ");
        setPrice(3.00D);
    }
}
