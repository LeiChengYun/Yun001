package com.Day06.动态代理;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description Test01
 * @Author ChengYun
 * @Date 2025-04-06  16:28
 */
public class Test01 {
    public static void main(String[] args) {
       SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
       smsService.sendMessage("你好美丽新世界！！！！");
    }
}
