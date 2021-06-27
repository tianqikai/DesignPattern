package com.tqk.factroy.factorymethod;

public class OperationDivide implements IOperation{
    @Override
    public double caculate(double num1, double num2) {
        return num1/num2;
    }
}
