package com.tqk.builder.improve;

//指挥者，这里去指定制作流程，返回产品
public class HouseDirector {
    HouseBuilder houseBuilder = null;

    //构造器传入 houseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //通过setter 传入 houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //如何处理建造房子的流程，交给指挥者
    public House constructHouse(String basic,String wall,String roof) {
        houseBuilder.buildBasic(basic);
        houseBuilder.buildWalls(wall);
        houseBuilder.roofed(roof);
        return houseBuilder.buildHouse();
    }
}
