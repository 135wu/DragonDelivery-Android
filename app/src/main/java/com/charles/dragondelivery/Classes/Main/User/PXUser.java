package com.charles.dragondelivery.Classes.Main.User;

import com.charles.dragondelivery.Tools.PXNetHelper.PXNetApis;
import com.charles.dragondelivery.Tools.PXNetHelper.PXNetHelper;
import com.charles.dragondelivery.Tools.PXNetHelper.PXNetInterface;
import com.charles.dragondelivery.Tools.PXNetHelper.PXNetModel;

/**
 * Created by qipx on 2018/4/17.
 */

public class PXUser {

    private String userId;
    private  String tel;
    private  String name;
    private  String logo;
    private  String money;
    private  boolean isLogin;

    private static PXUser instance = null;
    private PXUser(){
    }

    public static PXUser getInstance(){
        if (instance == null){
            synchronized (PXUser.class){
                if (instance == null){
                    instance = new PXUser();
                }
            }
        }
        return instance;
    }


    //获取用户信息
    public void loadUserData(final PXUserInterface callBack){
        PXNetHelper.postWithURLString(PXNetApis.Login_GetUserInfo, null, new PXNetInterface() {
            @Override
            public void onSuccess(PXNetModel success) {
                if (success.errorCode == PXNetModel.PXNetError.PXNetSuccess){
                    //请求数据成功
                    instance.isLogin = true;
                    if (callBack != null)callBack.onSuccess(true);
                }else {
                    instance.isLogin = false;
                    if (callBack!=null)callBack.onSuccess(false);
                }
            }

            @Override
            public void onFailure(Exception exception) {
                instance.isLogin = false;
                if (callBack!=null)callBack.onSuccess(false);
            }
        });
    }

    //退出登录
    public void logout(final PXUserInterface callBack){
        PXNetHelper.postWithURLString(PXNetApis.Login_Logout, null, new PXNetInterface() {
            @Override
            public void onSuccess(PXNetModel success) {
                if (success.errorCode == PXNetModel.PXNetError.PXNetSuccess){
                    if (callBack != null) callBack.onSuccess(true);
                }else {
                    if (callBack != null) callBack.onSuccess(false);
                }
            }

            @Override
            public void onFailure(Exception exception) {
                if (callBack != null) callBack.onSuccess(false);
            }
        });
    }

}


