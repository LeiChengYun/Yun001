package com.oop.oop25_验证码;

/**
 * @Description Demo_01
 * @Author ChengYun
 * @Date 2025-03-28  12:02
 */
public class Demo_01 {
    public static void main(String[] args) {
        // 1.String类构造器创建字符串对象 (不常用)
        // String();
        String s1 = new String(); // 相当于没有内容的字符串"" (不用)
        System.out.println("s1 = " + s1);//

        // String(String str)
        String s2 = new String("广州黑马");
        System.out.println("s2 = " + s2); //

        // String(byte[] bytes) // 把byte数组内容转成字符串
        byte[] bytes = {97, 98, 99};
        String s3 = new String(bytes);
        System.out.println("s3 = " + s3); //

        // String(char[] chs)
        char[] chs = {'a', 'b', 'c'};
        String s4 = new String(chs);//
        System.out.println("s4 = " + s4);
        // 因为使用构造器创建字符串对象不方便, 编程中需要大量使用字符串, Java提供了更简单的创建字符串对象的方法
        // 2.直接双引号得到字符串对象 (常用的)
        String s5 = "广州黑马";
        System.out.println("s5 = " + s5);//

        // ""的字符串是在字符串常量池中, 相同的字符串只有一份
        // == 引用类型比较对象的地址
        String s6 = "abc";
        String s7 = "abc";
        System.out.println(s6); //
        System.out.println(s6 == s7); //

        String s8 = new String("abc");
        String s9 = new String("abc");
        System.out.println(s8 == s9); //
        // equals: 比较字符串的内容
        System.out.println(s8.equals(s9)); //
    }
}
