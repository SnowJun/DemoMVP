package com.example.linkmax.mydemo.main.fragment.pic.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.linkmax.mydemo.R;
import com.example.linkmax.mydemo.base.MyApplication;
import com.example.linkmax.mydemo.main.fragment.news.bean.NewsBean;
import com.example.linkmax.mydemo.main.fragment.pic.bean.PicBean;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.assist.ImageSize;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 2016/8/11
 *
 * @author SnowJun
 * @since 1.0
 */
public class PicAdapter extends RecyclerView.Adapter<PicAdapter.NewsHolder> {


    private Context mContext;

    private List<PicBean.NewslistBean> mNewslistBeen;

    public PicAdapter(List<PicBean.NewslistBean> newslistBeen, Context context) {
        mNewslistBeen = newslistBeen;
        mContext = context;
    }

    @Override
    public NewsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        NewsHolder holder = new NewsHolder(LayoutInflater.from(mContext).inflate(R.layout.item_pic, parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(final NewsHolder holder, final int position) {
        ImageLoader.getInstance().loadImage(mNewslistBeen.get(position).getPicUrl(), MyApplication.options, new ImageLoadingListener() {
            @Override
            public void onLoadingStarted(String imageUri, View view) {

            }

            @Override
            public void onLoadingFailed(String imageUri, View view, FailReason failReason) {

            }

            @Override
            public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
                holder.mImgIcon.setBackground(new BitmapDrawable(loadedImage));
            }

            @Override
            public void onLoadingCancelled(String imageUri, View view) {

            }
        });
        holder.mTxtTitle.setText(mNewslistBeen.get(position).getTitle());
        holder.mCvRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mOnItemClickListener){
                    mOnItemClickListener.onItemClick(position);
                }
            }
        });
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
        @Bind(R.id.cv_root)
        CardView mCvRoot;

        public NewsHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }


    private OnItemClickListener mOnItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        mOnItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener{
        void onItemClick(int position);
    }


}
