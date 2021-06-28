package com.tqk.adapter.objectadapter;

import com.tqk.adapter.classadapter.Phone;
import com.tqk.adapter.classadapter.Voltage220V;

public class Client {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(" === 类适配器模式 ====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
