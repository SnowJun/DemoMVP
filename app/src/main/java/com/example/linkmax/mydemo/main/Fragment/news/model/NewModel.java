package com.example.linkmax.mydemo.main.fragment.news.model;

import com.example.linkmax.mydemo.comman.API;
import com.example.linkmax.mydemo.comman.net.NetListener;
import com.example.linkmax.mydemo.comman.net.NetUtil;
import com.example.linkmax.mydemo.main.fragment.news.bean.NewsBean;
import com.google.gson.Gson;
import com.orhanobut.logger.Logger;

import java.util.HashMap;

import retrofit2.Call;


/**
 * 2016/8/10
 *
 * @author SnowJun
 * @since 1.0
 */
public class NewModel implements INewModel {

    private Call<?> mListNewsCall;

    @Override
    public void listNews(String apikey, int num, final ListNewsListener listener) {
        HashMap<String, String> paras = new HashMap<String, String>();
        paras.put("num", num + "");
        HashMap<String, String> headers = new HashMap<String, String>();
        headers.put("apikey",apikey);
        mListNewsCall = NetUtil.getInstance().doGet(API.BASE_URL,API.NEWS_URL, paras, headers,new NetListener() {
            @Override
            public void netSuccess(String info) {
                Logger.d("info----------->" + info);

                Gson gson = new Gson();
                NewsBean bean = gson.fromJson(info, NewsBean.class);
                listener.listSucceed(bean.getNewslist());
            }

            @Override
            public void netFail(String info) {
                listener.listFailed(info);
            }
        });
    }

    @Override
    public void cancelListNews() {
        NetUtil.getInstance().cancelCall(mListNewsCall);
    }


}
