package com.example.linkmax.mydemo.login;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.linkmax.mydemo.R;
import com.example.linkmax.mydemo.base.BaseActivity;
import com.example.linkmax.mydemo.login.bean.User;
import com.example.linkmax.mydemo.login.presenter.LoginPresenter;
import com.example.linkmax.mydemo.login.view.ILoginView;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.orhanobut.logger.Logger;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity implements ILoginView {


    @Bind(R.id.edt_user)
    EditText mEdtUser;
    @Bind(R.id.edt_password)
    EditText mEdtPassword;
    @Bind(R.id.btn_login)
    Button mBtnLogin;
    @Bind(R.id.btn_clear)
    Button mBtnClear;
    @Bind(R.id.cl_msg)
    CoordinatorLayout mClMsg;
    @Bind(R.id.slidingmenulayout)
    SlidingMenu mSlidingMenu;

    private LoginPresenter mPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTransBar();
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        mPresenter = new LoginPresenter(this);
//        initSlidingMenu();
        Logger.e("main_logger");
    }



    @OnClick({R.id.btn_login, R.id.btn_clear})
    public void click(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                mPresenter.login();
                break;
            case R.id.btn_clear:
                mPresenter.clear();
                break;
            default:
                break;
        }
    }


    @Override
    public String getUser() {
        return mEdtUser.getText().toString();
    }

    @Override
    public String getPwd() {
        return mEdtPassword.getText().toString();
    }

    @Override
    public void setUser(String user) {
        mEdtUser.setText(user);
    }

    @Override
    public void setPwd(String pwd) {
        mEdtPassword.setText(pwd);
    }



    @Override
    public void showFailError(String info) {
        Snackbar.make(mClMsg, info, Snackbar.LENGTH_SHORT).show();
    }

    @Override
    public void showSucceedMsg(User user) {
        Snackbar.make(mClMsg, user.getName() + "\n" + user.getPwd(), Snackbar.LENGTH_SHORT).show();
    }

    @Override
    public void initSlidingMenu() {
        mSlidingMenu.setMode(SlidingMenu.LEFT);
        mSlidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        mSlidingMenu.setBehindOffsetRes(R.dimen.shadow_width);
        mSlidingMenu.setFadeDegree(0.35f);
        mSlidingMenu.setMenu(R.layout.menu);
    }



    @Override
    public void onBackPressed() {
        if (mSlidingMenu.isMenuShowing()){
            mSlidingMenu.toggle();
        }else {
            super.onBackPressed();
        }
    }


}
