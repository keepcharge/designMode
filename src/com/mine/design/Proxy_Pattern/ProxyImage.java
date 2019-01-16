package com.mine.design.Proxy_Pattern;

/**
 * @Auther: hetiao
 * @Date: 2019-1-16 17:08
 * @Description:
 */
public class ProxyImage implements Image{

    private  RealImage realImage;
    private  String fileName;

    public  ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(null == realImage ){
            realImage = new RealImage(fileName);
        }
        realImage.display();

    }
}
