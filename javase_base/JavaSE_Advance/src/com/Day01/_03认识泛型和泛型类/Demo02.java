package com.Day01._03认识泛型和泛型类;

/**
 * @Description Demo02
 * @Author ChengYun
 * @Date 2025-03-27  15:49
 */
public class Demo02 {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("java");
        list.remove(1);
        System.out.println(list.toString());

    }
}
