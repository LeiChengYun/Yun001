package com.oop.oop12_单例模式;

/**
 * @Description Sleton_Demo
 * @Author ChengYun
 * @Date 2025-03-20  19:39
 */
public class Sleton_Demo {
    public static void main(String[] args) {

        Sleton_Demo sleton_demo1 = new Sleton_Demo();
        Sleton_Demo sleton_demo2 = new Sleton_Demo();
        System.out.println(sleton_demo1);
        System.out.println(sleton_demo2);
        if (sleton_demo1 == sleton_demo2) {
            System.out.println("同一个对象");
        } else {
            System.out.println("不是同一个对象");
        }


        Singleton_v s1 = Singleton_v.getInstance();
        Singleton_v s2 = Singleton_v.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        if (s1 == s2) {
            System.out.println("同一个对象");
        } else {
            System.out.println("不是同一个对象");
        }

        Singleton_m s3 = Singleton_m.getInstance();
        Singleton_m s4 = Singleton_m.getInstance();
        System.out.println(s3);
        System.out.println(s4);
        if (s3 == s4) {
            System.out.println("同一个对象");
        } else {
            System.out.println("不是同一个对象");
        }





    }

}
