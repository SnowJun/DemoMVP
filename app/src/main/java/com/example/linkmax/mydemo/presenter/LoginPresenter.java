package com.example.linkmax.mydemo.presenter;

import android.os.Handler;

import com.example.linkmax.mydemo.bean.User;
import com.example.linkmax.mydemo.model.LoginListener;
import com.example.linkmax.mydemo.model.UserModel;
import com.example.linkmax.mydemo.view.ILoginView;

/**
 * Created by SnowJun 2016/7/29.
 */
public class LoginPresenter {

    private UserModel mUserModel;

    private ILoginView mILoginView;

    private Handler handler = new Handler();

    public LoginPresenter(ILoginView mILoginView) {
        this.mILoginView = mILoginView;
        mUserModel = new UserModel();
    }

    public void login(){
        mILoginView.showProgressBar();
        mUserModel.login(mILoginView.getUser(), mILoginView.getPwd(), new LoginListener() {
            @Override
            public void LoginSuccess(final User user) {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        mILoginView.cancelProgressBar();
                        mILoginView.showSucceedMsg(user);
                    }
                });

            }

            @Override
            public void loginError(final String error) {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        mILoginView.cancelProgressBar();
                        mILoginView.showFailError(error);
                    }
                });

            }
        });
    }

    public void clear(){
        handler.post(new Runnable() {
            @Override
            public void run() {
                mILoginView.setUser("");
                mILoginView.setPwd("");
            }
        });

    }

}
