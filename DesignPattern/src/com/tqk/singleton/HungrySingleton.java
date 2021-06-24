package com.tqk.singleton;

/**
 * 单例模式-懒汉式（静态常量模式）
 */
public class HungrySingleton {
    //私有化构造，防止new创建对象
    private  HungrySingleton(){}
    //创建静态常量对象
    private static HungrySingleton hungrySingleton=new HungrySingleton();
    //提供静态公用方法
    public static HungrySingleton getHungrySingleton() {
        return hungrySingleton;
    }
}
