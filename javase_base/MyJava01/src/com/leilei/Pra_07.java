package com.leilei;

import java.util.ArrayList;

/**
 * @Description Pra_07
 * @Author ChengYun
 * @Date 2025-03-23  16:44
 */
public class Pra_07 {
    //ArrayList集合遍历
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("xiaohua");
        list.add("xiaoli");
        list.add("xiaobai");
        list.add("xiaohong");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for(String s : list){
            System.out.println(s);
        }

        list.forEach((items) ->{
            System.out.println(items);
        });



    }
}
