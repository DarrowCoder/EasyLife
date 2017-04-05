package com.darrow.easylife.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.darrow.easylife.R;
import com.darrow.easylife.utils.UtilTools;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

import static com.darrow.easylife.fragment.UserFragment.IMAGE_REQUEST_CODE;

/**
 * 项目名:   EasyLife
 * 包名:     com.darrow.easylife.ui
 * 文件名:   AboutActivity
 * 创建者:   Dw
 * 创建时间: 2017/3/8 0008 下午 3:18
 * 描述:     TODO
 */

public class AboutActivity extends BaseActivity {

    private ListView mListView;
    private List<String> mList = new ArrayList<>();
    private ArrayAdapter<String> mAdapter;

    private TextView textMotto;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        //去除阴影
        getSupportActionBar().setElevation(0);

        initView();
    }

    //初始化View
    private void initView() {
        textMotto = (TextView) findViewById(R.id.tv_motto);
        mListView = (ListView) findViewById(R.id.mListView);

        mList.add(getString(R.string.text_app_name) + getString(R.string.app_name));
        mList.add(getString(R.string.text_version) + UtilTools.getVersion(this));
        mList.add(getString(R.string.text_app_editor) + getString(R.string.text_app_editor_name));
        mList.add(getString(R.string.text_school) + getString(R.string.text_swun));



        mAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mList);
        //设置适配器
        mListView.setAdapter(mAdapter);

        UtilTools.setFont(this,textMotto);



    }

}
