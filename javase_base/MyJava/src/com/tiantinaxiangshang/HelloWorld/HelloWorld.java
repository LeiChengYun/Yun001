package com.tiantinaxiangshang.HelloWorld;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

////   Byte，Short，char运算自动转化为int类型运算；
//        Byte a = 1;
//        Short b =2;
//        char c = '3';
//        int d = a + b + c;
//
//
////    两个Byte 运算，结果为int类型
//        Byte e = 1;
//        Byte f = 2;
//        int g = e + f;
//
////    两个Short运算，结果为int类型
//        Short h = 1;
//        Short i = 2;
//        int j = h + i;
//

////     强制转换
//    double a = 12231232132312.5d;
//    int b;
//    b = (int)a;
//    System.out.println(b);
//
//    float c = 1223.34f;
//    int d;
//    d = (int)c;
//    System.out.println(d);
//
//    float e = 5.5f;
//    double f = 4.5d;
//    double g = e + f;
//    System.out.println(g);
//
//    int h =100;
//    float i = hf;
//    System.out.println(i);
//
//    System.out.println(Double.MAX_VALUE);
//    System.out.println(Double.MIN_VALUE);
//
//    int j = -10;
//    float k = jf;
//    System.out.println(k);
//
//    int l = 100000;
//    Byte m = (byte)l;
//    System.out.println(m);
//
//
//    float a = 5.1234f;
//    System.out.printf("保留两位小数:%.2f",a);
//
//
//    Scanner scanner = new Scanner(System.in);
//    scanner.nextByte();


    int b = 10;
    System.out.println(2 < 3 && ++b > 5);
    System.out.println(b);

    System.out.println(2 > 3 || ++b > 5);
    System.out.println(b);

    System.out.println(4 > 3 ^ 7 > 5);

    System.out.println("\t你好!!");


    }


}
