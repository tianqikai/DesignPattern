package com.tqk.bridge;

public class XiaoMi implements Brand{
    @Override
    public String open() {
        System.out.println("小米手机开机");
        return "小米";
    }

    @Override
    public String close() {
        System.out.println("小米手机开机");
        return "小米";
    }

    @Override
    public String call() {
        System.out.println("小米手机开机");
        return "小米";
    }
}
