package com.tqk.factroy.factorymethod;

/**
 * 减法运算
 */
public class OperationSub implements IOperation {
@Override
public double caculate(double num1, double num2) {
return num1 - num2;
}
}
