package com.mine.design.Template_Method_Pattern;

/**
 * @Auther: hetiao
 * @Date: 2019-1-17 10:10
 * @Description:模板方法
 */
//抽象类
public abstract class AbstractCake {
    public void TemplateMethod(){ //模板方法
        SpecificMethod();
        abstractMethod1();
        abstractMethod2();
    }

    public void SpecificMethod(){ //具体方法
        System.out.println("抽象类中的具体方法被调用...");
    }

    public abstract void abstractMethod1(); //抽象方法1
    public abstract void abstractMethod2(); //抽象方法2

    public static void main(String[] args)
    {
        AbstractCake tm=new ConcreteCake();
        tm.TemplateMethod();
    }
}
