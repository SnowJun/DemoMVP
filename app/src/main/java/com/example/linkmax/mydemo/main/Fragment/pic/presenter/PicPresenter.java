package com.example.linkmax.mydemo.main.fragment.pic.presenter;

import com.example.linkmax.mydemo.comman.API;
import com.example.linkmax.mydemo.main.fragment.pic.bean.PicBean;
import com.example.linkmax.mydemo.main.fragment.pic.model.IPicModel;
import com.example.linkmax.mydemo.main.fragment.pic.model.ListPicListener;
import com.example.linkmax.mydemo.main.fragment.pic.model.PicModel;
import com.example.linkmax.mydemo.main.fragment.pic.view.IPicView;

import java.util.List;

/**
 * 2016/8/11
 *
 * @author SnowJun
 * @since 1.0
 */
public class PicPresenter {

    private IPicModel mIPicModel;

    public void listPic(final IPicView iPicView){

        mIPicModel = new PicModel();
        mIPicModel.loadPic(API.KEY,50, new ListPicListener() {
            @Override
            public void loadSuccess(List<PicBean.NewslistBean> newslist) {
                iPicView.loadSuccess(newslist);
            }

            @Override
            public void loadFailed(String error) {
                iPicView.loadFail(error);
            }
        });

    }

    public void cancelListPic(){
        mIPicModel.cancelPicCall();
    }


}
