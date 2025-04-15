package com.Day01._03认识泛型和泛型类;

import java.util.ArrayList;

/**
 * @Description Demo01
 * @Author ChengYun
 * @Date 2025-03-27  15:28
 */
public class Demo01 {
    public static void main(String[] args) {
        // 容器没有限制，可以存储任意类型的数据

        ArrayList arr1 = new ArrayList();
        arr1.add("lihua1");
        arr1.add("lihua2");
        arr1.add(3);
        arr1.add(true);
        for (Object arr : arr1) {
            System.out.println(arr);
        }


        //泛型容器，可以存储任意类型的数据，但是只能存储一种数据类型，要么是String，要么是Integer，不能是String和Integer混合存储
        //泛型作用：统一数据类型，为了数据更加安全逻辑处理
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("lihua1");
        arr2.add("lihua2");
        //报错，数据类型不对
        //arr2.add(3);

    }
}
