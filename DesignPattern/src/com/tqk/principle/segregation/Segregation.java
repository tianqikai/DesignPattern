package com.tqk.principle.segregation;
/**
 * @ClassName：Segregation
 * @description: 接口隔离级别
 * @author: tianqikai
 * @date : 19:04 2021/6/13
 */
public class Segregation {
    public static void main(String[] args) {

        /**类A通过接口Interface1依赖类B，类C通过接口Interface1依赖类D，
         *如果接口Interface1对于类A和类C来说不是最小接口那么类B和类D必须去实现他们不需要的方法
         *造成代码冗余
        **/

        A a=new A();
        a.depend1(new B()); // A类通过接口去依赖B类
        a.depend2(new B());
        a.depend3(new B());
        C c=new C();
        c.depend1(new D());// C类通过接口去依赖D类
        c.depend4(new D());
        c.depend5(new D());

    }
}
//接口
interface Interface1 {
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements Interface1 {
    @Override
    public void operation1() {
        System.out.println("B 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了 operation2");
    }
    @Override
    public void operation3() {
        System.out.println("B 实现了 operation3");
    }
    @Override
    public void operation4() {
        System.out.println("B 实现了 operation4");
    }
    @Override
    public void operation5() {
        System.out.println("B 实现了 operation5");
    }
}

class D implements Interface1 {
    @Override
    public void operation1() {
        System.out.println("D 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D 实现了 operation2");
    }
    @Override
    public void operation3() {
        System.out.println("D 实现了 operation3");
    }
    @Override
    public void operation4() {
        System.out.println("D 实现了 operation4");
    }
    @Override
    public void operation5() {
        System.out.println("D 实现了 operation5");
    }
}
//A 类通过接口Interface1 依赖(使用) B类，但是只会用到1,2,3方法
class A {
    public void depend1(Interface1 i) {
        i.operation1();
    }
    public void depend2(Interface1 i) {
        i.operation2();
    }
    public void depend3(Interface1 i) {
        i.operation3();
    }
}
//C 类通过接口Interface1 依赖(使用) D类，但是只会用到1,4,5方法
class C {
    public void depend1(Interface1 i) {
        i.operation1();
    }
    public void depend4(Interface1 i) {
        i.operation4();
    }
    public void depend5(Interface1 i) {
        i.operation5();
    }
}
