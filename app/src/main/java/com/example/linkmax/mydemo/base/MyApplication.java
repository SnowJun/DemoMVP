package com.example.linkmax.mydemo.base;

import android.app.Application;
import android.graphics.Bitmap;

import com.example.linkmax.mydemo.R;
import com.nostra13.universalimageloader.cache.disc.impl.UnlimitedDiskCache;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.cache.memory.impl.WeakMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.nostra13.universalimageloader.core.display.RoundedBitmapDisplayer;
import com.nostra13.universalimageloader.utils.StorageUtils;
import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;

import java.io.File;


/**
 * Application类
 * 2016/8/10.
 * @author SnowJun
 * @since 1.0
 */
public class MyApplication extends Application {


    public static DisplayImageOptions options;        // DisplayImageOptions是用于设置图片显示的类
    public static DisplayImageOptions options_head;        // DisplayImageOptions是用于设置图片显示的类
    public static DisplayImageOptions options_splash_ad;

    @Override
    public void onCreate() {
        super.onCreate();
        initLogger();
        initImageLoader();
    }

    /**
     * 初始化ImageLoader
     */
    private void initImageLoader() {
        File cacheDir = StorageUtils.getOwnCacheDirectory(this, "/MyDemo/cache/image");//获取到缓存的目录地址

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this)
                .threadPriority(Thread.NORM_PRIORITY - 2)
                .threadPoolSize(3)
                .denyCacheImageMultipleSizesInMemory()
                .discCacheFileNameGenerator(new Md5FileNameGenerator())
                .tasksProcessingOrder(QueueProcessingType.LIFO)
                .writeDebugLogs() // Remove for release app
                .memoryCache(new WeakMemoryCache())
                .discCache(new UnlimitedDiskCache(cacheDir))//自定义缓存路径
                .build();
        // Initialize ImageLoader with configuration.
        ImageLoader.getInstance().init(config);

        options = new DisplayImageOptions.Builder()
                .showStubImage(R.mipmap.def_pic)            // 设置图片下载期间显示的图片
                .showImageForEmptyUri(R.mipmap.def_pic)    // 设置图片Uri为空或是错误的时候显示的图片
                .showImageOnFail(R.mipmap.def_pic)        // 设置图片加载或解码过程中发生错误显示的图片
                .cacheInMemory(true)                        // 设置下载的图片是否缓存在内存中
                .cacheOnDisc(true)                            // 设置下载的图片是否缓存在SD卡中
//                .displayer(new RoundedBitmapDisplayer(20))	// 设置成圆角图片
                .bitmapConfig(Bitmap.Config.RGB_565)
                .build();


        options_head = new DisplayImageOptions.Builder()

                .showStubImage(R.mipmap.def_pic)            // 设置图片下载期间显示的图片
                .showImageForEmptyUri(R.mipmap.def_pic)    // 设置图片Uri为空或是错误的时候显示的图片
                .showImageOnFail(R.mipmap.def_pic)        // 设置图片加载或解码过程中发生错误显示的图片
                .cacheInMemory(false)                        // 设置下载的图片是否缓存在内存中
                .cacheOnDisc(false)                            // 设置下载的图片是否缓存在SD卡中
                //.displayer(new RoundedBitmapDisplayer(20))	// 设置成圆角图片
                .bitmapConfig(Bitmap.Config.RGB_565)
                .build();

        options_splash_ad = new DisplayImageOptions.Builder()
                .cacheInMemory(true)                        // 设置下载的图片是否缓存在内存中
                .cacheOnDisc(true)                            // 设置下载的图片是否缓存在SD卡中
                //.displayer(new RoundedBitmapDisplayer(20))	// 设置成圆角图片
                .bitmapConfig(Bitmap.Config.RGB_565)
                .build();
    }

    /**
     * 初始化Logger
     */
    private void initLogger() {
        Logger.init("my_tag").hideThreadInfo().setMethodCount(2).setLogLevel(LogLevel.FULL);
    }
}
