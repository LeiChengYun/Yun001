package com.Work.Day02;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Description Demo04
 * @Author ChengYun
 * @Date 2025-03-29  11:44
 */
public class Demo_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        while (true){
            System.out.println("请输入商品名称：");
            String name = scanner.next();
           if(map.containsKey(name)){
               map.put(name,map.get(name)+1);
           }else if(name.equals("end")){
               System.out.println(map);
               return;
           }else {
               map.put(name,1);
           }
        }

    }
}
