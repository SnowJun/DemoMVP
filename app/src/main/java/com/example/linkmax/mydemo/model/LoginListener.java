package com.example.linkmax.mydemo.model;

import com.example.linkmax.mydemo.bean.User;

/**
 * Created by SnowJun on 2016/7/29.
 */
public interface LoginListener {

    void LoginSuccess(User user);

    void loginError(String error);

}
