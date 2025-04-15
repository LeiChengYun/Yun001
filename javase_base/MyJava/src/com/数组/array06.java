package com.数组;

import java.util.Arrays;
import java.util.Random;

/**
 * @Description array06
 * @Author ChengYun
 * @Date 2025-03-16  14:06
 */
public class array06 {
    public static void main(String[] args) {
        //printArray();
        printArray1();

    }





    //从一个数组中随机取三个数，求和
    public static void printArray(){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int arr1[]  = new int[3];
        int h = 0;
        int temp = 0;
        while (h<3){
            int index =  (int)(Math.random()*(arr.length)) ;
            arr1[h] = arr[index];
            h++;
        }
        System.out.println(Arrays.toString(arr1));

        for (int i = 0; i < arr1.length; i++) {
            temp += arr1[i];
        }
        System.out.println("总和为："+temp);
    }


    public static void printArray1(){
        //1. 先定义长度为6的动态数组
        int[] arr = new int[6];
        //2. 创建一个随机数对象
        Random r = new Random();
        //3. 遍历数组，给数组的每一个元素进行赋值
        for (int i = 0; i < arr.length; ) { //这里不能直接写i++，我们需要存入数据之后，索引才+1
            //3.1 先生成一个随机数number
            int number = r.nextInt(1, 10);
            //3.2 需要判断number是否存在于数组前面元素
            //需要定义一个标记，用来表示循环执行完之后的结果
            boolean flag = false; //默认number是不存在于数组中
            //3.2.1 重新遍历数组，获取数组前面几项
            for (int j = 0; j < i; j++) {
                //3.2.1.1 用当前的元素和number进行比较，如果有相同的，就代表存在
                if(number == arr[j]){
                    flag = true;//改变标记的值，设置为true，代表number存在于数组中
                    break;
                }
            }
            //3.2.2 如果循环结束之后，都没有相同的，则代表不存在。我们就需要把当前的number存入到数组中
            if(!flag){ //代表没有
                arr[i] = number;
                i++;
            }
        }

        System.out.println("元素为:" + Arrays.toString(arr));
    }


}
