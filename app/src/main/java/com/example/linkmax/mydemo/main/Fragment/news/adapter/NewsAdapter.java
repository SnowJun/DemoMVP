package com.example.linkmax.mydemo.main.fragment.news.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.linkmax.mydemo.R;
import com.example.linkmax.mydemo.main.fragment.news.bean.NewsBean;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.orhanobut.logger.Logger;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 2016/8/11
 *
 * @author SnowJun
 * @since 1.0
 */
public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsHolder> {


    private Context mContext;

    private List<NewsBean.NewslistBean> mNewslistBeen;

    public NewsAdapter(List<NewsBean.NewslistBean> newslistBeen, Context context) {
        mNewslistBeen = newslistBeen;
        mContext = context;
    }

    @Override
    public NewsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        NewsHolder holder = new NewsHolder(LayoutInflater.from(mContext).inflate(R.layout.item_news, parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(NewsHolder holder, int position) {
        Logger.d(mNewslistBeen.get(position).getCtime());
        Logger.d(mNewslistBeen.get(position).getUrl());
        Logger.d(mNewslistBeen.get(position).getPicUrl());
        ImageLoader.getInstance().displayImage(mNewslistBeen.get(position).getPicUrl(),holder.mImgIcon);
        holder.mTxtTitle.setText(mNewslistBeen.get(position).getTitle());
        holder.mTxtContent.setText(mNewslistBeen.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return mNewslistBeen.size();
    }

    class NewsHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.img_icon)
        ImageView mImgIcon;
        @Bind(R.id.txt_title)
        TextView mTxtTitle;
        @Bind(R.id.txt_content)
        TextView mTxtContent;

        public NewsHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }


}
