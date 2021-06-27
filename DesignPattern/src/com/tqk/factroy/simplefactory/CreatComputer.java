package com.tqk.factroy.simplefactory;

/**
 * @author Administrator
 */
public class CreatComputer {
    public static void main(String[]args){
        ComputerFactory.getComputer("hp").open();
        ComputerFactory.getComputer("Lenovo").open();
        ComputerFactory.getComputer("Asus").open();
    }
}