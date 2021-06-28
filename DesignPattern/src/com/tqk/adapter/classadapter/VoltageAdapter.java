package com.tqk.adapter.classadapter;

//适配器类
public class VoltageAdapter extends Voltage220V implements IVoltage5V{
    @Override
    public int output5V() {
        int voltagenum=output220v();
        return voltagenum/44;
    }
}
