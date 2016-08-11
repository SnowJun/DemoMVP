package com.example.linkmax.mydemo.main.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * 主页适配
 * @author SnowJun
 * @since 1.0
 */
public class MainPageAdapter extends FragmentPagerAdapter {

    /**
     * 显示内容集合
     */
    private ArrayList<Fragment> mFragments;
    /**
     * 标题集合
     */
    private ArrayList<String> mTittles;


    public MainPageAdapter(FragmentManager fm, ArrayList<Fragment> fragments, ArrayList<String> tittles) {
        super(fm);
        mFragments = fragments;
        mTittles = tittles;
    }


    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTittles.get(position);
    }

}
