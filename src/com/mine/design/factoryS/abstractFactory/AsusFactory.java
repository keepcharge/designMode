package com.mine.design.factoryS.abstractFactory;

/**
 * @Auther: hetiao
 * @Date: 2019-1-16 18:33
 * @Description: 华硕生产工厂
 */
public class AsusFactory implements  PcFactory{
    @Override
    public Mouse createMouse() {
        return new AsusMouse();
    }

    @Override
    public KeyBoard createKeyBoard() {
        return new AsusKeyBoard();
    }
}
