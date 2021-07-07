package com.tqk.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory2 {
    private static Object object;
    public ProxyFactory2(Object object) {
        this.object = object;
    }

    public ProxyFactory2() {
    }

    public static Object getProxyInstance(){//被代理类
        Object result= Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("JDK代理开始~~");
                //反射机制调用目标对象的方法
                Object returnVal = method.invoke(object, args);
                System.out.println("JDK代理提交");
                return returnVal;
            }
        });
        return result;
    }
}
