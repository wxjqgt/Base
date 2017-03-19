package com.weibo.base.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by weibo on 17-3-5.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        initView();
    }

    @Override
    protected void onStart() {
        super.onStart();
        loadData();
    }

    protected abstract int getLayoutId();

    protected void initView(){}
    protected void loadData(){}

    protected <T extends View> T findView(int id){
        return (T)super.findViewById(id);
    }

}
