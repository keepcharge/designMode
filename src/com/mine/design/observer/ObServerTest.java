package com.mine.design.observer;

/**
 * @Auther: hetiao
 * @Date: 2019-1-16 16:21
 * @Description:观察者模式测试类
 */
public class ObServerTest {
    public static void main(String[] args) {
        WechatServer server = new WechatServer("广播站00001");
        User jack = new User("Jack");
        User li   = new User("Li");
        User tiao = new User("Tiao");
        server.register(jack);
        server.register(li);
        server.register(tiao);
        server.setMessage("小葵花妈妈课堂开讲了00001");
        System.out.println("////////////////////////////////////////");
        server.cancel(jack);
        server.setMessage("小葵花妈妈课堂开讲了00002");

    }
}
