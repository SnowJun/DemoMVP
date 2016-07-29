package com.example.linkmax.mydemo.model;

/**
 * Created by SnowJun on 2016/7/29.
 */
public interface IUserModel {

    void login(String user,String pwd,LoginListener listener);

}
