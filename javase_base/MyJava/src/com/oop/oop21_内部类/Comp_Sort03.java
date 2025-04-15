package com.oop.oop21_内部类;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Description Comp_Sort
 * @Author ChengYun
 * @Date 2025-03-22  11:07
 */
public class Comp_Sort03 {
    public static void main(String[] args) {
        Student_02[] student = {
                new Student_02("张三", 28),
                new Student_02("李四", 19),
                new Student_02("王五", 30),
                new Student_02("赵六", 21),
                new Student_02("钱七", 12),

        };

        System.out.println(Arrays.toString(student));

        //2.升序
        // Ctrl+N 快速查找类并打开
        // Ctrl+F12 快速搜索当前类内部的成员
        //数组排序语法：Arrays.sort(T[] a, Comparator<? super T> c) {
        // T 代表任意类型，你传递什么类型就是什么类型
        //比较器接口：Comparator， 定义抽象方法：int compare(T o1, T o2)
        //里面重写compare方法进行排序：
        //   升序：o1.getXxx() - o2.getXxx()
        //      返回值： 0 代表相等
        //      返回值： <0 代表o1小，o2大
        //      返回值： >0 代表o1大，o2小
        //   降序：o2.getXxx() - o1.getXxx()
        //      返回值： 0 代表相等
        //      返回值： <0 代表o1大，o2小
        //      返回值： >0 代表o1小，o2大
        //   原理：会遍历数组每两个元素进行比较，如果不等于0就会交互位置，升序目的小的在前，大在后，降序目的大的在前，小在后


//        Arrays.sort(student, new Comparator<Student_02>() {
//            @Override
//            public int compare(Student_02 o1, Student_02 o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });


        //简写 lambda表达式写法
        Arrays.sort(student, (o1, o2) -> o1.getAge() - o2.getAge());



        System.out.println(Arrays.toString(student));



    }
}
