package com.tqk.builder.improve;

public abstract class HouseBuilder {
    protected House house = new House();

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    //打地基
    public abstract void buildBasic(String basic);
    //砌墙
    public abstract void buildWalls(String wall);
    //封顶
    public abstract void roofed(String roof);

    //建造房子好， 将产品(房子) 返回
    public House buildHouse() {
        return house;
    }
}
