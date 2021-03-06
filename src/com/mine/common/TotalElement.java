package com.mine.common;

import java.util.*;

/**
 * @Auther: hetiao
 * @Date: 2019-1-18 14:02
 * @Description: 求java数组中每个元素的个数
 */
public class TotalElement {
    public static void main(String[] args) {
        frequency();

        String[] array = new String[]{"aa","bb","cc","ac","aac","aaa","aa","aa"};
        //创建组装容器
        HashMap<String,Integer>  hashMap = new HashMap<>();
        //循环数组
        for (String str:array) {
            Integer num = hashMap.get(str);
            num = null == num ? 1: num + 1;
            hashMap.put(str,num);
        }
        //创建set接收map
        Set set = hashMap.entrySet();
        Iterator interator = set.iterator();
        while (interator.hasNext()){ //循环迭代器
            Map.Entry<String,Integer> entry = (Map.Entry<String,Integer>)interator.next();
            System.out.println("单词"+entry.getKey() + ", 出现次数"+entry.getValue());

        }


    }


    public static void  frequency(){
        String strs = "zhangsan zhangsanfeng lisi lisi wangwu wangwuliu zhangwuji zhou zhouzhinuo";
        System.out.println(strs);
        List<String> tempList = Arrays.asList(strs.split(" "));
        for(String stemp:tempList){
            System.out.println(stemp+" ->出现次数:"+Collections.frequency(tempList, stemp));
        }
    }


}
