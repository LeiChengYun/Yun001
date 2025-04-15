package com.oop.oop09_多态;

/**
 * @Description People
 * @Author songyu
 * @Date 2024-12-08  16:01
 */
public class Teacher extends People {

    String name = "老师";

    @Override
    public void run(){
        System.out.println("老师悠闲慢跑");
    }
}
