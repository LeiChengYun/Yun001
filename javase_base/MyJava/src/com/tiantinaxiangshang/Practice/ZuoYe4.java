package com.tiantinaxiangshang.Practice;

import java.util.Scanner;

/**
 * @Description ZuoYe4
 * @Author ChengYun
 * @Date 2025-03-12  16:55
 */
public class ZuoYe4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int a = sc.nextInt();
        System.out.println(a%2 == 0 ? "偶数" : "奇数");


    }
}
