package com.mine.design.Factory_Pattern.abstractFactory;

/**
 * @Auther: hetiao
 * @Date: 2019-1-16 18:35
 * @Description:抽象工厂测试类
 */
public class TestFactory {

    public static void main(String[] args) {
        PcFactory hpFact = new HpFactory();
        Mouse hpm = hpFact.createMouse();
        KeyBoard hpkbd = hpFact.createKeyBoard();

        PcFactory dellFact = new DellFactory();
        Mouse dellm = dellFact.createMouse();
        KeyBoard dellkbd = hpFact.createKeyBoard();


        hpm.sayHi();
        dellm.sayHi();
        hpkbd.kick();
        dellkbd.kick();


    }
}
