package com.mine.design.factoryS.abstractFactory;

/**
 * @Auther: hetiao
 * @Date: 2019-1-16 18:22
 * @Description: 抽象工厂鼠标类
 */
public class Mouse {
    public void sayHi(){};
}

class DellMouse extends Mouse{
    public void sayHi(){
        System.out.println("产品 ：戴尔鼠标");
    };
}

class HpMouse extends Mouse{
    public void sayHi(){
        System.out.println("产品 ：惠普鼠标");
    };
}


//当需要增加一个华硕工厂时：
class AsusMouse extends Mouse {
    public void sayHi() {
        System.out.println("产品：华硕鼠标");
    }
}

