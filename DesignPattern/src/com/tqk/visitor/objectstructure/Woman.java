package com.tqk.visitor.objectstructure;

import com.tqk.visitor.action.Action;

public class Woman extends Person{
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
