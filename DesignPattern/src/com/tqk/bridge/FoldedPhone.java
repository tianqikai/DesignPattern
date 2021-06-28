package com.tqk.bridge;

//折叠式手机类，继承 抽象类 Phone
public class FoldedPhone  extends Phone{
    public FoldedPhone(Brand brand) {
        super(brand);
    }
    @Override
    String open(){
        String typeName=super.open();
        System.out.println(typeName+"折叠式手机开机");
        return typeName;
    }
    @Override
    String close(){
        String typeName=super.close();
        System.out.println(typeName+"折叠式手机关机");
        return typeName;
    }
    @Override
    String call(){
        String typeName=super.call();
        System.out.println(typeName+"折叠式手机打电话");
        return typeName;
    }
}
