package com.oop.oop13_Pritace;

/**
 * @Description Bmw
 * @Author ChengYun
 * @Date 2025-03-20  21:48
 */
public class Bmw_03 extends Car_03{
    public Bmw_03(String name, double price) {
        super(name, price);
    }

    @Override
    public void start() {
        System.out.println("bmw start");
    }

    @Override
    public void run() {
        System.out.println("bmw run");
    }
}
