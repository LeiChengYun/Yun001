package com.Day01._05泛型方法_泛型通配符_上下限;

import com.Day01._04泛型接口.Student;
import com.Day01._04泛型接口.Teacher;

/**
 * @Description Demo02
 * @Author ChengYun
 * @Date 2025-03-27  19:35
 */
public class Demo02 {
    public static void main(String[] args) {
        Student[] students = new Student[4];

        Teacher[] teachers = new Teacher[4];

        print(students);
        print(teachers);

    }

    //<T> 代表是泛型方法
    //(T[] arr) 这里的T代表传入的类型
    public static <T> void print(T[] t){
        System.out.println(t.length);
    }
}
