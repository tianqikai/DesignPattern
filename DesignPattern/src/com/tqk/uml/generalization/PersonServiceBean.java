package com.tqk.uml.generalization;

public class PersonServiceBean extends DaoSupport {
}
abstract class DaoSupport{
    public void save(Object entity){
    }
    public void delete(Object id){
    }
}