package com.Day02._05Map集合遍历;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Description Demo_04
 * @Author ChengYun
 * @Date 2025-03-29  11:28
 */
public class Demo_04 {
    //某个班级80名学生，现在需要组织秋游活动，班长提供了四个景点依次是（A、B、C、D）,每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多。
    public static void main(String[] args) {
        String[] arr = new String[]{"天安门","故宫","颐和园","长城"};

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            int index = (int)(Math.random()*4);
            list.add(arr[index]);
        }

        HashMap<String,Integer> map = new HashMap<>();

        for (String place : list){
            if (map.containsKey(place)){
                map.put(place,map.get(place)+1);
            }else {
                map.put(place,1);
            }
        }

        for (String place : map.keySet()){
            System.out.println(place+"想去的人有"+map.get(place)+"人");
        }
    }
}
