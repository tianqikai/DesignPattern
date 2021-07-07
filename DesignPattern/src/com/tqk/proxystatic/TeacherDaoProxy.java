package com.tqk.proxystatic;

public class TeacherDaoProxy implements ITeacherDao{
    TeacherDao teacherDao;

    public TeacherDaoProxy(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public void teach() {
        // TODO Auto-generated method stub
        System.out.println("开始代理  完成某些操作。。。。。 ");//方法
        teacherDao.teach();
        System.out.println("结束代理  完成某些操作。。。。。 ");//方法
    }
}
