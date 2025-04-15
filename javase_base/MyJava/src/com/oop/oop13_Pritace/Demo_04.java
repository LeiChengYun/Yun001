package com.oop.oop13_Pritace;

/**
 * @Description Demo_04
 * @Author ChengYun
 * @Date 2025-03-21  19:57
 */
public class Demo_04 {
    public static void main(String[] args) {
        Phone_04 phone = new Phone_04("水果",4999,"5G");
        phone.call();
        phone.takePhoto();

        Computer_04 computer = new Computer_04("拯救者",7999,"8核");
        computer.coding();
        computer.takePhoto();

        Camera_04 camera = new Camera_04("佳能",6000,"80D");
        camera.video();
        camera.takePhoto();



    }
}
