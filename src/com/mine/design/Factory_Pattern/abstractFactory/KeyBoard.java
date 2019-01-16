package com.mine.design.Factory_Pattern.abstractFactory;

/**
 * @Auther: hetiao
 * @Date: 2019-1-16 18:24
 * @Description:抽象工厂键盘类
 */
public class KeyBoard {
    public void kick(){};
}

class DellKeyBoard extends KeyBoard{
    public void kick(){
        System.out.println("产品：戴尔键盘");
    };
}

class HpKeyBoard extends KeyBoard{
    public void kick(){
        System.out.println("产品：惠普键盘");
    };
}

class AsusKeyBoard extends KeyBoard {
    public void kick() {
        System.out.println("产品：华硕键盘");
    }
}

