package com.tqk.bridge;

public class Client {
    public static void main(String[] args) {
        FoldedPhone xmfl=new FoldedPhone(new XiaoMi());
        xmfl.open();
        xmfl.call();
        UpRightPhone hwur=new UpRightPhone(new HuaWei());
        hwur.open();
        hwur.call();
    }
}
