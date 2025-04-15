package com.oop.oop23_引用方法;

import com.oop.oop19_综合案列.MaJiang;

import java.util.Arrays;

/**
 * @Description Demo_03
 * @Author ChengYun
 * @Date 2025-03-28  10:41
 */
public class Demo_03 {
    public static void main(String[] args) {
        //实例方法引用
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
        //目标：使用实例方法引用方式优化
        //语法：对象名::实例方法
        //使用有前提：实例方法要与lambda重写的方法的参数与返回值要一致才可以
        //创建实例对象

        Stu_01 stu_01 = new Stu_01();

        //再使用实例方法引用
        Arrays.sort(students, stu_01::compareAgeASCObj);
        System.out.println("按照年龄升序：" + Arrays.toString(students));

        //3.降序
        Arrays.sort(students, stu_01::compareAgeDESCObj);
        //lambda 表达式如果形参只有一个()都可以省略
        System.out.println("按照年龄将序：" + Arrays.toString(students));



    }

}
