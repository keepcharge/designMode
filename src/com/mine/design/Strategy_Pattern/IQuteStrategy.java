package com.mine.design.Strategy_Pattern;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.math.BigDecimal;

/**
 * @Auther: hetiao
 * @Date: 2019-1-21 11:37
 * @Description: 策略模式例子
 */
//公共报价策略接口
public interface IQuteStrategy {
    /**
     * 针对我们一开始讲的报价管理的例子：我们可以应用策略模式对其进行改造，不同类型的客户有不同的折扣，
     * 我们可以将不同类型的客户的报价规则都封装为一个独立的算法，然后抽象出这些报价算法的公共接口
     */

    //获取折价后的价格
    BigDecimal getPrice(BigDecimal originalPrice);

}


//新客户报价策略实现
class NewCustomerQuoteStrategy implements  IQuteStrategy{

    @Override
    public BigDecimal getPrice(BigDecimal originalPrice) {
        System.out.println("抱歉！新客户没有折扣");
        return originalPrice;
    }
}
//老客户报价策略实现
class OldCustomerQuoteStrategy implements  IQuteStrategy{

    @Override
    public BigDecimal getPrice(BigDecimal originalPrice) {
        System.out.println("恭喜！老客户享有9折权限");
        originalPrice = originalPrice.multiply(new BigDecimal(0.9).setScale(2,BigDecimal.ROUND_HALF_UP));
        return originalPrice;
    }
}
//VIP客户报价策略实现
class VIPCustomerQuoteStrategy implements  IQuteStrategy{

    @Override
    public BigDecimal getPrice(BigDecimal originalPrice) {
        System.out.println("恭喜！VIP客户享有8折权限");
        originalPrice = originalPrice.multiply(new BigDecimal(0.8).setScale(2,BigDecimal.ROUND_HALF_UP));
        return originalPrice;
    }
}
//报价上下文
class QuoteContext{
    //持有一个具体报价策略
    private IQuteStrategy quteStrategy;
    //注入报价策略
    public QuoteContext(IQuteStrategy quteStrategy){
        this.quteStrategy = quteStrategy;
    }
    //回调具体报价策略方法
    public  BigDecimal getPrice(BigDecimal originalPrice){
        return quteStrategy.getPrice(originalPrice);
    }


}

//外部客户端
class  Clien{
    public static void main(String[] args) {
         //1创建老用户的报价策略
        IQuteStrategy iquteStrategy =  new OldCustomerQuoteStrategy();
        //2创建上下文对象，并设置具体的报价策略
        QuoteContext quoteContext = new QuoteContext(iquteStrategy);
        //3调用报价上下文方法
        BigDecimal price= quoteContext.getPrice(new BigDecimal(100));
        System.out.println("折扣价位："+price);
    }
}




