package com.example.linkmax.mydemo.base;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.FragmentActivity;
import android.view.WindowManager;

/**
 * Activity基类
 * 2016/8/10.
 * @author SnowJun
 * @since 1.0
 */
public class BaseActivity extends FragmentActivity implements IBaseView {



    private ProgressDialog mProgressDialog;


    @Override
    public void toActivity(Class<?> clazz) {
        Intent intent = new Intent(this,clazz);
        startActivity(intent);
    }

    @Override
    public void setTransBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }
    }

    @Override
    public void showProgressBar() {
        mProgressDialog = ProgressDialog.show(this, "", "载入中...");
        mProgressDialog.show();
    }

    @Override
    public void cancelProgressBar() {
        mProgressDialog.dismiss();
    }
}
