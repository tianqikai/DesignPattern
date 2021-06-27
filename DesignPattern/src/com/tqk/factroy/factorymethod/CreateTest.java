package com.tqk.factroy.factorymethod;

public class CreateTest {
    public static void main(String[] args) {
        IOperation iOperation=new SubFactory().createOperation();
        double num=iOperation.caculate(10,15);
        System.out.println(num);
    }
}
