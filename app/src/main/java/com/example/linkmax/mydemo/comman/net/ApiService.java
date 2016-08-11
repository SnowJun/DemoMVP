package com.example.linkmax.mydemo.comman.net;

import java.util.HashMap;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/**
 * 2016/8/10
 *
 * @author SnowJun
 * @since 1.0
 */
public interface ApiService {


    @GET
    Call<ResponseBody> doGet(@Url String url, @QueryMap HashMap<String,String> map);


    @GET
    Call<ResponseBody> doGet(@Url String url, @QueryMap HashMap<String,String> map, @HeaderMap HashMap<String,String> heads);



    @POST
    Call<ResponseBody> doPost(@FieldMap HashMap<String,String> map );


    @POST
    Call<ResponseBody> doPost(@FieldMap HashMap<String,String> map ,@HeaderMap HashMap<String,String> heads );

}
