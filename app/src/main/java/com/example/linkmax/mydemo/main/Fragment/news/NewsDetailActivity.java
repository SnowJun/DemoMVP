package com.example.linkmax.mydemo.main.fragment.news;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.linkmax.mydemo.R;
import com.example.linkmax.mydemo.base.BaseActivity;
import com.example.linkmax.mydemo.main.fragment.news.view.INewsDetailView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 2016/8/11
 *
 * @author SnowJun
 * @since 1.0
 */
public class NewsDetailActivity extends BaseActivity implements INewsDetailView{


    @Bind(R.id.wv_detail)
    WebView mWvDetail;

    private String loadUrl;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);
        ButterKnife.bind(this);
        initData();
        showDetail();
    }

    @Override
    public void initData() {
        loadUrl = getIntent().getStringExtra("loadUrl");
    }

    @Override
    public void showDetail() {
        mWvDetail.loadUrl(loadUrl);
        mWvDetail.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                //返回值是true的时候控制去WebView打开，为false调用系统浏览器或第三方浏览器
                view.loadUrl(url);
                return true;
            }
        });
    }


}
