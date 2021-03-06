package com.darrow.easylife.utils;

import android.util.Log;

/**
 * 项目名:   EasyLife
 * 包名:     com.darrow.easylife.ui
 * 文件名:   L
 * 创建者:   Dw
 * 创建时间: 2017/3/4 0004 上午 10:46
 * 描述:     Log封装类
 */

public class L {

    //开关
    public static final boolean DEBUG = true;
    //TAG
    public static final String TAG = "EasyLife";

    //五个等级 DIWEF

    public static void d(String text){
        if (DEBUG){
            Log.d(TAG,text);
        }
    }

    public static void i(String text){
        if (DEBUG){
            Log.i(TAG,text);
        }
    }

    public static void w(String text){
        if (DEBUG){
            Log.w(TAG,text);
        }
    }

    public static void e(String text){
        if (DEBUG){
            Log.e(TAG,text);
        }
    }

}
