package com.charles.dragondelivery.Application;

import android.app.Application;

import com.charles.dragondelivery.Application.App.PXApp;
import com.charles.dragondelivery.Classes.Main.User.PXUser;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;
import com.vondear.rxtools.RxDeviceTool;
import com.vondear.rxtools.RxTool;
import com.yanzhenjie.nohttp.NoHttp;

/**
 * Created by qipx on 2018/4/17.
 */

public class PXApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        setupVendors();
        getDeviceUUID();
        loadUserData();
    }

    private void setupVendors(){
        //初始化NoHttp
        NoHttp.initialize(this);
        //初始化Unversalimageloader
        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this).imageDownloader(
                new BaseImageDownloader(this, 60 * 1000, 60 * 1000))
                .build();
        ImageLoader.getInstance().init(config);
        //初始化RXTools
        RxTool.init(this);
    }

    //获取设备UUID
    private void getDeviceUUID(){
        String uuid = RxDeviceTool.getUniqueSerialNumber();
        PXApp.getInstance().uuid = uuid;
    }

    //获取用户信息
    private void loadUserData(){
        PXUser.getInstance().loadUserData(null);
    }

    //初始化高德地图

}
