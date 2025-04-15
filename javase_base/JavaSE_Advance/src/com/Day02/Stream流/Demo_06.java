package com.Day02.Stream流;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Description Demo_06
 * @Author ChengYun
 * @Date 2025-03-30  14:47
 */
public class Demo_06 {
    public static void main(String[] args) {
        // 目标：收集Stream流。把流收集成集合: 流只能用一次
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张无忌");

        //收集List集合
        List<String> list2 = list.stream().filter(name ->name.startsWith("张")).collect(Collectors.toList());
        System.out.println("新的list"+list2);

        //收集成set集合
        Set<String> set = list.stream().collect(Collectors.toSet());
        System.out.println("新的set:" + set);




        // 收集成Map集合。
        List<Student> students = new ArrayList<>();
        students.add(new Student("小明", 18, 90.0, "北京"));
        students.add(new Student("小红", 19, 80.0, "上海"));
        students.add(new Student("小刚", 20, 70.0, "广州"));
        students.add(new Student("小花", 21, 60.0, "深圳"));

        //  方式1：匿名内部类方式
        Map<String, Integer> map1 = students.stream().filter(s -> s.getName().startsWith("小")).collect(Collectors.toMap(new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getName();
            }
        }, new Function<Student, Integer>() {

            @Override
            public Integer apply(Student student) {
                return student.getAge();
            }
        }));
        System.out.println("map1:"+map1);




        //  方式2：lambda方式
        Map<String, Integer> map2 = students.stream().filter(s -> s.getName().startsWith("小")).collect(
                Collectors.toMap(student -> student.getName(), student -> student.getAge()));
        System.out.println("map2:"+map2);





        //  方式3(推荐)：特殊方法引用方式（类名::实例方法，要求：传入的第一个参数是方法体内主调用方法参数，其他参数作为调用方法的参数）
        Map<String, Integer> map3 = students.stream().filter(s -> s.getName().startsWith("小")).collect(
                Collectors.toMap(Student::getName, Student::getAge));
        System.out.println("map3:"+map3);


    }
}
