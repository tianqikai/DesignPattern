package com.tqk.singleton;

public class LazySingleton1
{
    //私有化构造器
    private LazySingleton1(){
    }

    //创建私有对象，未实例化
    private static  LazySingleton1 lazySingleton;

    //创建获取对象的方法,同步方法模式，效率低不推荐
    public synchronized  LazySingleton1  getLazySingleton(){
        if(lazySingleton==null){
            lazySingleton =new LazySingleton1();
        }
        return lazySingleton;
    }
}
