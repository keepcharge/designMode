package com.mine.design.Factory_Pattern.simplefactory;

/**
 * @Auther: hetiao
 * @Date: 2019-1-16 18:13
 * @Description: 测试普通工厂
 */
public class TestFactory {

        public static void main(String[] args) {
            //普通工厂模式
            Mouse hpm = MouseFactory.createMouse(1);
            Mouse dellm = MouseFactory.createMouse(0);
            hpm.sayHi();
            dellm.sayHi();
        }
}
