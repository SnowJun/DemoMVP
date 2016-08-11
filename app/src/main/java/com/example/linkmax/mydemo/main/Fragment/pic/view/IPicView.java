package com.example.linkmax.mydemo.main.fragment.pic.view;

import com.example.linkmax.mydemo.main.fragment.pic.bean.PicBean;

import java.util.List;

/**
 * 2016/8/11
 *
 * @author SnowJun
 * @since 1.0
 */
public interface IPicView {


    void loadSuccess(List<PicBean.NewslistBean> newslist);

    void loadFail(String error);

}
