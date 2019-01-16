package com.mine.design.singleton;

/**
 * @Auther: hetiao
 * @Date: 2019-1-16 16:45
 * @Description:加锁同步，前后两次判断实例是否存在
 */
public class Singleton03 {
    private static Singleton03 instance = null;

    private Singleton03(){

    }

    public static Singleton03 getInstance(){
        if(null == instance){
            synchronized (Singleton03.class) {
                if (null == instance) {
                    instance = new Singleton03();
                }
            }
        }
        return instance;
    }

}
