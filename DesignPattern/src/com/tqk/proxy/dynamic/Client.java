package com.tqk.proxy.dynamic;


public class Client {
    public static void main(String[] args) throws Exception {
        //创建目标对象
        Class clazz = Class.forName("com.tqk.proxy.dynamic.TeacherDao");
        ITeacherDao target = (ITeacherDao) clazz.newInstance();
        //给目标对象，创建代理对象, 可以转成 ITeacherDao
//        ITeacherDao teacherDao = (ITeacherDao)new ProxyFactory2(target).getProxyInstance();
        ITeacherDao teacherDao = (ITeacherDao)new ProxyFactory(target).getProxyInstance(target);

        // proxyInstance=class com.sun.proxy.$Proxy0 内存中动态生成了代理对象
        System.out.println("proxyInstance=" + teacherDao.getClass());

        //通过代理对象，调用目标对象的方法
        teacherDao.teach();
        teacherDao.sayHello("tom");
    }
}
