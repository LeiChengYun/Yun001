package com.oop.oop22_lamdba;

/**
 * @Description Demo_02
 * @Author ChengYun
 * @Date 2025-03-22  10:28
 */
public class Demo_02 {
    public static void main(String[] args) {
        //命名接口实现类方式（最常用，适合实现类在不同类中多次使用，重用性好）
        SiwmAble_02 s1 = new Student_02();
        action(s1);

        //目标：使用lambda表达式优化部分匿名内部类代码，使程序更加简洁
        //lambda使用前提：接口或抽象类中只有一个抽象方法, 能替换的是函数式接口匿名内部类代码
        //函数式接口: 只有一个抽象方法就是，可以使用@FunctionalInterface注解标识
        //ctrl+alt+方向键左、右： 向左就是定位上一步位置，向右就是定位下一步位置


        //方式一
        SiwmAble_02 s2 = ()->{
            System.out.println("匿名内部类1");
        };
        action(s2);

        //如果只是一行代码，大括号可以省略
        SiwmAble_02 s3 = ()->  System.out.println("匿名内部类2");
        action(s3);


        //还可以这样
        action(()->  System.out.println("匿名内部类3"));




    }


    public static void action(SiwmAble_02 siwmAble){
        siwmAble.swimming();
    }

}
