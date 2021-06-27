package com.tqk.builder;

public abstract class AbstractHouse {

    //打地基
    public abstract void buildBasic(String basic);
    //砌墙
    public abstract void buildWalls(String wall);
    //封顶
    public abstract void roofed(String roof);

    public void build(String basic,String wall,String roof) {
        buildBasic(basic);
        buildWalls(wall);
        roofed(roof);
    }
}
