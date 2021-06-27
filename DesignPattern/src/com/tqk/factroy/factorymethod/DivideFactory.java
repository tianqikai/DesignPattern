package com.tqk.factroy.factorymethod;

public class DivideFactory implements  IFactory {
    @Override
    public IOperation createOperation() {
        return new OperationDivide();
    }
}
