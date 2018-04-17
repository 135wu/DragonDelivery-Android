package com.charles.dragondelivery.Tools.PXNetHelper;

import com.alibaba.fastjson.JSON;
import com.charles.dragondelivery.Application.App.PXApp;
import com.yanzhenjie.nohttp.NoHttp;
import com.yanzhenjie.nohttp.RequestMethod;
import com.yanzhenjie.nohttp.rest.OnResponseListener;
import com.yanzhenjie.nohttp.rest.Request;
import com.yanzhenjie.nohttp.rest.RequestQueue;
import com.yanzhenjie.nohttp.rest.Response;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by qipx on 2018/4/17.
 */

public class PXNetHelper {

    public static void postWithURLString(String URLString,
                                         Map<String,String> map,
                                         final PXNetInterface callBack){
        URLString = PXNetApis.HOST_URL+ URLString;
        HashMap<String,String> params = new HashMap<>();
        params.putAll(map);
        params.put("uuid", "A44782A4-C82F-445B-BD66-85BA8DE919A1");
        params.put("os","android");
//        params.put("channelId",PXApp.getInstance().channelId);
        params.put("locate","1");
        final Request request = NoHttp.createStringRequest(URLString , RequestMethod.POST);
        request.add(params);
        RequestQueue queue = NoHttp.newRequestQueue();
        queue.add(0, request, new OnResponseListener<String>() {
            @Override
            public void onStart(int what) {

            }

            @Override
            public void onSucceed(int what, Response<String> response) {
                String result = response.get();
                PXNetModel model = JSON.parseObject(response.get(),PXNetModel.class);
                if (callBack!=null) callBack.onSuccess(model);
            }

            @Override
            public void onFailed(int what, Response<String> response) {
                if (callBack!=null)callBack.onFailure(response.getException());
            }

            @Override
            public void onFinish(int what) {

            }
        });
    }

}
