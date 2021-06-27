package com.tqk.singleton;

public class LazySingleton2 {
    // 私有化构造器
    private LazySingleton2(){}

    // 创建私有对象，未实例化
    private static volatile LazySingleton2 lazySingleton;

    //    创建获取对象的方法,同步代码块模式，推荐使用，双重检查，避免直接调用synchronized造成性能浪费
    //    如果单例已经创建了,直接调用synchronized加锁比较耗性能。所以首先判断有没有创建，没创建再加锁。
    //    第二层非空检查的原因是在同时多个线程调用时，A线程获得锁并创建成功实例，之后释放锁，前面一起竞争的B线程获得锁，
    //    首先判断非空，代表已经创建了，所以不会继续去创建实例。
    public  LazySingleton2  getLazySingleton(){
        if(lazySingleton==null){
            synchronized (LazySingleton2.class){
                if(lazySingleton==null){
                    lazySingleton =new LazySingleton2();
                }
            }
        }
        return lazySingleton;
    }
}
