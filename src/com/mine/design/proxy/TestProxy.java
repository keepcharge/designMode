package com.mine.design.proxy;

/**
 * @Auther: hetiao
 * @Date: 2019-1-16 17:10
 * @Description:测试代理模式
 */
public class TestProxy {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");
        image.display();
        System.out.println("///////////////////////");
        Image image2 = new ProxyImage("");
        image.display();

    }
}
