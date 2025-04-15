package com.Work.Day02;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description Demo_01
 * @Author ChengYun
 * @Date 2025-03-28  22:12
 */
public class TDemo_01 {
    //题目描述：编写一个方法，接收两个 ArrayList，将它们合并成一个新的 ArrayList，并去除其中的重复元素。
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("aa");
        list1.add("bb");
        list1.add("cc");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("aa");
        list2.add("dd");
        list2.add("ee");

        test02(list1,list2);

    }


    public static void test02(List<String> a, List<String> b) {
        for (String item : b) {
            if (!a.contains(item)) { // 检查是否已存在，避免重复添加
                a.add(item);
            }
        }
        System.out.println(a);
    }
}
