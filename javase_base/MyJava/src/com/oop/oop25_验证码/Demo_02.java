package com.oop.oop25_验证码;

/**
 * @Description Demo_02
 * @Author ChengYun
 * @Date 2025-03-28  12:08
 */
public class Demo_02 {
    public static void main(String[] args) {
        //1.调用方法生成4位验证码返回
        String code1 = getCode(4);
        System.out.println("4位验证码："+code1);

        //2.调用方法生成6位验证码返回
        String code2 = getCode(6);
        System.out.println("6位验证码："+code2);
    }

    /**
     * 生成指定位数的验证码字符串
     * @param count
     * @return
     */
    public static String getCode(int count){

        //1.定义存储生成验证码的字符串 code
        String code = "";

        //2.定义生成验证码字符范围字符串 data
        String data = "1234567890asdfghjklzxcvbnmqwertyuiopQWERTYUIOPASDFGHJKLZXCVBNMl黑马程序员";
        //     索引下标 0123456789...
        //     字符串.length() 获取字符串长度
        //     字符串.charAt(索引下标) 获取指定索引下标位置的字符

        //3.按照验证码位数循环生成验证码字符
        for (int i = 0; i < count; i++) {

            //3.1.随机获取data里面某个字符
            //索引随机下标 Math.random()返回0~1之间的随机数，不包含1
            int index = (int)(Math.random()*data.length());
            //根据随机下标获取data里面对应的字符
            char c = data.charAt(index);

            //3.2.使用code拼接生成的随机字符
            code += c;
        }

        //4.返回生成的验证码字符串code
        return code;
    }
}
