package com.Day03._02字符集;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @Description Demo_01
 * @Author ChengYun
 * @Date 2025-03-31  15:06
 */
public class Demo_01 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //编码：将字符转化为字节数,平台默认为UTF-8编码
        String str = "你好abcd";
        System.out.println(Arrays.toString(str.getBytes()));

        //解码：将字节数转化为字符-----String (byte[] bytes)
        System.out.println(new String(str.getBytes()));


        //设置GBK字符集进行编码
        System.out.println(Arrays.toString(str.getBytes("GBK")));

        //设置GBK字符集进行解码
        System.out.println(new String(str.getBytes("GBK"),"GBK"));

        //如果没有设定为GBK进行解码会乱码
        System.out.println(new String(str.getBytes(),"GBK"));

    }
}
