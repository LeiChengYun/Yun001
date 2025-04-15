package com.Day02.Stream流;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description Demo_03
 * @Author ChengYun
 * @Date 2025-03-30  11:07
 */
public class Demo_03 {
    public static void main(String[] args) {
        //虽然student对象重写了HsahCode方法和equals方法，但List默认允许重复。
        List<Student> students = new ArrayList<>();
        students.add(new Student("小明", 18, 90.0, "北京"));
        students.add(new Student("小明", 18, 90.0, "北京"));
        students.add(new Student("小花", 21, 60.0, "深圳"));
        students.add(new Student("小红", 19, 80.0, "上海"));
        students.add(new Student("小刚", 20, 70.0, "广州"));

        for (Student student : students){
            System.out.println(student);
        }

        System.out.println("-----------------------");

        //distinct()调用了HsahCode方法和equals方法。
        students.stream().distinct().forEach(System.out::println);
    }
}
