package com.tqk.uml.association;

//单向一对一关系
public class Person1 {
    private IDCard1 card;

    public static void main(String[] args) {

    }
}
class IDCard1{}

//双向一对一关系public
class Person2 {
    private IDCard2 card;
}
class IDCard2{
    private Person2 person;
}