package com.Day02._05Map集合遍历;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * @Description Demo_03
 * @Author ChengYun
 * @Date 2025-03-29  10:36
 */
public class Demo_03 {
    public static void main(String[] args) {
        // 目标：掌握Map集合的遍历方式三：lambda方式。
        Map<String,Integer> map = new HashMap<>();
        map.put("嫦娥", 20);
        map.put("女儿国王", 31);
        map.put("嫦娥", 28);
        map.put("铁扇公主", 38);
        map.put("紫霞", 31);
        System.out.println(map); // {嫦娥=28, 铁扇公主=38, 紫霞=31, 女儿国王=31}


        // 匿名内部类方式
        map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s + "=" + integer);
            }
        });

        // lambda方式
        map.forEach((K,V) -> System.out.println(K + "=" + V));


        //直接引用方法
        map.forEach(new BiConsumerImpl_03());

    }
}
