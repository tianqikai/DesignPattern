package com.tqk.adapter.classadapter;

//被适配类
public class Voltage220V {
    public int output220v(){
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }
}
