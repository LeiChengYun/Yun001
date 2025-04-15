package com.Day06.动态代理;

/**
 * @Description SmsServiceImpl
 * @Author ChengYun
 * @Date 2025-04-06  16:20
 */
public class SmsServiceImpl implements SmsService {


    public SmsServiceImpl() {
    }


    @Override
    public String sendMessage(String message) {
        System.out.println("send message:" + message);
        return message;
    }
}
