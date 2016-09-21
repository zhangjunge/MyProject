package com.vip.dove.tools;

import com.vip.xfd.tools.ThreeDESUtil;


/**
 * Created by dove.zhang on 2016/5/17.
 */
public class SecretEnDe {

    public static String vipKey = "ERERIhERERERERERERERERERERMxERER";
    public static String midKey = "1172d5e647adb62f357fd46825b1ffa5";

    public static void main(String[] args) {

        //String miwen = "a4dlePgBmPa9nzkkmtZE2MOS1iFXo/eqCloIWZTz0uxjNvFK1AYA+g==";
        //String partnerId = "80002000017";

       // partnerKeyDecrypt(miwen,partnerId);

        partnerKeyEncrypt("8d993e90c2905c7599dc56b0b152c11a","80002000003");


    }


    /**
     * 解密partnerId 对应的key
     * partnerKey 数据库存储时候是用partnerId + vipKey 作为密钥
     * ThreeDES.encryptMode(mingwen,partnerId+vipKey);
     */

    public static void partnerKeyEncrypt(String mingwen, String partnerId) {

        String jiami = ThreeDESUtil.encryptMode(mingwen, partnerId + vipKey);
        System.out.println(jiami);

    }

    public static void partnerKeyDecrypt(String miwen, String partnerId) {

        String jiemi = ThreeDESUtil.decryptMode(miwen, partnerId + vipKey);
        System.out.println(jiemi);

    }

    /**
     * 解密中间层midKey加密的密文
     */
    public static void decryptByMidkey(String miwen) {

        String jiemi = ThreeDESUtil.decryptMode(miwen, midKey);
        System.out.println(jiemi);

    }


    /**
     * 解密日志文件
     * 日志用的密钥为 encryptDate + vipKey
     * encryptDate (打印日志时的日期)为日期的前八位
     */
    public static void decryptLogByMidkey(String miwen, String encryptDate) {

        String jiemi = ThreeDESUtil.decryptMode(miwen, encryptDate + vipKey);
        System.out.println(jiemi);

    }


}
