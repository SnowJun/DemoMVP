package com.example.linkmax.mydemo.main.fragment.pic;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.linkmax.mydemo.R;
import com.example.linkmax.mydemo.base.BaseFragment;
import com.example.linkmax.mydemo.main.fragment.news.NewsDetailActivity;
import com.example.linkmax.mydemo.main.fragment.pic.adapter.PicAdapter;
import com.example.linkmax.mydemo.main.fragment.pic.bean.PicBean;
import com.example.linkmax.mydemo.main.fragment.pic.presenter.PicPresenter;
import com.example.linkmax.mydemo.main.fragment.pic.view.IPicView;
import com.orhanobut.logger.Logger;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 图片模块
 * 2016/8/10
 *
 * @author SnowJun
 * @since 1.0
 */
public class PicFragment extends BaseFragment implements IPicView {

    @Bind(R.id.tb_pic)
    Toolbar mTbPic;
    @Bind(R.id.rlv_pic)
    RecyclerView mRlvPic;
    private PicPresenter mPicPresenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pic, container, false);
        ButterKnife.bind(this, view);
        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mPicPresenter = new PicPresenter();
        mPicPresenter.listPic(this);
    }


    @Override
    public void loadSuccess(final List<PicBean.NewslistBean> newslist) {
        mRlvPic.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        PicAdapter adapter = new PicAdapter(newslist,getActivity());
        mRlvPic.setAdapter(adapter);
        adapter.setOnItemClickListener(new PicAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent(getActivity(), NewsDetailActivity.class);
                intent.putExtra("loadUrl",newslist.get(position).getUrl());
                startActivity(intent);
            }
        });
    }

    @Override
    public void loadFail(String error) {

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
