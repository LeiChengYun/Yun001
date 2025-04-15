package com.Day02._05Map集合遍历;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description Demo_01
 * @Author ChengYun
 * @Date 2025-03-29  10:27
 */
public class Demo_01 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("嫦娥",20);
        map.put("女儿国王",31);
        map.put("嫦娥",28);
        map.put("铁扇公主",38);
        map.put("紫霞",31);
        System.out.println(map);//{娥=28，铁扇公主=38，紫霞=31,女儿国王=31}

        Set<String> keys = map.keySet();

        for(String key : keys){
            //获取所有的键key，在再通过get(key)获取值。
            System.out.println(key + "=" + map.get(key));
        }



    }
}
