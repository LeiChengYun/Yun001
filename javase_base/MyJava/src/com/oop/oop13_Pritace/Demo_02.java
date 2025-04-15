package com.oop.oop13_Pritace;

import com.oop.oop03.Car;

/**
 * @Description Demo_02
 * @Author ChengYun
 * @Date 2025-03-20  21:33
 */
public class Demo_02 {
    public static void main(String[] args) {
        Car_02 car1 = new Car_02("大众",120000.0);
        System.out.println(car1.toString());


        Car_02 car2 = new Car_02("宝马",320000.0);
        System.out.println(car2.toString());
    }
}
