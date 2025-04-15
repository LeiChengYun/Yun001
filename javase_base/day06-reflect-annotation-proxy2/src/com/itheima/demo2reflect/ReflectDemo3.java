package com.itheima.demo2reflect;

import java.lang.reflect.Field;

public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        // 目标：反射获取类的构造器对象并操作。
        // 1、反射第一步：获取Class对象。
        Class c = Dog.class;

        // 2、提取全部成员变量
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        // 3、获取某个成员变量
        Field ageF = c.getDeclaredField("age");

        // 4、获取成员变量的作用依然是取值和赋值。
        Dog dog = new Dog();
        ageF.setAccessible(true);
        ageF.set(dog, 10);
        System.out.println(dog);

        // 取年龄
        int a = (int) ageF.get(dog);
        System.out.println(a);
    }
}
