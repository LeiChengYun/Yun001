package com.kaoshi;

/**
 * @Description Pra_08
 * @Author ChengYun
 * @Date 2025-03-24  9:35
 */
public class Test01 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int sum = 0;
        //创建一个长度为5的int数组，随机生成5个范围在[20，80]之间的整数保存到这个数组中，把数组中所有索引为奇数并且元素为奇数的数据相加求和。
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (60+1) + 20);
            System.out.println(arr[i]);
            if (i % 2 != 0 && arr[i] % 2 != 0){
                System.out.println("索引为"+i+"的元素为"+arr[i]);
                sum += arr[i];

            }
        }

        System.out.println("sum="+sum);



//        int a =0;
//        System.out.println(a%2 ==0);







    }

}
