package com.Day01._08迭代;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Description Demo03
 * @Author ChengYun
 * @Date 2025-03-28  9:56
 */
//并发修改问题
public class Demo03 {
    public static void main(String[] args) {
        // test1();
        // test2();
        // test3();
        // test4();
        // test5();
        test6();


    }



    //无法解决并发修改问题，因为他是简易迭代器,无法拿到迭代器对象，不能进行迭代器删除，只能进行集合删除
    private static void test6() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");

        //删除包含枸杞的数据
        for (String name : list) {
            if(name.contains("枸杞")){
                list.remove(name);
            }
        }

        System.out.println(list);
    }



    //使用迭代器删除
    private static void test5() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");

        //删除包含枸杞的数据
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.contains("枸杞")) {
                iterator.remove();
            }
        }

        System.out.println(list);
    }



    //报错：接通过list.remove(name)删除元素会导致并发修改异常（ConcurrentModificationException），应改为使用Iterator的remove()方法安全删除。
    //使用集合删除，集合的新增或删除都会导致迭代器遍历发生异常所以失败了
    private static void test4() {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");

        //删除包含枸杞的数据
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.contains("枸杞")) {
                list.remove(name);
            }
        }

        System.out.println(list);
    }



    //fori循环解决方案2： 从后面往前遍历进行删除
    private static void test3() {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");

        //删除包含枸杞的数据
        for (int i = list.size() - 1; i >= 0; i--) {
            //System.out.println(list.get(i));
            if (list.get(i).contains("枸杞")) {
                list.remove(list.get(i));
            }
        }

        System.out.println(list);
    }

    //解决方案1： 当前删除完，i--
    private static void test2() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");

        //删除包含枸杞的数据
        for (int i = 0; i < list.size(); i++) {
            //System.out.println(list.get(i));
            if (list.get(i).contains("枸杞")) {
                list.remove(list.get(i));
                i--;
            }
        }

        System.out.println(list);
    }


    public static void test1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("枸杞")) {
                // 删除指定元素
                //arraylist.remove(Object obj)
                // 删除指定索引位置的元素
                //arraylist.remove(int index)

                list.remove(i);

            }
        }

        System.out.println(list);
        //删除前：[Java入门,  黑枸杞, 人字拖, 枸杞子]
        //         0        i=1    i=2    i=3
        //删除后：[Java入门, 黑枸杞, 人字拖, 枸杞子]
        //结果：由于删除会导致后面的元素迁移，最终结果部分含有枸杞数据没有删除

    }
}
