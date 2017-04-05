package com.darrow.easylife.entity;

/**
 * 项目名:   EasyLife
 * 包名:     com.darrow.easylife.entity
 * 文件名:   ChatListData
 * 创建者:   Dw
 * 创建时间: 2017/3/6 0006 下午 8:52
 * 描述:     对话列表的实体
 */

public class ChatListData {

    //type
    private int type;
    //文本
    private String text;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
