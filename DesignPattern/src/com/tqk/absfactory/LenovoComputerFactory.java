package com.tqk.absfactory;

public class LenovoComputerFactory implements ComputerFactory{
    @Override
    public Mouse CreatMouse() {
        return new LenovoMouse();
    }

    @Override
    public Keybo CreateKeybo() {
        return new LenovoKeybo();
    }
}
