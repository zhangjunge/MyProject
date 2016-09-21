package com.vip.dove.tools;

import com.alibaba.fastjson.JSONObject;
import com.vip.xfd.tools.DateUtil;

/**
 * Created by dove.zhang on 2016/5/18.
 */

public class LogDeCode {

    public static void main(String[] args) {
        User user = new User(1,"gege");
        String json = JSONObject.toJSONString(user);
        String result = LogUtil.encryptLog(json);
        System.out.println(result);
        String miwen ="98Fnefumzbr+kQxNPkl7YLn7xSvFTmomiAf96Z8hhzfkMsmJdQPWGQ==";
        System.out.println(miwen);
        String mingwen = LogUtil.decryptLog(miwen,DateUtil.getNowDate8Len());
        System.out.println(json);
        System.out.println(miwen);
        System.out.println(mingwen);

    }
}
class User{
    int userId;
    String userName;

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
