package com.tqk.singleton;

/**
 * 单例模式-懒汉式（静态代码块）
 */
public class HungrySingleton1 {
    // 私有化构造，防止new创建对象
    private  HungrySingleton1(){}
    // 创建静态常量对象
    private static HungrySingleton1 hungrySingleton;
    // 静态代码块
    static {
        hungrySingleton=new HungrySingleton1();
    }
    // 提供静态公用方法
    public static HungrySingleton1 getHungrySingleton() {
        return hungrySingleton;
    }
}
