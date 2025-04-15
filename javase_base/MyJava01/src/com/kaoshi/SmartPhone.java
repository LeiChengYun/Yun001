package com.kaoshi;

/**
 * @Description SmartPhone
 * @Author ChengYun
 * @Date 2025-03-24  9:51
 */
public class SmartPhone extends Phone{
    public SmartPhone() {
    }

    public SmartPhone(String brand, double price) {
        super(brand, price);
    }

    public void playGame(){
        System.out.println("在使用"+getPrice()+"元的"+getBrand()+"手机玩游戏");
    }

}
