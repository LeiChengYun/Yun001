package com.oop.oop10_重写;

/**
 * @Description Phone_Demo
 * @Author ChengYun
 * @Date 2025-03-20  10:46
 */
public class Phone_Demo {
    public static void main(String[] args) {
        NewPhone newPhone1 = new NewPhone();
        newPhone1.sendMessage();

        NewPhone newPhone2 = new NewPhone();
        newPhone2.setMessage("iphone6s");
        System.out.println(newPhone2.getMessage());
    }
}
