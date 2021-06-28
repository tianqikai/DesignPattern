package com.tqk.bridge;

public class HuaWei  implements   Brand{
    @Override
    public String open() {
        System.out.println("华为手机开机");
        return "华为";
    }

    @Override
    public String close() {
        System.out.println("华为手机开机");
        return "华为";
    }

    @Override
    public String call() {
        System.out.println("华为手机开机");
        return "华为";
    }
}
