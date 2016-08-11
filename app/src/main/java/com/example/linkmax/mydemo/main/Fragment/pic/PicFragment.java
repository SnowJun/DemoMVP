package com.example.linkmax.mydemo.main.fragment.pic;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.linkmax.mydemo.R;
import com.example.linkmax.mydemo.base.BaseFragment;

/**
 * 图片模块
 * 2016/8/10
 * @author SnowJun
 * @since 1.0
 */
public class PicFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return  inflater.inflate(R.layout.fragment_pic,container,false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }


}
