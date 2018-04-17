package com.charles.dragondelivery.Tools.PXNetHelper;

import org.json.JSONObject;

/**
 * Created by qipx on 2018/4/17.
 */

public class PXNetModel {

    public enum PXNetError{
        PXNetSuccess ,//成功
        PXNetFailure,//失败
        PXNetUnLogin;//未登录
    }
    public int code;
    public String msg;
    public JSONObject data;

    public PXNetError getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(PXNetError errorCode) {
        this.errorCode = errorCode;
    }

    public PXNetError errorCode;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        PXNetError error = PXNetError.PXNetFailure;
        if (code == 100) error = PXNetError.PXNetSuccess;
        if (code == 200) error = PXNetError.PXNetUnLogin;
        if (code == 300) error = PXNetError.PXNetFailure;
        this.errorCode =error;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public JSONObject getData() {
        return data;
    }

    public void setData(JSONObject data) {
        this.data = data;
    }
}
