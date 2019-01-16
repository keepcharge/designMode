package com.mine.design.Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: hetiao
 * @Date: 2019-1-16 16:10
 * @Description:
 */
public class WechatServer implements ObServered{

    public List<ObServer> lstObServer;
    public String name;
    public String message;

    public WechatServer(){
        System.out.println("无参构造方法");
    }

    public WechatServer(String name) {
        if(null == lstObServer){
            lstObServer = new ArrayList<ObServer>();
        }
        System.out.println("有参构造方法");
        this.name = name;
    }


    @Override
    public void register(ObServer obServer) {
        lstObServer.add(obServer);

    }

    @Override
    public void cancel(ObServer obServer) {
        if(!lstObServer.isEmpty())
            lstObServer.remove(obServer);

    }

    @Override
    public void notifyO() {
        for (ObServer obServer:lstObServer){
            obServer.update(message);
        }
    }

    public void setMessage(String message){
        this.message = message;
        System.out.println(name +" 发布了一个消息 ："+message);
        notifyO();
    }
}
