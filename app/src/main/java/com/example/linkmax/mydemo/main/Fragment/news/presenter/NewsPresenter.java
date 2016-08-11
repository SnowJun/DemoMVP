package com.example.linkmax.mydemo.main.fragment.news.presenter;
;
import com.example.linkmax.mydemo.comman.API;
import com.example.linkmax.mydemo.comman.net.NetUtil;
import com.example.linkmax.mydemo.main.fragment.news.bean.NewsBean;
import com.example.linkmax.mydemo.main.fragment.news.model.INewModel;
import com.example.linkmax.mydemo.main.fragment.news.model.ListNewsListener;
import com.example.linkmax.mydemo.main.fragment.news.model.NewModel;
import com.example.linkmax.mydemo.main.fragment.news.view.INewsView;

import java.util.List;


/**
 * 2016/8/10
 *
 * @author SnowJun
 * @since 1.0
 */
public class NewsPresenter {

    private INewModel mINewModel;

    public void listNews(final INewsView iNewsView){
        mINewModel = new NewModel();
        mINewModel.listNews(API.KEY, 10, new ListNewsListener() {
            @Override
            public void listSucceed(List<NewsBean.NewslistBean> been) {
                iNewsView.loadSuccess(been);
            }

            @Override
            public void listFailed(String error) {
                iNewsView.loadFailed(error);
            }
        });
    }

    public void cancelList(){
       mINewModel.cancelListNews();
    }

}
