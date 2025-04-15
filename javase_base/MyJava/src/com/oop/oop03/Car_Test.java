package com.oop.oop03;

import java.util.Scanner;

/**
 * @Description Car_Test
 * @Author ChengYun
 * @Date 2025-03-18  10:57
 */
public class Car_Test {
    public static void main(String[] args) {
        // 创建 Car 类型的数组，用于存储 3 辆小轿车的对象
        Car car[] = new Car[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < car.length; i++) {
            System.out.println("请输入车牌号");
            String no = sc.next();
            System.out.println("请输入颜色");
            String color = sc.next();
            car[i] = new Car(no,color);  // 创建 Car 对象并存入数组
        }

//        for (int i = 0; i < car.length; i++) {   //第一种遍历方法
//            car[i].info();
//        }

        for (Car car1 : car) {   //第二种遍历方法
            car1.info();
        }

        sc.close(); // 关闭 Scanner 对象
    }
}
