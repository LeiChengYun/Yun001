package com.Day01._07Collection集合特点;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @Description Demo01
 * @Author ChengYun
 * @Date 2025-03-27  20:25
 */
public class Demo01 {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();
        collection.add("hello");
        collection.add("world");
        collection.add("java");
        collection.add("AI");

        System.out.println(collection);

        System.out.println(collection.size());

        //判断集合是否为空
        System.out.println(collection.isEmpty());


        //删除集合元素remove(元素)
        // coLLection.remove（θ);
        // 这个不可以，因为集合coLLection只提供了remove（object元素），没有提供remove(索引l),List接口提供了remove(索引)
        collection.remove("AI");


        //判断集合中是否包含元素
        System.out.println(collection.contains("hello"));

        //把集合转换成数组
        //用别人的方法，方法参数是数组不是集合，就需要将集合转换为数组
        Object[] array = collection.toArray();
        System.out.println(Arrays.toString(array));



        //清空集合
        collection.clear();








    }
}
