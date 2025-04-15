package com.Day02._01Set特点;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Description Demo_01
 * @Author ChengYun
 * @Date 2025-03-28  16:05
 */
public class Demo_01 {
    //目标：掌握set集合及其子类的特点
    public static void main(String[] args) {


        //hashSet集合的特点：无序，不重复，无索引，线程不安全，存储null值
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Css");
        set.add("HTML");
        set.add("Java");
        set.add("AI");
        set.add("AI");
        set.add("Py");
        System.out.println(set);


        //linkedHashSet集合的特点：有序，不重复，无索引，线程不安全，存储null值
        Set<String> set1 = new LinkedHashSet<>();
        set1.add("hello");
        set1.add("world");
        set1.add("world");
        set1.add("java");
        set1.add("java");
        set1.add("java");
        set1.add("AI");
        System.out.println(set1);


        //3.TreeSet 排序（默认按照大小升序），不重复，无索引
        Set<Integer> set3 = new TreeSet<>();
        set3.add(100);
        set3.add(60);
        set3.add(60);
        set3.add(99);
        set3.add(59);
        set3.add(75);
        set3.add(75);
        System.out.println("TreeSet数字："+set3);

        //TreeSet排序（默认按照字母升序）
        Set<String> set4 = new TreeSet<>();
        set4.add("aello");//97
        set4.add("world");
        set4.add("world");
        set4.add("java");
        set4.add("java");
        set4.add("java");
        set4.add("AI");//65
        System.out.println("TreeSet字符串："+set4);




    }
}
