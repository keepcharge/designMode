package com.mine.design.factoryS.factory2;

/**
 * @Auther: hetiao
 * @Date: 2019-1-16 18:16
 * @Description:
 */
public class Mouse {
    public void sayHi(){};
}
class DellMouse extends Mouse{
    @Override
    public void sayHi() {
        System.out.println("产品：戴尔鼠标");
    }
}
class HpMouse extends Mouse{
    @Override
    public void sayHi() {
        System.out.println("产品：惠普鼠标");
    }
}