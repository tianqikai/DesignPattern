package com.tqk.principle.singleresponsibility;
/**
 * @ClassName：SingleResponsibility3
 * @description: 单一职责原则 -- 只有类中方法数量足够少，可以在方法级别保持单一职责原则
 * @author: tianqikai
 * @date : 17:55 2021/6/13
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle=new Vehicle2();
        vehicle.roadRun("摩托车");
        vehicle.airRun("飞机");
        vehicle.waterRun("轮船");

    }
}
class Vehicle2{
    public  void roadRun(String vehicle){
        System.out.println(vehicle+"在公路上跑！");
    }
    public  void airRun(String vehicle){
        System.out.println(vehicle+"在天上飞！");
    }
    public  void waterRun(String vehicle){
        System.out.println(vehicle+"在水中行！");
    }
}
