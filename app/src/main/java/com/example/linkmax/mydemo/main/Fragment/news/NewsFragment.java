package com.example.linkmax.mydemo.main.fragment.news;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.linkmax.mydemo.R;
import com.example.linkmax.mydemo.base.BaseFragment;
import com.example.linkmax.mydemo.comman.API;
import com.example.linkmax.mydemo.main.fragment.news.adapter.NewsAdapter;
import com.example.linkmax.mydemo.main.fragment.news.bean.NewsBean;
import com.example.linkmax.mydemo.main.fragment.news.model.NewModel;
import com.example.linkmax.mydemo.main.fragment.news.presenter.NewsPresenter;
import com.example.linkmax.mydemo.main.fragment.news.view.INewsView;
import com.orhanobut.logger.Logger;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit2.Call;

/**
 * 新闻模块
 * 2016/8/10
 *
 * @author SnowJun
 * @since 1.0
 */
public class NewsFragment extends BaseFragment implements INewsView {


    @Bind(R.id.tb_news)
    Toolbar mTbNews;
    @Bind(R.id.rlv_news)
    RecyclerView mRlvNews;

    private NewsPresenter mNewsPresenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }

    private void initData() {
        mNewsPresenter = new NewsPresenter();
        mNewsPresenter.listNews(this);
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mNewsPresenter.cancelList();
        ButterKnife.unbind(this);
    }

    @Override
    public void loadSuccess(List<NewsBean.NewslistBean> been) {
        showNewsList(been);
    }

    private void showNewsList(List<NewsBean.NewslistBean> been) {
        NewsAdapter adapter = new NewsAdapter(been,getActivity());
        mRlvNews.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRlvNews.setAdapter(adapter);
    }

    @Override
    public void loadFailed(String error) {

    }
}
