package com.tiantinaxiangshang.HelloWorld;

/**
 * @Description HelloWorld02
 * @Author ChengYun
 * @Date 2025-03-14  11:44
 */
public class HelloWorld02 {
    public static void main(String[] args) {

        String c = "星期一";

//        switch (c){
//            case "男" :
//                System.out.println("三国演义");
//                break;
//            case "女" :
//                System.out.println("红楼梦");
//                break;
//            default :
//                System.out.println("其他");
//        }


        //如果没有break ，则执行完case后，会继续执行case的下一条case，直到遇到break
        switch(c){
            case "星期一" :
            case "星期二" :
            case "星期三" :
            case "星期四" :
                System.out.println("上课");
                break;
            case "星期五" :
            case "星期六" :
            case "星期日" :
                System.out.println("休息");
                break;
            default :
                System.out.println("其他");
        }

        //累加
//        int sum = 0;
//        for (int i = 1; i < 11; i++) {
//             sum += i;
//             System.out.println("第"+i+"次计算，sum="+sum);
//        }

        //冒泡排序
        //解释：每次循环，都会把最大的数放到最后，这样下一次循环，就少一个数，直到循环完所有数
//        int[] arr = {1,2,9,4,6,5,7,8,18,10};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length-1-i; j++) {
//                if (arr[j] > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }


        //1-10的奇数之和，1,3,5,7,9
//        int a = 0;
//        for (int i =1 ; i <= 10 ; i++){
//            if (i % 2 != 0){
//                a += i;
//                System.out.println(a);
//            }
//        }

        //水仙花数：一个三位数，个位、十位、百位数字的立方之和等于这个三位数本身
//        for(int i = 100; i <= 999 ; i++){
//            //个位数
//            int a  = i % 10;
//            //十位数
//            int b = i / 10 % 10;
//            //百位数
//            int e = i / 100;
//
//            if ((a*a*a + b*b*b + e*e*e) == i){
//                System.out.println(i);
//
//            }
//        }

        //折纸
        int count = 0;
        float thicKness = 0.1f;
        while (thicKness < 8848860){
                thicKness *= 2;
                count++;
        }
        System.out.println(count+"次 "+thicKness);









    }
}
