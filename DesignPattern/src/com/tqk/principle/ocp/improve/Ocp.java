package com.tqk.principle.ocp.improve;
/**
 * @ClassName： Ocp
 * @description: 开闭原则
 * @author: tianqikai
 * @date : 7:40 2021/6/19
 */
public class Ocp {
    public static void main(String[] args) {
        Overhead overhead=new Overhead();
        overhead.operations(new OpenCard());
        overhead.operations(new CloseCard());
        overhead.operations(new QueryCard());
    }
}
class Overhead {
    public void  operations(Base base){
        base.operations();
    }
}
abstract  class Base {
    abstract void operations();
}
class OpenCard extends Base{

    @Override
    void operations() {
        System.out.println("开立账户！");
    }
}
class CloseCard extends Base{

    @Override
    void operations() {
        System.out.println("注销账户！");
    }
}
class QueryCard extends Base{

    @Override
    void operations() {
        System.out.println("查询账户！");
    }
}