package com.example.linkmax.mydemo.model;

import com.example.linkmax.mydemo.bean.User;

/**
 * Created by SnowJun on 2016/7/29.
 */
public class UserModel implements IUserModel{

    @Override
    public void login(final String user, final String pwd, final LoginListener listener) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if ("user".equals(user) && "123456".equals(pwd)){
                    listener.LoginSuccess(new User("user","123456"));
                }else {
                    listener.loginError("用户名或密码错误");
                }
            }
        }).start();

    }




}
