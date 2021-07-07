package com.tqk.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory implements InvocationHandler {
    private  Object object;

    public ProxyFactory(Object object) {
        this.object = object;
    }

    public ProxyFactory() {
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理开始 方法一");
        Object invoke = method.invoke(object, args);
        System.out.println("动态代理结束 方法二");
        return invoke;
    }
    public  static  Object getProxyInstance(Object object){//被代理类
        ProxyFactory proxyFactory=new ProxyFactory(object);
        Object result= Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),proxyFactory);
        return result;
    }
}
