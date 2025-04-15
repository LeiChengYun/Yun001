package com.Day03._01File_IO;

/**
 * @Description Demo_03
 * @Author ChengYun
 * @Date 2025-03-31  9:47
 */
// 递归调用栈溢出
public class Demo_03 {
    public static int a = 0;
    public static void main(String[] args) {

        printA();
    }
    public static void printA(){
        a++;
        System.out.println(a);
        printA();
    }
}
