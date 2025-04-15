package com.oop.oop04_static;

/**
 * @Description Stu_Demo
 * @Author ChengYun
 * @Date 2025-03-18  14:41
 */
public class Stu_Demo {
    public static void main(String[] args) {    //静态成员变量的使用
        Student.teacherName = "张三";
        Student student1 = new Student("张三", 100, 100);
        Student student2 = new Student("李四", 98, 100);

        System.out.println("学生1的名字是：" + student1.getName()+" 老师是："+ Student.teacherName);
        System.out.println("学生2的名字是：" + student2.getName()+" 老师是："+ Student.teacherName);

    }
}
