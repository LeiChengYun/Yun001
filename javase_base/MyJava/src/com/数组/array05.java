package com.数组;

/**
 * @Description array05
 * @Author ChengYun
 * @Date 2025-03-16  11:39
 */
public class array05 {
    public static void main(String[] args) {
        int arr[] = {100, 50, 60, 80, 120};


        //遍历数组，求最大值
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("最大值为：" + max);

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("最小值为：" + min);


    }
}
