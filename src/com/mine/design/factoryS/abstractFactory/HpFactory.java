package com.mine.design.factoryS.abstractFactory;

/**
 * @Auther: hetiao
 * @Date: 2019-1-16 18:27
 * @Description: 惠普生产工厂类
 */
public class HpFactory implements PcFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public KeyBoard createKeyBoard() {
        return new HpKeyBoard();
    }
}
