package com.tqk.visitor.objectstructure;

import com.tqk.visitor.action.Action;

public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
