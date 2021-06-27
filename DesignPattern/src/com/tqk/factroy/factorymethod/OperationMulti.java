package com.tqk.factroy.factorymethod;

/**
 * 乘法运算
 */
public class OperationMulti implements IOperation {
@Override
public double caculate(double num1, double num2) {
return num1 * num2;
}
}
