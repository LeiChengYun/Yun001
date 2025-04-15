package com.Work.Day02;

import java.util.ArrayList;

/**
 * @Description TDemo_03
 * @Author ChengYun
 * @Date 2025-03-29  16:22
 */
//编写一个方法，接收一个 ArrayList 和一个索引，尝试获取该索引处的元素。如果索引越界，捕获异常并输出错误信息。
public class TDemo_04 {
    public static void main(String[] args) {
        ArrayList<String> testList = new ArrayList<>();
        testList.add("元素1");
        testList.add("元素2");
        testList.add("元素3");

        // 测试 getElementAtIndex 方法
        int index = 6; // 你可以更改这个索引来测试不同的情况
        String element = getElementAtIndex(testList, index);
        if (element != null) {
            System.out.println("索引 " + index + " 处的元素是: " + element);
        }
    }

    /**
     * 获取指定索引处的元素，如果索引越界则输出错误信息
     *
     * @param list  ArrayList
     * @param index 索引
     * @return 索引处的元素，如果索引越界则返回 null
     */
    public static <T> T getElementAtIndex(ArrayList<T> list, int index) {
        try {
            return list.get(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("错误: 索引 " + index + " 越界");
            return null;
        }
    }
}
