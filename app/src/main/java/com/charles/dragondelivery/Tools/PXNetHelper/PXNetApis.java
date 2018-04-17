package com.charles.dragondelivery.Tools.PXNetHelper;

/**
 * Created by qipx on 2018/4/17.
 */

public class PXNetApis {

    public static final String HOST_URL = "http://192.168.124.26:8080/web/api/";

    //pragma mark =====================LOGIN========================
    public static final String Login_SendSms     = "send/delivery/sms";//发送验证码
    public static final String Login_Login       = "delivery/login";//登录
    public static final String Login_WxLogin     = "login/delivery/wx";//微信登录
    public static final String Login_GetUserInfo = "delivery/user";//获取用户信息
    public static final String Login_Logout      = "delivery/logout";//登出

    //pragma mark =====================地址========================
    public static final String Address_List   = "address/delivery/list";//地址列表
    public static final String Address_Add    = "address/delivery/add";//添加地址
    public static final String Address_Update = "address/delivery/update";//更新地址
    public static final String Address_Delete = "address/delivery/del";//删除地址
    public static final String Address_Detail = "delivery/address";//地址详情

    //pragma mark =====================首页========================
    public static final String Home_OrderInfo = "delivery/addInfo";//首页数据

    //pragma mark =====================订单========================
    public static final String Order_List               = "delivery/speed/list";//订单列表
    public static final String Order_Detail             = "delivery/info";//订单详情
    public static final String Order_NormalConfirmOrder = "delivery/addNormal/ok";//普通版确认订单
    public static final String Order_NormalPlaceOrder   = "delivery/addNormal/do";//普通版下单
    public static final String Order_UrgentConfirmOrder = "delivery/addUrgent/ok";//加急版确认订单
    public static final String Order_UrgentPlaceOrder   = "delivery/addUrgent/do";//加急版下单

    //pragma mark =====================支付========================
    public static final String Pay_WechatPay       = "pay/delivery/wx";//微信支付
    public static final String Pay_WechatPayNotify = "wx/delivery/notify";//微信支付回调
    public static final String Pay_AliPay          = "pay/delivery/alipay";//支付宝支付
    public static final String Pay_AliPayNotify    = "alipay/delivery/notify";//支付宝支付回调
    public static final String Pay_BalancePay      = "pay/delivery/balance";//余额支付

    //pragma mark =====================充值========================
    public static final String Recharge_Charge          = "charge/delivery/add";//充值
    public static final String Recharge_WechatPay       = "charge/pay/delivery/wx";//微信支付充值
    public static final String Recharge_WechatPayNotify = "charge/wx/delivery/notify";//微信支付充值回调
    public static final String Recharge_AliPay          = "charge/delivery/alipay";//支付宝支付充值
    public static final String Recharge_AliPayNotify    = "charge/alipay/delivery/notify";//支付宝支付充值回调

}
