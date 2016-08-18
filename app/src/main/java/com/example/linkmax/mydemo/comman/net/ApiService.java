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

    /**
     @Path：所有在网址中的参数（URL的问号前面），如：
     http://102.10.10.132/api/Accounts/{accountId}
     @Query：URL问号后面的参数，如：
     http://102.10.10.132/api/Comments?access_token={access_token}
     @QueryMap：相当于多个@Query
     @Field：用于POST请求，提交单个数据
     @Body：相当于多个@Field，以对象的形式提交
     */

    @GET
    Call<ResponseBody> doGet(@Url String url, @QueryMap HashMap<String,String> map);


    @GET
    Call<ResponseBody> doGet(@Url String url, @QueryMap HashMap<String,String> map, @HeaderMap HashMap<String,String> heads);



    @POST
    Call<ResponseBody> doPost(@FieldMap HashMap<String,String> map );


    @POST
    Call<ResponseBody> doPost(@FieldMap HashMap<String,String> map ,@HeaderMap HashMap<String,String> heads );

}
