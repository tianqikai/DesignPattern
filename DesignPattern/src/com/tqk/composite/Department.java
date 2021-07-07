package com.tqk.composite;

public class Department extends OrganizationComponent{
    public Department(String name, String des) {
        super(name, des);
    }

    //add , remove 就不用写了，因为他是叶子节点
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName();
    }

    @Override
    public String getDes() {
        // TODO Auto-generated method stub
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println(getName() );
    }
}
