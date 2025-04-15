package com.itheima.demo5_synchronized_method;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private String cardId; // 卡号。
    private double money; // 余额。

    // 小明 小红
    public synchronized void drawMoney(double money) {
        // 拿到是谁来取钱。
        String name = Thread.currentThread().getName();
        // 判断余额是否足够
        if(this.money >= money){
            System.out.println(name + "取钱" + money + "成功！");
            this.money -= money; // 余额 -= money
            System.out.println(name + "取钱后，余额为：" + this.money);
        }else {
            System.out.println(name + "取钱失败，余额不足");
        }
    }
}
