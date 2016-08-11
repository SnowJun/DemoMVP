package com.example.linkmax.mydemo.comman.net;


import java.io.IOException;
import java.util.HashMap;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * 2016/8/10
 *  Net请求 工具类
 * @author SnowJun
 * @since 1.0
 */
public class NetUtil {

    private static NetUtil ourInstance;

    public static NetUtil getInstance() {
        if (null == ourInstance){
            ourInstance = new NetUtil();
        }
        return ourInstance;
    }

    private NetUtil() {
    }

    /**
     * Get请求的方法
     * @since  1.0
     * @param url   请求的基础Url
     * @param url   请求的Url
     * @param paras 参数
     * @param listener  请求的监听
     * @return  Call  返回当前的请求，方便取消
     */
    public Call<?> doGet(String baseUrl,String url, HashMap<String,String> paras, final NetListener listener){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .build();
        ApiService service = retrofit.create(ApiService.class);
        Call<ResponseBody> call = service.doGet(url,paras);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    listener.netSuccess(response.body().string());
                } catch (IOException e) {
                    listener.netFail(e.toString());
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                listener.netFail(t.toString());
            }
        });
        return call;
    }


    /**
     * Get请求的方法
     * @since  1.0
     * @param baseUrl   请求的基础Url
     * @param paras 参数
     * @param listener  请求的监听
     * @return  Call  返回当前的请求，方便取消u
     */
    public Call<?> doGet(String baseUrl,String url, HashMap<String,String> paras,HashMap<String,String> headers, final NetListener listener){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .build();
        ApiService service = retrofit.create(ApiService.class);
        Call<ResponseBody> call = service.doGet(url,paras,headers);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    listener.netSuccess(response.body().string());
                } catch (IOException e) {
                    listener.netFail(e.toString());
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                listener.netFail(t.toString());
            }
        });
        return call;
    }


    /**
     * post请求的方法
     * @since 1.0
     * @param url 请求的url
     * @param paras  请求的参数
     * @param listener  请求的监听
     * @return  Call  当前的请求，方便取消请求
     */
    public Call<?> doPost(String url, HashMap<String,String> paras, final NetListener listener){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .build();
        ApiService service = retrofit.create(ApiService.class);
        Call<ResponseBody> call = service.doPost(paras);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    listener.netSuccess(response.body().string());
                } catch (IOException e) {
                    listener.netFail(e.toString());
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                listener.netFail(t.toString());
            }
        });
        return call;
    }


    /**
     * post请求的方法
     * @since 1.0
     * @param url 请求的url
     * @param paras  请求的参数
     * @param listener  请求的监听
     * @return  Call  当前的请求，方便取消请求
     */
    public Call<?> doPost(String url, HashMap<String,String> paras, HashMap<String,String> headers, final NetListener listener){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .build();
        ApiService service = retrofit.create(ApiService.class);
        Call<ResponseBody> call = service.doPost(paras,headers);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    listener.netSuccess(response.body().string());
                } catch (IOException e) {
                    listener.netFail(e.toString());
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                listener.netFail(t.toString());
            }
        });
        return call;
    }

    /**
     * 取消指定请求的方法
     * @param call 指定的请求
     */
    public void cancelCall(Call<?> call){
        if (null != call && !call.isCanceled()){
            call.cancel();
        }
    }

}
