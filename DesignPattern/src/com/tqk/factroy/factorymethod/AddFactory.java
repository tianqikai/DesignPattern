package com.tqk.factroy.factorymethod;

/**加法工厂
 *
 * **/
public class AddFactory implements IFactory{

    @Override
    public IOperation createOperation() {
        return new OperationAdd();
    }
}