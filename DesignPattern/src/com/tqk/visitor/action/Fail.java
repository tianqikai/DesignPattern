package com.tqk.visitor.action;

import com.tqk.visitor.objectstructure.Man;
import com.tqk.visitor.objectstructure.Woman;

public class Fail extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println(" 男人给的评价该歌手失败 !");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println(" 女人给的评价该歌手失败 !");
    }
}
