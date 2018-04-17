package com.charles.dragondelivery.Application.App;

/**
 * Created by qipx on 2018/4/17.
 */

public class PXApp {

    public String uuid;
    public String channelId;

    private static volatile PXApp instance = null;
    private PXApp(){
    }

    public static PXApp getInstance(){
        if (instance == null){
            synchronized (PXApp.class){
                if (instance == null){
                    instance = new PXApp();
                }
            }
        }
        return instance;
    }


}
