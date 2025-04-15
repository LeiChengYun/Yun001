package com.Day01._01认识异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Description Dmeo_01
 * @Author ChengYun
 * @Date 2025-03-27  9:47
 */
public class Dmeo_01 {
    public static void main(String[] args) {
        //test01();
        try {
            test02();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("异常处理");
        }

    }

    public static void test01(){
        int[] arr = new int[3];
        System.out.println(arr[3]);
    }

    public static void test02() throws FileNotFoundException {

        //运行异常：运行时异常，编译器不能确定，运行时才能确定
        int[] arr1 = new int[3];
        int index = 11;

        //解决运行时异常推荐的解决方案：能加预知到的异常数据进行校验排除
        if(arr1.length > index){
            System.out.println(arr1[index]);
        }



        //异常捕获，不能预知到的异常数据进行捕获处理,不处理程序报错
        try {
            System.out.println(arr1[index]);
        }catch (Exception e){
            //打印异常信息
            e.printStackTrace();
            //输出异常信息,处理
            System.out.println("数组越界异常");
        }

        //编译时异常：必须处理，不处理程序不能编译
        //方案1: 方法抛出异常，语法  throws 异常类型;  一般推荐抛出Exception,这样任何的子类都可以抛出，否则需求根据不同的子类进行抛出
        FileInputStream fileInputStream = new FileInputStream("d:/a.txt");//编译时错误，有可能找不到所以编译时就发生错误



    }

}
