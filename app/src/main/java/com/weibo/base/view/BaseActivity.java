package com.weibo.base.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weibo on 17-3-5.
 */

public abstract class BaseActivity extends AppCompatActivity {

    public static class ActivityHelp{
        private static List<Activity> activities = new ArrayList<>();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityHelp.activities.add(this);

        setContentView(getLayoutId());
        initView();
        loadData();

    }

    public static void finishAllActivity(){
        if (ActivityHelp.activities != null && ActivityHelp.activities.size() != 0){
            for (int i = 0;i < ActivityHelp.activities.size();i++){
                ActivityHelp.activities.get(i).finish();
            }
            ActivityHelp.activities.clear();
            ActivityHelp.activities = null;
        }
    }

    protected abstract int getLayoutId();

    protected void initView(){}
    protected void loadData(){}

    protected <T extends View> T findView(int id){
        return (T)super.findViewById(id);
    }

}