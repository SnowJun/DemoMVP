package com.example.linkmax.mydemo.main.fragment.pic.model;

import com.example.linkmax.mydemo.main.fragment.pic.bean.PicBean;

import java.util.List;

/**
 * 2016/8/11
 *
 * @author SnowJun
 * @since 1.0
 */
public interface ListPicListener {

    void loadSuccess(List<PicBean.NewslistBean> newslist);

    void loadFailed(String error);



}
