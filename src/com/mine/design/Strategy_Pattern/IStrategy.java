package com.mine.design.Strategy_Pattern;

/**
 * @Auther: hetiao
 * @Date: 2019-1-21 11:25
 * @Description:策略模式 策略接口
 */
public interface IStrategy {
    //定义的抽象算法方法，来约束具体的算法实现方法
    public void algorithmMethod();
}

//具体策略实现
class ConcreteStrategy implements  IStrategy{

    @Override
    public void algorithmMethod() {
        System.out.println("this is ConcreteStrategy method");

    }
}

//具体策略实现
class ConcreteStrategy2  implements  IStrategy{

    @Override
    public void algorithmMethod() {
        System.out.println("this is ConcreteStrategy2 method");

    }
}

//策略上下文
class StrategyContext{

    //持有一个策略实现的引用
    private  IStrategy strategy;

    public StrategyContext(IStrategy strategy){
        this.strategy = strategy;
    }

    public void contextMethod(){
        //调用策略实现的方法
        strategy.algorithmMethod();
    }

}

//外部客户端
class Client{
    public static void main(String[] args) {
        //1创建具体策略实现
        IStrategy strategy = new ConcreteStrategy2();
        //2在创建策略上下文的同时，将具体的策略实现对象注入到策略上下文中
        StrategyContext ctx =  new StrategyContext(strategy);
        //3调用上下文对象方法来完成对具体策略实现的回调
        ctx.contextMethod();

    }
}

