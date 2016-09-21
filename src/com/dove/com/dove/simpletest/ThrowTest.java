package com.dove.com.dove.simpletest;

/**
 * Created by dove.zhang on 2016/6/13.
 */
public class ThrowTest {
    public static void main(String[] args)  {
//        try {
//
//            int a = 9/0;
//        } catch (Exception e) {
//            System.out.println("error");
//            //throw new NumberFormatException("dfalkfdsfd");
//        }

        String VIPCoin= "dfsdfdsf";
        int coinNum = 1000;
        StringBuilder param = new StringBuilder("{\"vipCoinNo\":\"");
        param.append(VIPCoin).append("\",\"coinNum\":").append(coinNum).append("}");

        System.out.println(param.toString());
    }
}

