package com.Day01._08迭代;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * @Description Demo02
 * @Author ChengYun
 * @Date 2025-03-27  20:55
 */
public class Demo02 {
    public static void main(String[] args) {
        //目标集合遍历方式3：lambda方式。

        //准备集合
        ArrayList<String> c = new ArrayList<>();
        c.add("赵敏");
        c.add("周芷若");
        c.add("张无忌");
        c.add("灭绝");

        //匿名内部类
        c.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //遍历2：Lambda表达式 (推荐方式)
        c.forEach(s -> System.out.println(s));

        //遍历3：方法引用（了解，对象名：：实例方法)
        c.forEach(System.out::println);




    }
}
