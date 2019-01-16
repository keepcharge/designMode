package com.mine.design.Singleton_Pattern;

/**
 * @Auther: hetiao
 * @Date: 2019-1-16 16:35
 * @Description:单线程环境单例模式(懒汉模式)
 */
public class Singleton01 {
    private static Singleton01 instance = null ;

    private Singleton01(){

    }
    public static Singleton01 getInstance(){
        if(null == instance){
            instance = new Singleton01();
        }
        return  instance;
    }
}
