package com.Day02.Stream流;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description Demo_01
 * @Author ChengYun
 * @Date 2025-03-30  9:48
 */
public class Demo_01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张无忌");


        ArrayList list2 = new ArrayList();

        for(String itme: list){
            if(itme.startsWith("张") && itme.length() == 3){
                list2.add(itme);
            }
        }
        System.out.println(list2);



        //Stream流方式
        List<String> arrayList2 = list.stream()
                .filter(name -> name.startsWith("张") && name.length() == 3)
                .collect(Collectors.toList());
        System.out.println(arrayList2);







        //list.stream().filter(s -> s.startsWith("张")).distinct().forEach(s -> System.out.println(s));
    }
}
