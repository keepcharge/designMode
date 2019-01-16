package com.mine.design.singleton;

/**
 * @Auther: hetiao
 * @Date: 2019-1-16 16:39
 * @Description:多线程情况单例模式（懒汉模式）
 */
public class Singleton02 {
    private static  Singleton02  instance = null ;

    private Singleton02(){

    }

    public static synchronized Singleton02 getInstance(){
        if(null == instance) {
            instance = new Singleton02();
        }
        return  instance;

    }
}
