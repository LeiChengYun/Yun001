package com.oop.oop23_引用方法;

import java.util.Arrays;

/**
 * @Description Demo_02
 * @Author ChengYun
 * @Date 2025-03-23  10:54
 */
public class Demo_02 {
    public static void main(String[] args) {
        //特点方法引用
        // 需求: 按照名字的首字母编号进行排序。(忽略大小写排序！)
        String[] name = {"baby", "Angela", "about", "eson", "Jack", "jack2", "rose"};

        //方式1：使用匿名内部类排序
        // Arrays.sort(names, new Comparator<String>() {
        //     @Override
        //     public int compare(String o1, String o2) {
        //         return o1.compareToIgnoreCase(o2);
        //     }
        // });
        // System.out.println("方式排序后："+ Arrays.toString(names));


        //方式2：使用lambda表达式排序
        // Arrays.sort(names, (o1, o2) -> o1.compareToIgnoreCase(o2));
        // System.out.println("方式排序后："+ Arrays.toString(names));

        //方式3：使用特定类的方法引用
        //语法：类名::实例方法名
        //使用前提：优化的lambda表达式是第一个参数作为方法体代码主调方法对象（类似上面使用的o1），其他参数是作为方法参数(类似上面使用的o2)。
        Arrays.sort(name, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(name));



    }
}
