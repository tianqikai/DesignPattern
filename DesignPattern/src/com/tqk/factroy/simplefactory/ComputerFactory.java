package com.tqk.factroy.simplefactory;

public class ComputerFactory {

    public static  Computer getComputer(String type){
        if(type==null){
            return null;
        }
        //
        if(type.equalsIgnoreCase("Lenovo")){
            return new LenovoComputer();
        }else if(type.equalsIgnoreCase("Hp")){
            return new HpComputer();
        }else if(type.equalsIgnoreCase("Asus")){
            return new AsusComputer();
        }else{
            return null;
        }
    }
}
