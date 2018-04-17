package com.charles.dragondelivery.Tools.PXNetHelper;

/**
 * Created by qipx on 2018/4/17.
 */

public interface PXNetInterface {

//    void onCache(PXNetModel cache);
    void onSuccess(PXNetModel success);
    void  onFailure(Exception exception);
}
