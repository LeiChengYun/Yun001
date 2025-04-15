package com.itheima.demo2reflect;

import java.lang.reflect.Constructor;

public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {
        // 目标：反射获取类的构造器对象并操作。
        // 1、反射第一步：获取Class对象。
        Class c = Dog.class;

        // 2、提取全部构造器对象。
        Constructor[] cons = c.getDeclaredConstructors();
        for (Constructor con : cons) {
            System.out.println(con.getName() + " " + con.getParameterCount());
        }

        // 3、获取构造器的目的是什么、
        Constructor con1 = c.getDeclaredConstructor(); // 无参数构造器。
        Constructor con2 = c.getDeclaredConstructor(String.class); // 有参数构造器。

        // 4、获取构造器的目的依然是创建对象。
        Dog dog = (Dog) con1.newInstance();
        System.out.println(dog);

        con2.setAccessible(true); // 暴力反射，禁止检查访问权限
        Dog dog2 = (Dog) con2.newInstance("旺财");
        System.out.println(dog2);
    }
}
