package com.darrow.easylife.entity;

import cn.bmob.v3.BmobUser;

/**
 * 项目名:   EasyLife
 * 包名:     com.darrow.easylife.entity
 * 文件名:   MyUser
 * 创建者:   Dw
 * 创建时间: 2017/3/5 0005 下午 8:09
 * 描述:     用户属性
 */

public class MyUser extends BmobUser{
    private int age;
    private boolean sex;
    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
