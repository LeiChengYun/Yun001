package com.Work.Day01;

import java.util.ArrayList;

/**
 * @Description Demo01
 * @Author ChengYun
 * @Date 2025-03-27  22:02
 */
public class Demo_01 {
    public static void main(String[] args) {

        ArrayList<Student_01> arrayList = new ArrayList<>();
        arrayList.add(new Student_01(1,"小华",99));
        arrayList.add(new Student_01(2,"小李",98));
        arrayList.add(new Student_01(3,"小白",97));
        arrayList.add(new Student_01(4,"小花",96));

        double min = arrayList.get(0).getScore();
        int index = 0;
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i).getScore() < min){
                min = arrayList.get(i).getScore();
                index = i;
            }
        }
        arrayList.remove(index);

        System.out.println(arrayList);







    }
}
