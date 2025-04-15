package com.Day02._05Map集合遍历;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description Demo_02
 * @Author ChengYun
 * @Date 2025-03-29  10:33
 */
public class Demo_02 {
    public static void main(String[] args) {
        // 目标：掌握Map集合的遍历方式二：键值对直接遍历。
        Map<String,Integer> map = new HashMap<>();
        map.put("嫦娥", 20);
        map.put("女儿国王", 31);
        map.put("嫦娥", 28);
        map.put("铁扇公主", 38);
        map.put("紫霞", 31);
        System.out.println(map); // {嫦娥=28, 铁扇公主=38, 紫霞=31, 女儿国王=31}

        //键值对遍历方式
        //1.获取所有所有键值对的set集合
        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        //2.遍历set，每个元素是键值对对象
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry);

            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

    }
}
