package com.example.linkmax.mydemo.view;

import com.example.linkmax.mydemo.bean.User;

/**
 * Created by SnowJun on 2016/7/29.
 */
public interface ILoginView {

    String getUser();
    String getPwd();
    void setUser(String user);
    void setPwd(String pwd);
    void showProgressBar();
    void cancelProgressBar();
    void showFailError(String info);
    void showSucceedMsg(User user);
}
