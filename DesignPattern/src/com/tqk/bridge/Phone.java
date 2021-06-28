package com.tqk.bridge;

public abstract  class Phone {
    private  Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }
    String open(){
        return this.brand.open();
    }
    String close(){
        return this.brand.close();
    }
    String call(){
        return this.brand.call();
    }
}
