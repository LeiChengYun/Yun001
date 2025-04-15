package com.Work.Day02;

import java.util.*;

/**
 * @Description Demo_02
 * @Author ChengYun
 * @Date 2025-03-29  9:32
 */
public class Demo_02 {
    //彩票双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
    // 红色球号码从1~33中选择；蓝色球号码从1~16中选择；请结合集合所学知识，随机生成一注双色球号码，要求同色号码不重复。

    public static void main(String[] args) {
        Random random = new Random();
        HashSet<Integer> hashSet = new  HashSet<>();

        //利用HashSet特性去重。
        while (hashSet.size()<6){
            int num = random.nextInt(33)+1;
            hashSet.add(num);
        }

        //这段代码是一个构造函数，用于初始化一个ArrayList对象。
        // 它接收一个实现了Collection接口的集合对象c作为参数，并将该集合中的所有元素添加到新创建的ArrayList中。
        // 泛型? extends E表示集合c中的元素类型必须是E或其子类。
        ArrayList<Integer> arrayList = new ArrayList<>(hashSet);
        //for(Integer element : hashSet){
        //    System.out.println(element);
        //    arrayList.add(element);
        //}

        Collections.sort(arrayList);

        int Blue = random.nextInt(16)+1;

        for (Integer element : arrayList){
            System.out.println("红球："+element);
        }

        System.out.println("蓝球："+Blue);

    }
}
