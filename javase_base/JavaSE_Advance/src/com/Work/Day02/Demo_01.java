package com.Work.Day02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Description Demo_01
 * @Author ChengYun
 * @Date 2025-03-29  8:25
 */
public class Demo_01 {
    //如图所示:有四名学生参加注册会计师考试,表格中记录的是4名学生的考试成绩,请按照成绩将四名学生从小到大进行排名,并将结果展示出来.
    //包含：Comparator,增强for,Collections
    public static void main(String[] args) {
        ArrayList<Student_01> arrayList = new ArrayList<>();
        arrayList.add(new Student_01(1,"小华",99));
        arrayList.add(new Student_01(2,"小李",88));
        arrayList.add(new Student_01(3,"小白",97));
        arrayList.add(new Student_01(4,"小花",90));


        //4.利用collections中的sort方法将4个学生按照考试成绩进行排序
        Collections.sort(arrayList, new Comparator<Student_01>() {
            @Override
            public int compare(Student_01 o1, Student_01 o2) {
                return Double.compare(o1.getScore(),o2.getScore()) ;
            }
        });

        for(Student_01 student : arrayList){
            System.out.println(student);
        }


    }
}
