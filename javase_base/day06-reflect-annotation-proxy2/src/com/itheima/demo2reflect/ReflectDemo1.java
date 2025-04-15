package com.itheima.demo2reflect;

public class ReflectDemo1 {
    public static void main(String[] args) throws Exception {
        // 目标：反射第一步：获取类的Class对象。
        // 1、类名.class
        Class c1 = Student.class;

        // 2、Class.forName("全类名")
        Class c2 = Class.forName("com.itheima.demo2reflect.Student");

        // 3、对象.getClass()
        Student s = new Student();
        Class c3 = s.getClass();

        System.out.println(c1 == c2);
        System.out.println(c1 == c3);

        // 4、类对象有一些方法获取类的全名和简名
        System.out.println(c1.getName()); // com.itheima.demo2reflect.Student
        System.out.println(c1.getSimpleName()); // Student

    }
}
