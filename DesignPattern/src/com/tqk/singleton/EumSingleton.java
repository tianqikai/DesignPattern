package com.tqk.singleton;

public enum EumSingleton {
    INSTANCE;
    //可以省略此方法，通过Singleton.INSTANCE进行操作
    public static EumSingleton getInstance() {
        return EumSingleton.INSTANCE;
    }
}
