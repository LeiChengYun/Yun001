package com.oop.oop11_多态练习;

/**
 * @Description GoldCard
 * @Author ChengYun
 * @Date 2025-03-20  16:09
 */
public class GoldCard extends Card {
    public GoldCard(String cardNumber, String name, String phone, double money) {
        super(cardNumber, name, phone, money);
    }

    @Override
    public void pay(double money) {
       if (getMoney() >=money){
           double discount = money * 0.8;
           setMoney(getMoney() - discount);
           System.out.println("支付成功,本次消费金额为:"+money+"\n优惠后实付金额为:"+discount+"\n剩余余额为:"+getMoney());
           if(money > 200.0){
               System.out.println("恭喜您,您本次消费金额超过200元,获得洗车券");
           }
       }else{
           System.out.println("余额不足");
       }

    }

}
