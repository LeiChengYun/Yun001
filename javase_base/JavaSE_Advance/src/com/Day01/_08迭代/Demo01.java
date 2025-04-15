package com.Day01._08迭代;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Description Demo01
 * @Author ChengYun
 * @Date 2025-03-27  20:49
 */
public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("xiaohua");
        arrayList.add("xiaoli");
        arrayList.add("xiaobai");

        Iterator<String> iterator = arrayList.iterator();
        //注意：迭代器中的游标默认在第一个元素位置
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
