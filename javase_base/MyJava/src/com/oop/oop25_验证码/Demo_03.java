package com.oop.oop25_验证码;

import java.rmi.Naming;

/**
 * @Description Demo_03
 * @Author ChengYun
 * @Date 2025-03-28  12:12
 */
public class Demo_03 {
    public static void main(String[] args) {
        // 需求: 13912345678  ==》 139****5678  手机号脱敏
        // 语法：字符串.substring(开始索引下标，结束索引下标)
        //      截取字符串从指定开始索引下标到结束索引下标位置，不包含结束位置

        //1.定义手机号
        String phone = "13912345678";
        //     下标     012....
        //2.截取前3位
        String first = phone.substring(0, 3);//139,  位置3不包含
        //3.截取后4位
        //phone.substring(7) 从下标7开始截取到结尾
        String last = phone.substring(phone.length() - 4, phone.length());//5678
        //4.拼接4个“*”
        String newPhone = first + "****" + last;
        //5.打印
        System.out.println(phone+" 手机号脱敏后："+newPhone);
    }
}
