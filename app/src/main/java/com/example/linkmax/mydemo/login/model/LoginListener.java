package com.example.linkmax.mydemo.login.model;

import com.example.linkmax.mydemo.login.bean.User;

/**
 * Created by SnowJun on 2016/7/29.
 */
public interface LoginListener {

    void LoginSuccess(User user);

    void loginError(String error);

}
