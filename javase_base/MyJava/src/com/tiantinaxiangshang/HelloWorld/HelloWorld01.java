package com.tiantinaxiangshang.HelloWorld;

/**
 * @Description HelloWorld01
 * @Author ChengYun
 * @Date 2025-03-13  20:21
 */
public class HelloWorld01 {
    public static void main(String[] args) {
        print("沉");
        print("沉", "默");
        print("沉", "默", "王");
        print("沉", "默", "王", "二");
    }

    public static void print(String... strs) {
        for (String s : strs)
            System.out.print(s);
            System.out.println();
    }
}
