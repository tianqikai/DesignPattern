package com.tqk.builder;

public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build("1m","5m","90m^2");
        System.out.println(commonHouse.getHouse().toString());
    }
}
