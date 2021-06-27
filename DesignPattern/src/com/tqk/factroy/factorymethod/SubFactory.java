package com.tqk.factroy.factorymethod;

public class SubFactory implements  IFactory{
    @Override
    public IOperation createOperation() {
        return new OperationSub();
    }
}
