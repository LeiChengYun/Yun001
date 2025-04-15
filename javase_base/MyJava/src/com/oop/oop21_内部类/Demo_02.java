package com.oop.oop21_内部类;

import com.oop.oop17_接口.Student;

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


        //匿名内部类方式(生成的实现类对象智能在当前类中使用，重用性不好，但是适合只在当前类中使用)
        //作用：适合临时一次使用匿名实现类对象,重用性不好
        //特点：看着是实例接口或抽象父类对象，本质返回匿名的子类或实现类对象
        //写法1
        SiwmAble_02 s2 = new SiwmAble_02() {
            @Override
            public void swimming() {
                System.out.println("匿名内部类1");
            }
        };
        action(s2);



        //写法2
        action(new SiwmAble_02() {
            @Override
            public void swimming() {
                System.out.println("匿名内部类2");
            }
        });


    }


    //多态方法应用：形参使用接口或父类
    public static void action(SiwmAble_02 siwmAble){
        siwmAble.swimming();
    }

}
