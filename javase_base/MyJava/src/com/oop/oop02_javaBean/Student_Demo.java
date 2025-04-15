package com.oop.oop02_javaBean;

/**
 * @Description Student_Demo
 * @Author ChengYun
 * @Date 2025-03-17  19:15
 */
public class Student_Demo {
    public static void main(String[] args) {
        //javaBean
        //成员变量必须私有，且要为他们提供get、set方法；必须有无参数构造器
        //仅仅只是一个用来保存数据的java类，可以用它创建对象，保存某个事物的数据。
        //实体类对应的是软件开发里现在比较流行的开发方式，数据和数据的业务处理相分离


        //创建两个学生对象
        Student student1 = new Student("张三", 100, 100);
        Student student2 = new Student("李四", 98, 100);

        //创建一个学生操作对象 StudentOperator
        StudentOperator studentOperator = new StudentOperator();

        //调用StudentOperator类的方法
        studentOperator.printSum(student2);
        studentOperator.printAvg(student2);

    }
}
