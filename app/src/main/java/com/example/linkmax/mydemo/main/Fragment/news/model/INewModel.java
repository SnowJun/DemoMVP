package com.example.linkmax.mydemo.main.fragment.news.model;


import retrofit2.Call;

/**
 * 2016/8/10
 *
 * @author SnowJun
 * @since 1.0
 */
public interface INewModel{


    void listNews(String apikey, int num, ListNewsListener listener);

    void cancelListNews();

}
