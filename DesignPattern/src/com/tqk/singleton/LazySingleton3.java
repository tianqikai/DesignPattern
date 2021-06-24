package com.tqk.singleton;

/**
 * 懒汉式-静态内部类方式
 */
public class LazySingleton3 {
    private  LazySingleton3(){}
    // 静态内部类使用到才加载，所以起到了延迟加载的作用
    private static class LazySingletonIn{
        private final static LazySingleton3 lazySingleton3=new LazySingleton3();
    }
    public static LazySingleton3 getLazySingleton(){
        return LazySingletonIn.lazySingleton3;
    }
}
