package com.数组;

import java.util.Random;

/**
 * @Description array08
 * @Author ChengYun
 * @Date 2025-03-17  10:47
 */
public class array08 {
    public static void main(String[] args) {
    //案例：生成石头迷阵数据，给一个数字就会生成这个数字的行和列数据
    //main方法调用方法生成石头迷阵数据并且打乱顺序，传入参数是指定的数字

    arrList(5);

    }

    public static void arrList(int n){   //生成石头迷阵数据

        int arr[][] = new int[n][n];
        int number = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = number++;
            }
        }

        System.out.println("初始化二维数组数据:");
        //调用打印函数；
        printArr(arr);


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                int row = (int)(Math.random() * n);
                int col = (int)(Math.random() * n);

                int temp = arr[i][j];
                arr[i][j] = arr[row][col];
                arr[row][col] = temp;

            }
        }

        //5.打印打乱顺序的二维数组数据（调用方法实现打印）
        System.out.println("打乱顺序的二维数组数据：");
        printArr(arr);

    }


    public static void printArr(int[][] arr){   //打印数组
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            //换行
            System.out.println();
        }
    }

}
