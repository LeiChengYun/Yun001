package com.Work.Day01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @Description Demo_03
 * @Author ChengYun
 * @Date 2025-03-29  16:43
 */
//模拟注册用户,如果存在要注册的用户,直接显示"对不起,您注册的用户已经存在!请直接登录!",可以继续注册;
// 如果不存在要注册的用户,显示"注册成功!",并将所有用户的信息显示出来!
public class Demo_03 {

    public static void main(String[] args) {


        ArrayList<User_03> list = new ArrayList<>();
        list.add(new User_03("xiaohua", "123456"));
        list.add(new User_03("xiaoli", "123456"));
        list.add(new User_03("xiaobai", "123456"));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入用户名:");
            String username = scanner.next();
            Boolean flag = isUser(list, username);
            if (flag) {
                System.out.println("对不起,您注册的用户已经存在!请直接登录!");
            } else {
                System.out.println("请输入密码:");
                String password = scanner.next();
                User_03 user_03 = new User_03(username, password);
                list.add(user_03);
                System.out.println("注册成功!");
                showUser(list);
                return;
            }
        }


    }

    private static void showUser(ArrayList<User_03> list) {
        Iterator<User_03> iterator = list.iterator();
        while (iterator.hasNext()) {
            User_03 user = iterator.next();
            System.out.println(user.getName() + ":" + user.getPassword());
        }
    }

    private static Boolean isUser(ArrayList<User_03> list, String username) {
        Iterator<User_03> iterator = list.iterator();
        while (iterator.hasNext()) {
            User_03 user = iterator.next();
            if (user.getName().equals(username)) {
                return true;
            }
        }
        return false;
    }

}
