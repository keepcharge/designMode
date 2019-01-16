package com.mine.design.Singleton_Pattern;

/**
 * @Auther: hetiao
 * @Date: 2019-1-16 16:51
 * @Description:单例模式静态内部类
 */
public class Singleton05 {

    private Singleton05(){
        System.out.println("构造方法");
    }

    private static class SingletonHolder{
        private  final  static Singleton05 instance = new Singleton05();

    }

    public static  Singleton05 getInstance(){
        return  SingletonHolder.instance;
    }
}
