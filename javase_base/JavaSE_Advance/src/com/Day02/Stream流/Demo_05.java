package com.Day02.Stream流;

import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Description Demo_05
 * @Author ChengYun
 * @Date 2025-03-30  12:01
 */
//终结方法（获取处理结果）
public class Demo_05 {
    public static void main(String[] args) {
        // 目标：学习Stream流的终结方法。
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张无忌");

        //count()：统计流中元素的个数。
        long count = list.stream().filter(name ->name.startsWith("张")).count();
        System.out.println("姓张的同学有"+count+"个");

        List<Student> students = new ArrayList<>();
        students.add(new Student("小明", 18, 90.0, "北京"));
        students.add(new Student("小红", 19, 80.0, "上海"));
        students.add(new Student("小刚", 20, 70.0, "广州"));
        students.add(new Student("小花", 21, 60.0, "深圳"));

        //为什么返回Optional<Student>，而不是最小年龄的学生Student?
        // 答：因为可能没有最小年龄同学会返回null容易发生空指针异常，所以返回Optional<Student>接收null的值

        Optional<Student> min = students.stream().min((s1, s2) -> s1.getAge() - s2.getAge());
        if(min != null){
            System.out.println(min.get());
        }

        // 4、挑选出最大值
        Optional<Student> max = students.stream().max((s1, s2) -> s1.getAge() - s2.getAge());
        //返回值是一个 Optional<Student>，表示可能包含最大年龄的学生，也可能为空（如果流中没有元素）
        if(max!=null){
            //get() 是 Optional 类的一个方法，用于获取其中存储的值。具体来说：
            //如果 Optional 中存在值，则返回该值。
            //如果 Optional 为空（即没有值），则抛出 NoSuchElementException 异常。
            Student student = max.get();
            System.out.println("年龄最大是："+student.getAge()+"岁,姓名："+student.getName());
        }




    }
}
