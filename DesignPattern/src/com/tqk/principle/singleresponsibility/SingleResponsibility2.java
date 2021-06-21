package com.tqk.principle.singleresponsibility;
/**
 * @ClassName：SingleResponsibility2
 * @description: 职责单一原则2
 * @author: tianqikai
 * @date : 16:15 2021/6/12
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle=new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");
        AirVehicle airVehicle=new AirVehicle();
        airVehicle.run("飞机");

    }
}
class RoadVehicle{
    public  void run(String vehicle){
        System.out.println(vehicle+"在公路上跑！");
    }
}
class AirVehicle{
    public  void run(String vehicle){
        System.out.println(vehicle+"在空中上飞！");
    }
}
class WaterVehicle{
    public  void run(String vehicle){
        System.out.println(vehicle+"在水中上跑！");
    }
}
