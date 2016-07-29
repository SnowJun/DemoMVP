package com.example.linkmax.mydemo;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.linkmax.mydemo.bean.User;
import com.example.linkmax.mydemo.presenter.LoginPresenter;
import com.example.linkmax.mydemo.view.ILoginView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements ILoginView {


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

    private ProgressDialog mProgressDialog;

    private LoginPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mPresenter = new LoginPresenter(this);
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
    public void showProgressBar() {
        mProgressDialog = ProgressDialog.show(this, "", "正在登陆，请稍后..");
        mProgressDialog.show();
    }

    @Override
    public void cancelProgressBar() {
        mProgressDialog.dismiss();
    }

    @Override
    public void showFailError(String info) {
        Snackbar.make(mClMsg, info, Snackbar.LENGTH_SHORT).show();
    }

    @Override
    public void showSucceedMsg(User user) {
        Snackbar.make(mClMsg, user.getName() + "\n" + user.getPwd(), Snackbar.LENGTH_SHORT).show();
    }
}
