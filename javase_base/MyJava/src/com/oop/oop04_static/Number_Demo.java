package com.oop.oop04_static;

/**
 * @Description Number_Demo
 * @Author ChengYun
 * @Date 2025-03-18  15:08
 */
public class Number_Demo {
    public static void main(String[] args) {

        Number.number = 1;
        System.out.println(Number.number);

        Number number1 = new Number();
        System.out.println(number1.number);

        Number number2 = new Number();
        System.out.println(number2.number);//打印出来等于3

        //调用静态方法，1.直接类名调用  2.实例对象调用  都一样
        number1.print_st();
        Number.print_st();


    }
}
