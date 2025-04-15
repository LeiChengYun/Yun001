package com.itheima.demo4_synchronized_code;

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
    public void drawMoney(double money) {
        // 拿到是谁来取钱。
        String name = Thread.currentThread().getName();
        // 建议同步代码块使用this作为锁：this此时正好代表共享资源：账户对象。
        synchronized (this) {
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
}
