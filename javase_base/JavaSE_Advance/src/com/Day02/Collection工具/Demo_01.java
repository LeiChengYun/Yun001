package com.Day02.Collection工具;

import com.Day02.Stream流.Student;

import java.util.*;

/**
 * @Description Demo_01
 * @Author ChengYun
 * @Date 2025-03-30  15:49
 */
public class Demo_01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("张无忌");
        names.add("周芷若");
        names.add("赵敏");

        Collections.addAll(names, "张强", "张三丰", "张无忌");
        System.out.println(names);

        Collections.shuffle(names);
        System.out.println(names);

        //Collections.reverse(names);

        List<Student> students = new ArrayList<>();
        students.add(new Student("小明", 18, 90.0, "北京"));
        students.add(new Student("小红", 19, 80.0, "上海"));
        students.add(new Student("小刚", 20, 70.0, "广州"));
        students.add(new Student("小花", 21, 60.0, "深圳"));

        //方式一：对象实现比较
        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("--------------------------");

        //方式二：匿名内部类,coLLections工具类的sort方法自带比较器。
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getScore(), o2.getScore());
            }
        });
        for (Student student : students) {
            System.out.println(student);
        }


    }
}
