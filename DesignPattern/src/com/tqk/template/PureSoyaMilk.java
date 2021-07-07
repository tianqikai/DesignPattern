package com.tqk.template;

public class PureSoyaMilk extends  SoyaMilk{
    //空实现
    @Override
    void addCondiments() {
    }
    //钩子函数也可以不要
    @Override
    boolean customerWantCondiments(){
        return  false;
    }
}
