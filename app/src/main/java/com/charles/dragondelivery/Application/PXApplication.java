package com.charles.dragondelivery.Application;

import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;
import com.yanzhenjie.nohttp.NoHttp;

/**
 * Created by qipx on 2018/4/17.
 */

public class PXApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化NoHttp
        NoHttp.initialize(this);
        //初始化Unversalimageloader
        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this).imageDownloader(
                new BaseImageDownloader(this, 60 * 1000, 60 * 1000))
                .build();
        ImageLoader.getInstance().init(config);
    }
}
