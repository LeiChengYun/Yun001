package com.oop.oop11_多态练习;

/**
 * @Description SilverCard
 * @Author ChengYun
 * @Date 2025-03-20  16:10
 */
public class SilverCard extends Card {
    public SilverCard(String cardNumber, String name, String phone, double money) {
        super(cardNumber, name, phone, money);
    }
    @Override
    public void pay(double money) {
        if (getMoney() >=money){
            double discount = money * 0.8;
            setMoney(getMoney() - discount);
            System.out.println("支付成功,本次消费金额为:"+money+"\n您是尊贵的银卡用户优惠后实付金额为:"+discount+"\n剩余余额为:"+getMoney());

        }else{
            System.out.println("余额不足");
        }
    }

}
