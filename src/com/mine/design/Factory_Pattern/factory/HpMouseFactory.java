package com.mine.design.Factory_Pattern.factory;

/**
 * @Auther: hetiao
 * @Date: 2019-1-16 18:18
 * @Description:
 */
public class HpMouseFactory implements  MouseFactory {

    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }
}

class DellMouseFactory  implements  MouseFactory {

    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }
}
