package com.oop.oop01;

/**
 * @Description oop01
 * @Author ChengYun
 * @Date 2025-03-17  11:20
 */
public class stu_Demo {
    public static void main(String[] args) {
//        student stu = new student();
//        stu.setName("张三");
//        stu.setChinese(100);
//        stu.setMath(99);
//        System.out.println(stu.getName());
        
//        stu.printThis();


        student stu = new student("张三",100,99);
        System.out.println(stu.getName()+","+stu.getChinese()+","+stu.getMath());

        stu.check(90.0);

    }
}
