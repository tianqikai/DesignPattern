package com.tqk.builder.improve;

public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic(String basic) {
        System.out.println("高楼大厦打地基");
        house.setBaise(basic);
    }

    @Override
    public void buildWalls(String wall) {
        System.out.println("高楼大厦砌墙");
        house.setWall(wall);
    }

    @Override
    public void roofed(String roof) {
        System.out.println("高楼大厦封顶");
        house.setRoofed(roof);
    }
}
