package com.tqk.principle.inversion.improve;
/**
 * @ClassName：DependencyPass
 * @description: 依赖倒转原则
 * @author: tianqikai
 * @date : 19:51 2021/6/13
 */
public class DependencyPass {
    public static void main(String[] args) {
//        HaiXin haiXin=new HaiXin();
//        new OpenAndClose().play(haiXin);
//        new OpenAndClose().play(new Haier());

        // 通过setter方法传递
//        HaiXin haiXin=new HaiXin();
//        OpenAndClose openAndClose1=new OpenAndClose();
//        openAndClose1.setTv(haiXin);
//        openAndClose1.play();
//        OpenAndClose openAndClose2=new OpenAndClose();
//        openAndClose2.setTv(new Haier());
//        openAndClose2.play();
        // 通过构造方法
        HaiXin haiXin=new HaiXin();
        OpenAndClose openAndClose1=new OpenAndClose(haiXin);
        openAndClose1.play();
        OpenAndClose openAndClose2=new OpenAndClose(new Haier());
        openAndClose2.play();
    }
}

//方式一 通过接口实现
//interface IOOpenAndClose{
//    void play(TV tv);
//}
//interface TV{
//    void open();
//}
//class HaiXin implements TV{
//
//    @Override
//    public void open() {
//        System.out.println("打开海信电视！");
//    }
//}
//class Haier implements TV{
//
//    @Override
//    public void open() {
//        System.out.println("打开海尔电视！");
//    }
//}
//class OpenAndClose implements IOOpenAndClose{
//    @Override
//    public void play(TV tv) {
//        tv.open();
//    }
//}

//方式二 通过构造方法
interface IOOpenAndClose{
    void play();
}
interface TV{
    void open();
}
class HaiXin implements TV{

    @Override
    public void open() {
        System.out.println("打开海信电视！");
    }
}
class Haier implements TV{

    @Override
    public void open() {
        System.out.println("打开海尔电视！");
    }
}
class OpenAndClose implements IOOpenAndClose{
    public  TV tv;

    public OpenAndClose(TV tv) {
        this.tv = tv;
    }

    @Override
    public void play() {
        this.tv.open();
    }
}
////方式二 通过setter方法传递
//interface IOOpenAndClose{
//    void play();
//
//    void setTv(TV tv);
//}
//interface TV{
//    void open();
//}
//class HaiXin implements TV{
//
//    @Override
//    public void open() {
//        System.out.println("打开海信电视！");
//    }
//}
//class Haier implements TV{
//
//    @Override
//    public void open() {
//        System.out.println("打开海尔电视！");
//    }
//}
//class OpenAndClose implements IOOpenAndClose{
//    public  TV tv;
//    @Override
//    public void play() {
//        tv.open();
//    }
//
//    @Override
//    public void setTv(TV tv) {
//        this.tv=tv;
//    }
//}