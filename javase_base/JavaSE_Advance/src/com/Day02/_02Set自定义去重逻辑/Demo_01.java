package com.Day02._02Set自定义去重逻辑;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description Demo_01
 * @Author ChengYun
 * @Date 2025-03-28  18:03
 */
public class Demo_01 {
    public static void main(String[] args) {
        //目标：掌握HashSet去重原理
        //原理：调用hashCode()和equals()实现对象去重
        Set<String> set1 = new HashSet<>();
        set1.add("hello");
        set1.add("world");
        set1.add("world");
        set1.add("java");
        set1.add("java");
        set1.add("java");
        set1.add("AI");
        System.out.println("HashSet："+set1);


        //生成对象
        String str1 = "hello";
        String str2 = "java";
        //String类重写类父类Object的hashCode()方法,相同的hashCode是一样的,String类重写类父类Object的hashCode()方法
        System.out.println(str1.hashCode());
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        //结论1：相同对象的hashCode是相同的
        //结论2：不同对象的hashCode是大概率是不同的，但是超过42亿个可能有hashCode会有碰撞性


        //对于自定义对象去重set会有问题
        Set<Student> set2= new HashSet<>();
        set2.add(new Student("小明", 18, 99.9, "北京"));
        set2.add(new Student("小明", 18, 99.9, "北京"));
        set2.add(new Student("小红", 20, 89.9, "北京"));
        set2.add(new Student("小强", 17, 100.0, "广州"));

        System.out.println("set2:"+set2);

        //这里2个小明内容值一样，没有去重，原因：new Student是不同的，所以对象不同

        //目标：对象不同，但是成员的值一样也可以去重。
        //解决方案：Student重写hashCode()和equals()方法
        //让重写的hashCode()方法根据成员值计算hashCode()，让重写的equals()方法根据成员值判断是否相同。
        //已经让Student重写了hashCode()和equals()方法，所以可以按照成员值去重。


    }
}
