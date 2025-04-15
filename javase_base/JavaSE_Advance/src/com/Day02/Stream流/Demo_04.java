package com.Day02.Stream流;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Description Demo_04
 * @Author ChengYun
 * @Date 2025-03-30  11:13
 */
public class Demo_04 {
    public static void main(String[] args) {
        // 目标：搞清楚Stream流提供的中间方法。
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张无忌");
        // 1、过滤：筛选数据的,查找姓“张”，并遍历
        // 查看源码快捷键： Ctrl+Alt+鼠标点击
        list.stream().filter(s ->s.startsWith("张")).forEach(System.out::println);
        System.out.println("---------------------------------------");


        // 2、排序的：sorted 默认是升序。
        List<Double> list2 = new ArrayList<>();
        list2.add(3.14);
        list2.add(1.14);
        list2.add(4.14);
        list2.add(2.14);
        list2.stream().sorted().forEach(System.out::println);

        System.out.println("---------------------------------------");


        // 3、集合中是对象的排序
        List<Student> students = new ArrayList<>();
        students.add(new Student("小明", 18, 90.0, "北京"));
        students.add(new Student("小明", 18, 90.0, "北京"));
        students.add(new Student("小花", 21, 60.0, "深圳"));
        students.add(new Student("小红", 19, 80.0, "上海"));
        students.add(new Student("小刚", 20, 70.0, "广州"));
        //排序+去重
        //students.stream().sorted().distinct().forEach(System.out::println);

        //对分数进行排序ai
        students.stream().distinct().sorted((s1,s2)->{
            if (s1.getScore() == s2.getScore()){
                return s1.getName().compareTo(s2.getName());
            }
            return s1.getScore() > s2.getScore() ? -1 : 1;
        }).forEach(System.out::println);

        System.out.println("---------------------------------------");

        //对分数进行排序
        students.stream().sorted((s1,s2)->Double.compare(s2.getScore(),s1.getScore())).forEach(s-> System.out.println(s));

        System.out.println("---------------------------------------");

        // 4、limit 取前几个
        students.stream().limit(2).forEach(s-> System.out.println(s));
        System.out.println("----------------------------");
        // 5、跳过前几个：skip
        students.stream().skip(1).forEach(System.out::println);
        System.out.println("----------------------------");

        //加工方法：map
        //map加工后返回元素类型可以与原集合元素类型不一样，返回元素的类型由map里面决定
        students.stream().sorted().map(s -> s.getName() +":" + s.getAge()).forEach(System.out::println);
        //s.getName(） s是student
        // System.out.printLn(s）是 字符串

        System.out.println("----------------------------");


        //7、合并流：两个流（List集合流,List2集合流）合并成一个流。
        Stream<String> stream1 = list.stream();
        Stream<Double> stream2 = list2.stream();
        Stream<Object> stream3 = Stream.concat(stream1, stream2);
        stream3.forEach(System.out::println);
        System.out.println("----------------------------");


    }
}
