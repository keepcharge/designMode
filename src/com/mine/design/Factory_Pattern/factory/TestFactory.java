package com.mine.design.Factory_Pattern.factory;

/**
 * @Auther: hetiao
 * @Date: 2019-1-16 18:20
 * @Description:
 */
public class TestFactory {
    public static void main(String[] args) {
     MouseFactory hpFact = new HpMouseFactory();
     MouseFactory dellFact = new DellMouseFactory();
     Mouse hpm = hpFact.createMouse();
     Mouse dellm = dellFact.createMouse();
     hpm.sayHi();
     dellm.sayHi();

    }
}
