package com.Day02._04Map集合;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Description Dmeo_01
 * @Author ChengYun
 * @Date 2025-03-28  21:40
 */
//map特点
public class Dmeo_01 {
    public static void main(String[] args) {

        //目标：操作hashMap，无序，键不重复，无索引
        Map<String,String> map1 = new HashMap<>();
        map1.put("004","张三");
        map1.put("004","李四");//覆盖了张三，key=001,value=李四
        map1.put("002","abc");
        map1.put("008","dd");
        map1.put("abc","dd");
        map1.put("009","dd");
        System.out.println(map1);

        //目标：操作LinkedhashMap，有序，键不重复，无索引
        Map<String,String> map2 = new LinkedHashMap<>();
        map2.put("004","张三");
        map2.put("004","李四");
        map2.put("002","abc");
        map2.put("008","dd");
        map2.put("abc","dd");
        map2.put("009","dd");
        System.out.println(map2);


        //目标：操作TreeMap，有序(按照键默认升序)，键不重复，无索引
        Map<String,String> map3 = new TreeMap<>();
        map3.put("a","张三");
        map3.put("b","李四");
        map3.put("e","abc");
        map3.put("c","dd");
        map3.put("h","dd");
        System.out.println(map3);


    }
}
