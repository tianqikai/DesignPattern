package com.tqk.adapter.interfaceadapter;

public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter1=new AbsAdapter() {
            @Override
            public void m1() {
                System.out.println("调用方法1");
            }
        };
        absAdapter1.m1();
    }
}
