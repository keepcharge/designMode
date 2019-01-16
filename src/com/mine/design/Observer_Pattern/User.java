package com.mine.design.Observer_Pattern;

/**
 * @Auther: hetiao
 * @Date: 2019-1-16 16:11
 * @Description: 观察者实现
 */
public class User implements ObServer {

    String name;
    String message;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String params) {
        this.message  = params ;
        read();
    }

    public void read() {
        System.out.println( name +" 收到推送消息 ： "+ message);
    }
}
