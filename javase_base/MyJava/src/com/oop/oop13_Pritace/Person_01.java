package com.oop.oop13_Pritace;

/**
 * @Description Person_01
 * @Author ChengYun
 * @Date 2025-03-20  20:40
 */
public class Person_01 {
    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person_01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name+"吃饭");
    }

    public void sleep() {
        System.out.println(name+"睡觉");
    }

}
