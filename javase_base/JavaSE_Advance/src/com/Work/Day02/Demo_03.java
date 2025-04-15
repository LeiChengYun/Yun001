package com.Work.Day02;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 * @Description Demo_03
 * @Author ChengYun
 * @Date 2025-03-29  10:50
 */
public class Demo_03 {
    //如图所示:当我们在京东注册新用户的时候,我们输入一个要注册的用户名,如果之前有该用户名注册过,京东是不会让相同的用户名注册的,会注册失败.根据以上描述,设计程序,完成注册功能!
    public static void main(String[] args) {
        HashSet<User_03> hashSet = new HashSet<>();


        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入用户名：");
            String username = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();
            User_03 user_03 = new User_03(username, password);
            if(hashSet.add(user_03)){
                System.out.println("注册成功！");
                System.out.println(hashSet);
            }else {
                System.out.println("注册失败！");
                System.out.println(hashSet);
            }
        }
    }
}
