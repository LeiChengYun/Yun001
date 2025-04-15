package com.数组;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description array03
 * @Author ChengYun
 * @Date 2025-03-16  9:45
 */
public class array03 {
    public static void main(String[] args) {
        //声明数组并初始化
        int[] arr1 = {1,2,3,4,5};
        int arr2[] = {1,2,3,4,5};

        int[] arr3 = new int[]{1,2,3,4,5};

        System.out.println(arr1[2]);




        String name[] = {"张三","李四", "王五", "赵六", "钱七", "孙八", "周九", "吴十",
                "郑十一", "王十二", "冯十三", "陈十四", "褚十五", "卫十六", "蒋十七"};
        int index = (int) (Math.random()*name.length);

        System.out.println(name[index]);

        //直接打印数组内容Arrays.toString()
        System.out.println(Arrays.toString(name));



        //录入四个学生成绩
        double score[] = new double[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<score.length;i++){
            System.out.println("请输入第"+(i+1)+"个学生成绩:");
            score[i] = sc.nextDouble();
        }
        System.out.println(Arrays.toString(score));










    }
}
