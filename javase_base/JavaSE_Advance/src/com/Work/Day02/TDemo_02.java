package com.Work.Day02;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * @Description Demo_02
 * @Author ChengYun
 * @Date 2025-03-29  8:15
 */
public class TDemo_02 {
    //题目描述：编写一个方法，接收一个 TreeSet，找出其中最大和最小的元素。
    //看不懂。。。。
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(5);
        treeSet.add(15);

        List<Integer> minMax = findMinMax(treeSet);
        System.out.println("最小值: " + minMax.get(0));
        System.out.println("最大值: " + minMax.get(1));
    }



    /**
     * 找出 TreeSet 中的最大和最小元素
     *
     * @param treeSet 输入的 TreeSet
     * @return 包含最小和最大元素的数组，数组的第一个元素是最小值，第二个元素是最大值
     */
    public static <T extends Comparable<T>> List<T> findMinMax(TreeSet<T> treeSet) {
        if (treeSet == null || treeSet.isEmpty()) {
            throw new IllegalArgumentException("TreeSet 不能为空或为 null");
        }

        T min = treeSet.first();
        T max = treeSet.last();

        List<T> result = new ArrayList<>();
        result.add(min);
        result.add(max);
        return result;
    }

}
