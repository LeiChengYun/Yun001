package com.oop.oop11_多态练习;

/**
 * @Description Card
 * @Author ChengYun
 * @Date 2025-03-20  16:09
 */
public class Card {
    private String cardNumber; //车牌号码
    private String name;//车主姓名
    private String phone;//电话号码
    private double money;//卡片余额

    public Card(String cardNumber, String name, String phone, double money) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.phone = phone;
        this.money = money;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

//    public Card() {
//    }

    public void pay(double money){
        if (this.money >=money){
            this.money -= money;
            System.out.println("支付成功,剩余余额为:"+this.money);
        }else{
            System.out.println("余额不足");
        }
    }

}
