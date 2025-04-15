package com.数组;

import java.util.Arrays;

/**
 * @Description array07
 * @Author ChengYun
 * @Date 2025-03-17  9:48
 */
public class array07 {
    public static void main(String[] args) {
        String[][] arr1 = new String[][]{
                {"张无忌", "赵敏", "周芷若"} ,
                {"张三丰", "宋远桥", "殷梨亭"},
                {"灭绝", "陈昆", "玄冥二老", "金毛狮王"},
                {"杨逍", "纪晓芙"}
                };
        String [][] arr2 = {
                {"张无忌", "赵敏", "周芷若"} ,
                {"张三丰", "宋远桥", "殷梨亭"},
                {"灭绝", "陈昆", "玄冥二老", "金毛狮王"},
                {"杨逍", "纪晓芙"}
        };
        String arr3[][] = {
                {"张无忌", "赵敏", "周芷若"} ,
                {"张三丰", "宋远桥", "殷梨亭"},
                {"灭绝", "陈昆", "玄冥二老", "金毛狮王"},
                {"杨逍", "纪晓芙"}
        };

        String [] name = arr1[0];
        System.out.println("数组arr1的第一行："+Arrays.toString(name));
        //Arrays.toString() 方法适用于数组类型，而 arr1[0][0] 是一个字符串（String），并非数组，因此无法调用 Arrays.toString() 方法。
        System.out.println("数组arr1的第一行第一个元素："+arr1[0][0]);
        //Arrays.deepToString()可以直接打印二维数组
        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(name));

        //遍历二维数组
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.println("arr1["+i+"]["+j+"]="+arr1[i][j]);
            }
        }

        //数组动态初始化。
        int [][] arr4 = new int[3][];
        int [][] arr5 = new int[3][5];

        arr5[0] = new int[]{1,3,6,8,10}; //正确的
        arr5[1][0] = 1;
        arr5[1][1] = 1;
        arr5[1][2] = 1;
        arr5[1][3] = 1;
        arr5[1][4] = 1;

        System.out.println(Arrays.deepToString(arr5));

        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5[i].length; j++) {
                System.out.println("arr5["+i+"]["+j+"]="+arr5[i][j]);
            }
        }




    }
}