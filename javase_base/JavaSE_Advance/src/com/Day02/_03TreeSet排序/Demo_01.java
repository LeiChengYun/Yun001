package com.Day02._03TreeSet排序;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Description Demo_01
 * @Author ChengYun
 * @Date 2025-03-28  20:51
 */
public class Demo_01 {
    public static void main(String[] args) {
        //目标：掌握TreeSet对于自定义对象排序
        //默认是不能排序，会报错
        // 给对象制定排序规则的方案有两种
        //    1、方式一：让对象的类实现Comparable接口，重写compareTo方法，声明大小规则。
        //    2、方式二：TreeSet集合自带Comparator比较器对象，来制定比较规则。(就近原则，这个会优先)


        // 方式一：让对象的类实现Comparable接口，重写compareTo方法，声明大小规则。
        Set<Student> set2= new TreeSet<>();
        set2.add(new Student("小明", 18, 99.9, "北京"));
        set2.add(new Student("小明", 18, 99.9, "北京"));
        set2.add(new Student("小红", 20, 89.9, "北京"));
        set2.add(new Student("小强", 17, 100.0, "广州"));
        System.out.println("set2:"+set2);




        //方式二：TreeSet集合自带Comparator比较器对象，来制定比较规则。(就近原则，这个会优先)
        //根据成绩升序排序
        Set<Student> set3= new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //return (int)(o1.getScore() - o2.getScore()); //不安全，小数会省略
                return Double.compare(o1.getScore(), o2.getScore()); // 使用 Double.compare 方法安全地比较浮点数
            }
        });
        set3.add(new Student("小明", 18, 99.9, "北京"));
        set3.add(new Student("小明", 18, 99.9, "北京"));
        set3.add(new Student("小红", 20, 89.5, "北京"));
        set3.add(new Student("小强", 17, 100.0, "广州"));
        System.out.println("set3:"+set3);




    }

}
