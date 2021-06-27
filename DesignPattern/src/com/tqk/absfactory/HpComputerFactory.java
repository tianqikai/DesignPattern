package com.tqk.absfactory;

public class HpComputerFactory implements ComputerFactory{
    @Override
    public Mouse CreatMouse() {
        return new HpMouse();
    }

    @Override
    public Keybo CreateKeybo() {
        return new HpKeybo();
    }
}
