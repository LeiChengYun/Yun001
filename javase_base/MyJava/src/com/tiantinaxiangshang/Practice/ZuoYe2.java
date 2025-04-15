package com.tiantinaxiangshang.Practice;

/**
 * @Description ZuoYe2
 * @Author ChengYun
 * @Date 2025-03-11  19:44
 */
public class ZuoYe2 {
    public static void main(String[] args) {

        /*Byte a = 1;
        Short b = 2;
        int c = 3;
        long d = 4l;
        float e = 5.5f;
        double f = 6.123456789123456789123456789d;
        char g = '7';
        boolean h = true;

        System.out.println(f);*/



        /*int a = 1000;
        double b = a;
        System.out.println(b);

        byte c = 127;
        short d = c;
        System.out.println(d);

        double e = 100.23;
        int f = (int)e;
        System.out.println(f);*/


        /*byte a = 10;
        byte b = 20;
        int c =a + b;
        System.out.println(c);

        byte d = 10;
        char e = 'a';
        float f = 3.55f;
        double g = 4.5d;
        System.out.println(d + e + f + g);*/

        Check();



    }
    //static方法,不用创建实例，可以直接调用。
    public static void Check(){
        double a = 5000.5d;
        System.out.println("手机价格是否符合要求4000元-6000元,该手机价格为" + a + "元,符合要求吗?" +(a>=4000 && a<=60000));
    }
}
