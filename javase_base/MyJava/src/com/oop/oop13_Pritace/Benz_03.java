package com.oop.oop13_Pritace;

/**
 * @Description Benz
 * @Author ChengYun
 * @Date 2025-03-20  21:47
 */
public class Benz_03 extends Car_03 {
    public Benz_03(String name, double price) {
        super(name, price);
    }

    @Override
    public void start() {
        System.out.println("benz start");
    }

    @Override
    public void run() {
        System.out.println("benz run");
    }
}
