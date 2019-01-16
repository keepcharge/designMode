package com.mine.design.Singleton_Pattern;

/**
 * @Auther: hetiao
 * @Date: 2019-1-16 16:49
 * @Description:单例模式 饿汉模式
 */
public class Singleton04 {
    private static Singleton04 instance = new Singleton04();

    private Singleton04(){

    }

    public static  Singleton04 getInstance(){
        return  instance;
    }


}
