package com.tiantinaxiangshang.Practice;


import java.util.Scanner;

/**
 * @Description ZuoYe1
 * @Author ChengYun
 * @Date 2025-03-10  19:16
 */
public class ZuoYe1 {
    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个成绩:");
//        int score = sc.nextInt();
//        Check(score);

        Flow2();

    }

    public static void Check(int score){
        if(score < 0 || score > 100){
            System.out.println("成绩不合法");
        }else if (score >=90 ) {
            System.out.println("成绩优秀");
        }else if(score >=80){
            System.out.println("成绩良好");
        }else if(score >= 60){
            System.out.println("成绩及格");
        }else {
            System.out.println("成绩不及格");
        }
    }

    public static void Flow(){
        int i = 5;
        do {
            --i;
            System.out.println(i);
        }while (i >= 0);
    }

    public static void Flow2(){
        for (int i = 0; i < 1000; i++) {
            System.out.println(i+"次");
        }

    }

}
