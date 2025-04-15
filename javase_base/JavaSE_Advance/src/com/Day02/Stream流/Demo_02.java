package com.Day02.Stream流;

import java.util.*;
import java.util.stream.Stream;

/**
 * @Description Demo_02
 * @Author ChengYun
 * @Date 2025-03-30  10:14
 */
//获取Stream流
public class Demo_02 {
    public static void main(String[] args) {
        // 1. 创建一个集合，存储一些字符串元素
        // 2. 使用Stream流，对集合中的元素进行过滤，只保留长度大于3的字符串
        // 3. 过滤后的结果，使用Stream流中的方法forEach输出到控制台
        // 4. 使用Stream流中的方法count统计过滤后的结果，输出到控制台
        // 5. 使用Stream流中的方法max获取集合中最长的字符串，输出到控制台
        // 6. 使用Stream流中的方法min获取集合中最短的字符串，输出到控制台




        // 目标：获取stream流。
        // 1、单列集合获取流的方法都是：调用stream()方法
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();



        // 2、Map集合获取stream()流。//创建map集合
        HashMap<String, Integer> map = new HashMap<>();
        Stream<String> stream1 = map.keySet().stream();
        Stream<Integer> stream2 = map.values().stream();

        //获取map集合的键值对对象流
        Stream<Map.Entry<String, Integer>> stream3 = map.entrySet().stream();

        //3、获取数组的流。//准备数组
        String[] arr = new String[]{"张三丰", "张无忌", "赵敏", "周芷若", "张三丰", "张无忌", "赵敏", "周芷若"};
        //方式一
        Stream<String> stream4 = Stream.of(arr);
        //方式二
        Stream<String> stream5 = Arrays.stream(arr);


        //可变参数：参数个数可以是0到多个
        // 语法：数据类型... 变量名
        demo("a");
        demo("a","b","c");



    }

    public static void demo(String... args){
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
