package com.example.linkmax.mydemo.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.example.linkmax.mydemo.R;
import com.example.linkmax.mydemo.base.BaseActivity;
import com.example.linkmax.mydemo.main.adapter.MainPageAdapter;
import com.example.linkmax.mydemo.main.fragment.joke.JokesFragment;
import com.example.linkmax.mydemo.main.fragment.news.NewsFragment;
import com.example.linkmax.mydemo.main.fragment.pic.PicFragment;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnPageChange;

/**
 * 2016/8/10
 主页
 * @author SnowJun
 * @since 1.0
 */
public class MainActivity extends BaseActivity {

    @Bind(R.id.vp_main)
    ViewPager mVpMain;
    @Bind(R.id.tab_main)
    TabLayout mTabMain;

    private ArrayList<Fragment> mFragments;
    private ArrayList<String> mTittles;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initData();
        setShowFragment();
    }

    private void setShowFragment() {
        mVpMain.setAdapter(new MainPageAdapter(getSupportFragmentManager(),mFragments,mTittles));
        mTabMain.setupWithViewPager(mVpMain);
    }

    private void initData() {

        mFragments = new ArrayList<Fragment>();
        mFragments.add(new NewsFragment());
        mFragments.add(new JokesFragment());
        mFragments.add(new PicFragment());
        mTittles = new ArrayList<String>();
        mTittles.add(getString(R.string.title_news));
        mTittles.add(getString(R.string.title_joke));
        mTittles.add(getString(R.string.title_pic));
    }


    @OnPageChange(R.id.vp_main)
    public void onPageChange(){

    }



}
