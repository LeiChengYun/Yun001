package com.oop.oop13_Pritace;

/**
 * @Description Demo_03
 * @Author ChengYun
 * @Date 2025-03-20  21:51
 */
public class Demo_03 {
    public static void main(String[] args) {
        Benz_03 benz = new Benz_03("奔驰",120000.0);
        Bmw_03 bmw = new Bmw_03("宝马",220000.0);
        benz.start();
        benz.run();
        bmw.start();
        bmw.run();
    }
}
