package com.mine.design.observer;

/**
 * @Auther: hetiao
 * @Date: 2019-1-16 16:06
 * @Description: 被观察者抽象接口
 */
public interface ObServered {
    /**
     * 订阅
     * @param obServer
     */
    public void register(ObServer obServer);

    /**
     * 取消订阅
     * @param obServer
     */
    public void cancel(ObServer obServer);

    /**
     * 通知
     */
    public void notifyO();


}
