package com.tqk.composite;

import java.util.HashMap;
import java.util.Map;

public class HashMapComp {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Map<Integer,String> hashMap=new HashMap<Integer,String>();
        hashMap.put(0, "东游记");//直接存放叶子节点Map<Integer,String> map=new HashMap<Integer,String>(); map.put(1, "西游记");
        hashMap.put(2, "红楼梦"); //..
        hashMap.putAll(hashMap); System.out.println(hashMap);
    }
}