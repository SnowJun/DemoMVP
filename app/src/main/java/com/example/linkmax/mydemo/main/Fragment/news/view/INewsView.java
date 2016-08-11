package com.example.linkmax.mydemo.main.fragment.news.view;

import com.example.linkmax.mydemo.main.fragment.news.bean.NewsBean;

import java.util.List;

/**
 * 2016/8/10
 *
 * @author SnowJun
 * @since 1.0
 */
public interface INewsView {


    void loadSuccess(List<NewsBean.NewslistBean> been);

    void loadFailed(String error);



}
