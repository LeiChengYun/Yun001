package com.Day06.静态代理;

/**
 * @Description SmsServiceImpl
 * @Author ChengYun
 * @Date 2025-04-06  16:20
 */
public class SmsServiceImpl implements SmsService {

    public SmsServiceImpl() {
    }

    @Override
    public String send(String message) {
        System.out.println("send message:" + message);
        return message;
    }
}
