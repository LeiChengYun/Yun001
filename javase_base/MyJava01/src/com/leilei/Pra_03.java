package com.leilei;

import java.util.Scanner;

/**
 * @Description Pra_03
 * @Author ChengYun
 * @Date 2025-03-23  14:28
 */
public class Pra_03 {
    public static void main(String[] args) {
        String correctUsername = "itheima";
        String correctPassword = "123456";
        int attempts = 0;
        Scanner scanner = new Scanner(System.in);

        while (attempts < 3) {
            System.out.print("请输入登录名: ");
            String username = scanner.nextLine();
            System.out.print("请输入密码: ");
            String password = scanner.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("欢迎进入系统!");
                break;
            } else {
                attempts++;
                if (attempts < 3) {
                    System.out.println("登录失败，请重试。剩余尝试次数: " + (3 - attempts));
                } else {
                    System.out.println("登录失败次数过多，程序将退出。");
                }
            }
        }

        scanner.close();
    }
}

