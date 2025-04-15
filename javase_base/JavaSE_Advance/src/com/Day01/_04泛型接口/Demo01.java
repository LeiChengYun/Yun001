package com.Day01._04泛型接口;

import java.util.ArrayList;

/**
 * @Description Demo01
 * @Author ChengYun
 * @Date 2025-03-27  16:19
 */
public class Demo01 {
    public static void main(String[] args) {
            Student student = new Student(1, "张三", 18);

            //Student_M student_m = new Student_M();

            ArrayList<Student> list = new ArrayList<>();

            list.add(student);
            System.out.println(list.get(0));




    }
}
