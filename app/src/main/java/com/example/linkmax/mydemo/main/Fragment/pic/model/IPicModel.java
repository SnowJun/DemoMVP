package com.example.linkmax.mydemo.main.fragment.pic.model;

/**
 * 2016/8/11
 *
 * @author SnowJun
 * @since 1.0
 */
public interface IPicModel {

    void loadPic(String apikey,int num,ListPicListener listPicListener);

    void cancelPicCall();

}
