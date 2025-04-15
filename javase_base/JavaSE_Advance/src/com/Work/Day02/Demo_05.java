package com.Work.Day02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @Description Demo_05
 * @Author ChengYun
 * @Date 2025-03-29  14:43
 */
public class Demo_05 {
    public static void main(String[] args) {
        HashMap<String, String> map_j = new HashMap<>();
        map_j.put("001","李晨");
        map_j.put("002","范冰冰");

        HashMap<String, String> map_y = new HashMap<>();
        map_y.put("001","马云");
        map_y.put("002","马化腾");

        HashMap<String,HashMap<String,String>> map_all = new HashMap<>();
        map_all.put("基础班",map_j);
        map_all.put("就业班",map_y);

       /* 7.使用keySet获取所有的key,返回值为set集合,再用增强for循环将set集合存放的key遍历出来
        7.1使用keySet获取某学校集合的所有key
        7.2使用增强for获取某学校集合每个key
        7.3通过key找value,value是Java基础班的HashMap和Java就业班的HashMap
        7.4拿到班级的HashMap所有key
        7.5遍历班级的每个key(学号)
        7.6根据班级的key(学号)去找value(姓名)*/


        //Set<String> keys = map_all.keySet();

        for (String key : map_all.keySet()){
            System.out.println(key);
            HashMap<String, String> map = map_all.get(key);
            for(String key1 : map.keySet()){
                System.out.println(key1 + " " + map.get(key1));
            }
        }









    }
}
