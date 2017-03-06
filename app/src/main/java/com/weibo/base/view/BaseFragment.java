package com.weibo.base.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.weibo.base.util.ViewUtil;

/**
 * A simple {@link Fragment} subclass.
 */
public abstract class BaseFragment extends Fragment {

    private View view;

    public BaseFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(getLayoutId(),container,false);
        initView();
        if (getUserVisibleHint()){
            loadData();
        }
        return view;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser && view != null){
            loadData();
        }
    }

    protected void initView(){}
    protected void loadData(){}

    protected abstract int getLayoutId();

    protected View findView(int id){
        return ViewUtil.findView(view,id);
    }

}
