package com.Day01._01认识异常;

/**
 * @Description Demo_02
 * @Author ChengYun
 * @Date 2025-03-27  10:52
 */
public class Demo_02 {
    public static void main(String[] args) {
            test01(10,0);
    }
    public static void test01(int a,int b) {
        if(b==0){
            //这样返回不好，一一不明确
            //return 0;

            //返回运行时异常，结束程序返回
            throw new RuntimeException("除数不能为0");
        }

        System.out.println(a/b);
    }
}
