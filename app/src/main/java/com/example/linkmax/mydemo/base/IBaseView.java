package com.example.linkmax.mydemo.base;

/**
 * Activity基类的View操作
 * 2016/8/10.
 * @author SnowJun
 * @since 1.0
 */
public interface IBaseView {

    void toActivity(Class<?> clazz);

    void setTransBar();

    void showProgressBar();

    void cancelProgressBar();

}
