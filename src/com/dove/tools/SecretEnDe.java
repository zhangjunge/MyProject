package com.dove.tools;

/**
 * Created by dove.zhang on 2016/5/17.
 */
public class SecretEnDe {
    public static void main(String[] args) {
        String vipKey = "ERERIhERERERERERERERERERERMxERER";
        String  partnerId = "80002000003";
        String  miwen = "IEALOBWhv6ryziM69NcVupOUsoI5IQ43si9VMzcTP0TNWuKkAP0dcA==";
        //String midKey = "1172d5e647adb62f357fd46825b1ffa5";

        String mingwen = ThreeDES.decryptMode(miwen,partnerId+vipKey);
        String miwen1 = ThreeDES.encryptMode(mingwen,partnerId+vipKey);

        System.out.println(mingwen);
        System.out.println(miwen);
        System.out.println(miwen1);

    }


}
