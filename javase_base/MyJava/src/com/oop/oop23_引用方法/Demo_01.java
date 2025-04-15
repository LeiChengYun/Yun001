package com.oop.oop23_引用方法;

import java.util.Arrays;

/**
 * @Description Demo_01
 * @Author ChengYun
 * @Date 2025-03-23  10:22
 */
public class Demo_01 {
    public static void main(String[] args) {
        //静态方法引用
        //目标：使用比较器接口匿名内部类实现对学生数组按照年龄排序
        //1.定义一个学生数组
        Stu_01[] students = {
                new Stu_01("小明", 18),
                new Stu_01("小红", 19),
                new Stu_01("小花", 40),
                new Stu_01("小黄", 21),
                new Stu_01("小黑", 22),

        };
        System.out.println("排序前：" + Arrays.toString(students));

        //2.升序
        //lambda方式:Arrays.sort(students, (o1, o2) -> o1.getAge() - o2.getAge());
        //目标：使用静态方法应用方式优化
        //语法：类名::静态方法
        //使用有前提：静态方法要与lambda重写的方法的参数与返回值要一致才可以
        Arrays.sort(students, Stu_01::compareAgeASC);
        System.out.println("按照年龄升序：" + Arrays.toString(students));

        //3.降序
        Arrays.sort(students, Stu_01::compareAgeDESC);
        //lambda 表达式如果形参只有一个()都可以省略
        System.out.println("按照年龄将序：" + Arrays.toString(students));

    }

}
