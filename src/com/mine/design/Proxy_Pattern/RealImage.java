package com.mine.design.Proxy_Pattern;

/**
 * @Auther: hetiao
 * @Date: 2019-1-16 17:04
 * @Description:真实类
 */
public class RealImage implements Image{

    private  String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }
    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
