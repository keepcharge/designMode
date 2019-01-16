package com.mine.design.Factory_Pattern.simplefactory;

/**
 * @Auther: hetiao
 * @Date: 2019-1-16 18:10
 * @Description:工厂模式 鼠标工厂
 */
public class MouseFactory {

    public static Mouse createMouse(int i){
        switch (i){
            case 0 : return  new DellMouse();
            case 1 : return  new HpMouse();
            default: return  null;
        }
    }

}
