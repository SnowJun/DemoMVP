package com.example.linkmax.mydemo.login.view;

import com.example.linkmax.mydemo.base.IBaseView;
import com.example.linkmax.mydemo.login.bean.User;

/**
 * Created by SnowJun on 2016/7/29.
 */
public interface ILoginView extends IBaseView{

    String getUser();
    String getPwd();
    void setUser(String user);
    void setPwd(String pwd);
    void showFailError(String info);
    void showSucceedMsg(User user);
    void initSlidingMenu();

}
