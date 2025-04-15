package com.oop.oop11_多态练习;

/**
 * @Description Card_Demo
 * @Author ChengYun
 * @Date 2025-03-20  17:13
 */
public class Card_Demo {
    public static void main(String[] args) {
        GoldCard goldCard = new GoldCard("粤A778800", "张三", "123456789", 5000);

        payMoney(goldCard, 500);

        SilverCard silverCard = new SilverCard("粤Bh1221","票奥","123456789",2000);

        payMoney(silverCard, 400);

    }

    public static void payMoney(Card c, double money){
        c.pay(money);
    }

}
