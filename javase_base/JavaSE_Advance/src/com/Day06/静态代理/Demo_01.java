package com.Day06.静态代理;

/**
 * @Description Demo_01
 * @Author ChengYun
 * @Date 2025-04-05  22:26
 */
public class Demo_01 {
    public static void main(String[] args) {
        SmsService smsService = new SmsServiceImpl();
        SmsService smsServiceProxy = new SmsProxy(smsService);
        smsServiceProxy.send("你好，世界");
    }
}
