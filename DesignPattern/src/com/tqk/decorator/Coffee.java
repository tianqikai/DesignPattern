package com.tqk.decorator;

public class Coffee extends  Drink{

    @Override
    public Double cost() {
        return super.getPrice();
    }
}
