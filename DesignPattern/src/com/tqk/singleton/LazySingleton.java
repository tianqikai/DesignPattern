package com.tqk.singleton;

public class LazySingleton {
    //私有化构造器
    private LazySingleton(){
    }
    //创建私有对象，未实例化
    private static  LazySingleton lazySingleton;

    //创建获取对象的方法，线程不安全，不推荐
    public LazySingleton getLazySingleton(){
        if(lazySingleton==null){
            lazySingleton =new LazySingleton();
        }
        return lazySingleton;
    }
}
