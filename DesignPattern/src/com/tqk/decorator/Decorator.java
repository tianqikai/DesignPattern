package com.tqk.decorator;

public class Decorator extends  Drink{
    //被装饰者
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink=drink;
    }

    @Override
    public String getDes() {
        // TODO Auto-generated method stub
        // obj.getDes() 输出被装饰者的信息
        return Des + " " + getPrice() + " && " + drink.getDes();
    }

    @Override
    public Double cost() {
        return  super.getPrice() + drink.cost();
    }
}
