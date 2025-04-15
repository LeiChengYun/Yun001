package com.itheima.demo2reflect;

import java.lang.reflect.Method;

public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
        // 目标：反射获取类的方法并操作
        // 1、反射第一步：获取Class对象。
        Class c = Dog.class;

        // 2、提取全部方法对象。
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + " " + method.getParameterCount());
        }

        // 3、定位某个方法
        Method eatM = c.getDeclaredMethod("eat", String.class);

        Dog d = new Dog();
        eatM.setAccessible(true);
        Object result = eatM.invoke(d, "骨头");
        System.out.println(result);
    }
}
