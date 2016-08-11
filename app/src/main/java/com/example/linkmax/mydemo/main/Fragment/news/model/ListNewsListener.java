package com.example.linkmax.mydemo.main.fragment.news.model;

import com.example.linkmax.mydemo.main.fragment.news.bean.NewsBean;

import java.util.List;

/**
 * 2016/8/10
 *
 * @author SnowJun
 * @since 1.0
 */
public interface ListNewsListener {


    void listSucceed(List<NewsBean.NewslistBean> been);

    void listFailed(String error);


}
