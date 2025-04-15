package com.Day02._06TreeMap排序;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @Description Demo_01
 * @Author ChengYun
 * @Date 2025-03-29  14:30
 */
public class Demo_01 {
    public static void main(String[] args){
        //目标：TreeMap，key是Student,根据学生年龄升序
        //TreeMap<Integer, Student> objectObjectTreeMap = new TreeMap<>(); key=age，value=student

        //方案1：根据Student实现Comparable接口重写的compareTo方法，进行排序
        TreeMap<Student,String> treeMap = new TreeMap<>();
        treeMap.put(new Student("张三", 20, 99.9, "北京"), "张三");
        treeMap.put(new Student("李四", 18, 99.9, "上海"), "李四");
        treeMap.put(new Student("王五", 22, 99.9, "广州"), "王五");
        treeMap.put(new Student("赵六", 19, 99.9, "深圳"), "赵六");
        System.out.println(treeMap);



        //方案2：根据TreeMap构造器中Comparator比较器排序
        TreeMap<Student,String> treeMap1 = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getScore(),o2.getScore());
            }
        });

        treeMap1.put(new Student("张三", 20, 92.9, "北京"), "张三");
        treeMap1.put(new Student("李四", 18, 95.9, "上海"), "李四");
        treeMap1.put(new Student("王五", 22, 93.9, "广州"), "王五");
        treeMap1.put(new Student("赵六", 19, 96.9, "深圳"), "赵六");
        System.out.println(treeMap1);



    }
}
