package com.dove.com.dove.simpletest;

import com.vip.xfd.tools.BeanUtil;

/**
 * Created by dove.zhang on 2016/6/28.
 */
public class BeanUtilsTest {

    public static void main(String[] args) {
        User1 a = new User1();
        a.setAge(1);
        a.setName("ggege");
        a.setPwd("dfdf");
        a.setGrade(1);

        user2 b = new user2();
    }


}

class User1 {
    String name;
    String pwd;
    int age;
    int grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


}

class user2 {
    String name;
    String pwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}