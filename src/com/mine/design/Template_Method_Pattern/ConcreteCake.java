package com.mine.design.Template_Method_Pattern;

/**
 * @Auther: hetiao
 * @Date: 2019-1-17 10:32
 * @Description:
 */
public class ConcreteCake extends AbstractCake {
    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用了");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用了");
    }
}
