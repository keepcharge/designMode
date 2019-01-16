package com.mine.design.Factory_Pattern.abstractFactory;

/**
 * @Auther: hetiao
 * @Date: 2019-1-16 18:31
 * @Description:戴尔生产工厂类
 */
public class DellFactory implements  PcFactory{
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public KeyBoard createKeyBoard() {
        return new DellKeyBoard();
    }
}
