package com.example.linkmax.mydemo.comman.net;

/**
 * 2016/8/10
 *  网络请求监听工具
 * @author SnowJun
 * @since 1.0
 */
public interface NetListener {

    /**
     * 请求成功回调方法
     * @param info  请求出的字符串信息
     */
    void netSuccess(String info);

    /**
     * 请求失败回调f昂发
     * @param info  请求失败的错误信息
     */
    void netFail(String info);

}
