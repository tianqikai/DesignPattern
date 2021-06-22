package com.tqk.uml.implementation;

public class PersonServiceBean implements  PersonService{
    @Override
    public void delete(Integer id) {

    }
}
interface PersonService {
    public void delete(Integer id);
}