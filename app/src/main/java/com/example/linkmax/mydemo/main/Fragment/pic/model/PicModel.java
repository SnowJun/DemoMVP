package com.example.linkmax.mydemo.main.fragment.pic.model;

import com.example.linkmax.mydemo.comman.API;
import com.example.linkmax.mydemo.comman.net.NetListener;
import com.example.linkmax.mydemo.comman.net.NetUtil;
import com.example.linkmax.mydemo.main.fragment.pic.bean.PicBean;
import com.google.gson.Gson;
import com.orhanobut.logger.Logger;

import java.util.HashMap;
import java.util.List;

import retrofit2.Call;

/**
 * 2016/8/11
 *
 * @author SnowJun
 * @since 1.0
 */
public class PicModel implements IPicModel {


    private Call<?> mCall;

    @Override
    public void loadPic(String apikey, int num, final ListPicListener listPicListener) {
        HashMap<String,String> headers = new HashMap<String, String>();
        headers.put("apikey",apikey);
        HashMap<String,String> paras = new HashMap<String, String>();
        paras.put("num",num+"");
        mCall = NetUtil.getInstance().doGet(API.BASE_URL, API.PIC_URL, paras, headers, new NetListener() {
            @Override
            public void netSuccess(String info) {
                Logger.d("info-->" + info);
                Gson gson = new Gson();
                PicBean picBean = gson.fromJson(info, PicBean.class);
                List<PicBean.NewslistBean> newslist = picBean.getNewslist();
                listPicListener.loadSuccess(newslist);
            }

            @Override
            public void netFail(String info) {
                listPicListener.loadFailed(info);
            }
        });

    }

    @Override
    public void cancelPicCall() {
        NetUtil.getInstance().cancelCall(mCall);
    }


}
