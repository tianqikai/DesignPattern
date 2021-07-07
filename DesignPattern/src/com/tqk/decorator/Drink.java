package com.tqk.decorator;

public  abstract  class Drink {
    public  String Des;
    public  Double  price=0.00D;

    public String getDes() {
        return Des;
    }

    public void setDes(String des) {
        Des = des;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Drink() {
    }

    public Drink(String des, Double price) {
        Des = des;
        this.price = price;
    }

    //计算费用的抽象方法
    //子类来实现
    public abstract Double cost();

}
