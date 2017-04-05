package com.darrow.easylife.entity;

/**
 * 项目名:   EasyLife
 * 包名:     com.darrow.easylife.entity
 * 文件名:   WeChatData
 * 创建者:   Dw
 * 创建时间: 2017/3/6 0006 下午 10:46
 * 描述:     微信精选的数据类
 */

public class WeChatData {

    //标题
    private String tltle;
    //出处
    private String source;
    //图片的Url
    private String imgUrl;
    //新闻地址的url
    private String newsUrl;

    public String getTitle() {
        return tltle;
    }

    public void setTitle(String tltle) {
        this.tltle = tltle;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getNewsUrl() {
        return newsUrl;
    }

    public void setNewsUrl(String newsUrl) {
        this.newsUrl = newsUrl;
    }


}
