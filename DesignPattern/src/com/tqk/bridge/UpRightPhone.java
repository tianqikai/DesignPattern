package com.tqk.bridge;

public class UpRightPhone extends Phone{
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    String open() {
        String typeName=super.open();
        System.out.println(typeName+"直立手机开机");
        return typeName;
    }

    @Override
    String close() {
        String typeName=super.close();
        System.out.println(typeName+"直立手机关机");
        return typeName;
    }

    @Override
    String call() {
        String typeName=super.call();
        System.out.println(typeName+"直立手机打电话");
        return typeName;
    }
}
