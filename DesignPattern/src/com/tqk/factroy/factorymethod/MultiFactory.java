package com.tqk.factroy.factorymethod;

/**
 * @author Administrator
 */
public class MultiFactory implements IFactory{
    @Override
    public IOperation createOperation() {
        return new OperationMulti();
    }
}
