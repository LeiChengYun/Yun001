package com.leilei;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @Description Pra_05
 * @Author ChengYun
 * @Date 2025-03-23  14:51
 */
public class Pra_05 {
    public static void main(String[] args) {
        final String name = "itheima";
        final String password = "123456";
        int count = 0;
        Scanner sc = new Scanner(System.in);

        while (count < 3){
            System.out.println("请输入用户名:");
            String userName = sc.next();
            System.out.println("请输入密码:");
            String passWord = sc.next();
            if(userName.equals(name) && passWord.equals(password)){
                System.out.println("登录成功!");
                break;
            }else{
                count++;
                if(count < 3){
                    System.out.println("登录失败，请重试。剩余尝试次数:"+(3-count)+"次机会!");
                }else {
                    System.out.println("登入失败!程序退出");
                }
            }

        }
        sc.close();
    }

}
