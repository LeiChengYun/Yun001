package com.oop.oop24_员工管理系统;

import java.util.ArrayList;

/**
 * @Description Pra_06
 * @Author ChengYun
 * @Date 2025-03-23  16:07
 */
public class Pra_06 {
    //ArrayList集合
    public static void main(String[] args) {
        //定义数组语法：ArrayList<T> list =  new ArrayList();
        //       T 或 E 代表泛型，泛指一切类型, 只能是引用类型
        //       基本数据类型有对应引用类型（包装类型）
        //       int ---> 引用类型 Integer
        //       double ---> 引用类型 Double
        //       boolean ---> 引用类型 Boolean
        //       char -- > 引用类型 Character
        //       byte -->  Byte
        //       float -->  Float ...
        //底层存储原理： 默认创建ArrayList初始化数组长度10个元素，
        //扩容机制：    如果元素添加第11个，ArrayList会创建新更大的数组，数组长度是原来的1.5倍  10*1.5 = 15个，
        //             将原来长度10元素的内容复制到新数组里面，再设置新元素的数据
        // 1.定义动态数组Array存储多个人的姓名
        // 定义数组（"迪丽热巴","刘亦菲","陈奕迅","古天乐"）
        //方式1：ArrayList<String> nameList = new ArrayList<>(); 初始化长度10
        //方式2：ArrayList<String> nameList = new ArrayList<>(20); 初始化长度20

        ArrayList<String> namelist = new ArrayList<>(20);
        namelist.add("迪丽热巴");
        namelist.add("刘亦菲");
        namelist.add("陈奕迅");
        namelist.add("古天乐");
        System.out.println(namelist);

        System.out.println(namelist.size());
        System.out.println(namelist);

        System.out.println(namelist.get(0));
        System.out.println(namelist);

        System.out.println(namelist.remove(1));
        System.out.println(namelist);

        System.out.println(namelist.set(0,"leilei"));
        System.out.println(namelist);

        System.out.println(namelist.remove("陈奕迅"));
        System.out.println(namelist);


    }
}
