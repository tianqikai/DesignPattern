package com.tqk.principle.ocp;
/**
 * @ClassName： Ocp
 * @description: 开闭原则
 * @author: tianqikai
 * @date : 7:40 2021/6/19
 */
public class Ocp {
    public static void main(String[] args) {
        Overhead overhead=new Overhead();
        overhead.operations(1);
        overhead.operations(2);
        overhead.operations(3);
    }
}

class Overhead {
    public void operations(int flag){
        if(flag==1){
            openCard();
        }else if(flag==2){
            closeCard();
        }else if(flag==3){
            queryCard();
        }else{
            System.out.println("不支持的操作类型！");
        }
    }

    public void openCard(){
        System.out.println("开立账户！");
    }
    public void closeCard(){
        System.out.println("注销账户！");
    }
    public void queryCard(){
        System.out.println("查询账户！");
    }
}
