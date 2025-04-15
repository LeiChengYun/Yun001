package com.tiantinaxiangshang.Practice;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @Description ZuoYe5
 * @Author ChengYun
 * @Date 2025-03-14  19:26
 */
public class ZuoYe5 {
    public static void main(String[] args) {

        // 求1~100之间能被3和5整除的数之和
        /*int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("sum=" + sum);*/


        //从键盘上录入一个大于100的三位数，打印出100到该数字之间满足如下要求的数字，数字的个数，以及数字的和：
        //1.数字的个位数不为7；2.数字的十位数不为5；3.数字的百位数不为3；
        /*System.out.println("请输入一个三位数：");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int start = 100;
        int sum = 0;
        int count = 0;
        while (start < number) {
           if((start%10 != 7) && (start/10%10 != 5) && (start/100 != 3)){
                System.out.print(start + " ");
                sum += start;
                count++;
           }
            start++;
        }
        System.out.println("\n和为"+sum+"，个数为"+count);
*/




        //1.打印所有四位数中个位+千位==百位+十位的数字2.最后要打印符合条件的数字的总数量
//        int count = 0;
//        for (int i = 1000; i < 10000; i++){
//            int ge = i%10;
//            int shi = i/10%10;
//            int bai = i/100%10;
//            int qian = i/1000;
//            if(ge+qian == bai+shi){
//                count++;
//                System.out.println(i+"\n");
//            }
//        }
//        System.out.println("符合条件的数字的总数量为："+count+"个");


    }

}
