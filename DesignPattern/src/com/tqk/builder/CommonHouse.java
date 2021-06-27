package com.tqk.builder;

public class CommonHouse extends AbstractHouse{

    private  House house=new House();

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    @Override
    public void buildBasic(String basic) {
        System.out.println("普通房子打地基");
        house.setBaise(basic);
    }

    @Override
    public void buildWalls(String wall) {
        System.out.println("普通房子砌墙");
        house.setWall(wall);
    }

    @Override
    public void roofed(String roof) {
        System.out.println("普通房子封顶");
        house.setRoofed(roof);
    }
}
