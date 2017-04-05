package com.darrow.easylife.application;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;
import com.darrow.easylife.utils.StaticClass;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;
import com.tencent.bugly.crashreport.CrashReport;

import cn.bmob.v3.Bmob;

/**
 * 项目名:   EasyLife
 * 包名:     com.darrow.easylife.application
 * 文件名:   BaseApplication
 * 创建者:   Dw
 * 创建时间: 2017/3/2 0002 下午 11:29
 * 描述:     BaseApplication
 */

public class BaseApplication extends Application{

    @Override
    public void onCreate() {

        super.onCreate();
        //初始化Bugly
        CrashReport.initCrashReport(getApplicationContext(), StaticClass.BUGLY_APP_ID, true);
        //初始化Bmob
        Bmob.initialize(this, StaticClass.BMOB_APP_ID);
        // 将“12345678”替换成您申请的APPID，申请地址：http://open.voicecloud.cn
        SpeechUtility.createUtility(getApplicationContext(), SpeechConstant.APPID +"="+StaticClass.VOICE_KEY);
        //在使用SDK各组件之前初始化context信息，传入ApplicationContext
        //注意该方法要再setContentView方法之前实现
        SDKInitializer.initialize(getApplicationContext());
    }
}
