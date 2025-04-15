package com.Day01._09List;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description Demo_01
 * @Author ChengYun
 * @Date 2025-03-28  15:25
 */
public class Demo_01 {
    public static void main(String[] args) {
        // 目标：掌握List系列集合独有的功能。
        List<String> list = new ArrayList<>(); // 多态 一行经典代码
        list.add("Java");
        list.add("Css");
        list.add("HTML");
        list.add("Java");
        System.out.println(list); // [Java, Css, HTML, Java]

        // 1、插入数据到指定索引。add(索引,元素)、
        list.add(1,"AI");
        System.out.println(list);//[Java, AI, Css, HTML, Java]

        // 2、根据索引删除数据。remove(索引)
        list.remove(2);//[Java, AI, HTML, Java]

        // 3、修改某个索引位置处的数据 set(索引,修改后的数据)
        list.set(2,"CSS");
        System.out.println(list);//[Java, AI, CSS, Java]

        // 4、根据索引取数据。get(索引)
        System.out.println(list.get(3));//最后的java

        // 5、fori循环遍历
        System.out.println("fori循环遍历:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // 6、增强for循环遍历
        System.out.println("增强for循环遍历：");
        for (String s : list) {
            System.out.println(s);
        }
        // 7、迭代器遍历
        System.out.println("迭代器遍历：");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // 8、Lambda表达式遍历
        System.out.println("Lambda表达式遍历：");
        list.forEach(e -> System.out.println(e));
    }
}
