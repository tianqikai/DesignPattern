package com.tqk.factroy.simplefactory;

public class HpComputer implements Computer{
    @Override
    public void open() {
        System.out.println("打开惠普电脑！");
    }
}
