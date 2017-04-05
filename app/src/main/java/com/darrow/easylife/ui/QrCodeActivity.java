package com.darrow.easylife.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import com.darrow.easylife.R;
import com.xys.libzxing.zxing.encoding.EncodingUtils;

/**
 * 项目名:   EasyLife
 * 包名:     com.darrow.easylife.ui
 * 文件名:   QrCodeActivity
 * 创建者:   Dw
 * 创建时间: 2017/3/8 0008 下午 3:09
 * 描述:     生成二维码
 */

public class QrCodeActivity extends BaseActivity {

    //我的二维码
    private ImageView iv_qr_code;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr_code);

        initView();
    }

    private void initView() {

        iv_qr_code = (ImageView) findViewById(R.id.iv_qr_code);
        //屏幕的宽
        int width = getResources().getDisplayMetrics().widthPixels;

        Bitmap qrCodeBitmap = EncodingUtils.createQRCode("我是Easy生活", width / 2, width / 2,
                BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
        iv_qr_code.setImageBitmap(qrCodeBitmap);
    }
}
