package com.dove.com.dove.simpletest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dove.zhang on 2016/7/5.
 */
public class JSONTest {

    public static void main(String[] args) {
        User user1 = new User("gege", "dd");
        User user = new User("gege1", "dd1");
        List<User> list = new ArrayList<>();
        list.add(user);
        list.add(user1);
        BaseResp resp = new BaseResp();
        resp.setData(list);
        String json = JSON.toJSONString(resp);

        JSONObject jsonObject = JSONObject.parseObject(json);



    }
}
