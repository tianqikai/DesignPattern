package com.tqk.uml.composition;

public class Computer {
    Monitor monitor=new Monitor();
    Mouse mouse=new Mouse();

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
}
class Monitor{

}
class Mouse{

}
