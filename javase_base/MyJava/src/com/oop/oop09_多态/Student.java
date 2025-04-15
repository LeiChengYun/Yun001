package com.oop.oop09_多态;

/**
 * @Description People
 * @Author songyu
 * @Date 2024-12-08  16:01
 */
public class Student extends People {
    String name = "学生";

    int age = 20;

    @Override
    public void run(){
        System.out.println("学生努力快跑，超越自己");
    }

    //定义一个独有学习方法study
    public void study(){
        System.out.println("学生努力学习中！");
    }
}
