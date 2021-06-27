package com.tqk.prototype.deppclone;

public class Client {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        DeepProtoType p = new DeepProtoType();
        p.setName("宋江");
        p.setDeepCloneableTarget(new DeepCloneableTarget("大牛", "小牛"));

        //方式1 完成深拷贝

		DeepProtoType p3 = (DeepProtoType) p.clone();

		System.out.println("p.name=" + p.getName() + "p.deepCloneableTarget=" + p.getDeepCloneableTarget().hashCode());
		System.out.println("p3.name=" + p.getName() + "p3.deepCloneableTarget=" + p3.getDeepCloneableTarget().hashCode());
        System.out.println("-----------------");
        //方式2 完成深拷贝
        DeepProtoType p2 = (DeepProtoType) p.deepClone();

        System.out.println("p.name=" + p.getName() + "p.deepCloneableTarget=" + p.getDeepCloneableTarget().hashCode());
        System.out.println("p2.name=" + p.getName() + "p2.deepCloneableTarget=" + p2.getDeepCloneableTarget().hashCode());

    }

}