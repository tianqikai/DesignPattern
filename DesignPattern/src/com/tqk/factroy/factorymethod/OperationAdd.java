package com.tqk.factroy.factorymethod;

/**
 * 加法
 */
public class OperationAdd implements IOperation {
@Override
public double caculate(double num1, double num2) {
return num1 + num2;
}
}