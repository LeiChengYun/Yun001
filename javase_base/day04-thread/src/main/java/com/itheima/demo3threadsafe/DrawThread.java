package com.itheima.demo3threadsafe;
// 取钱线程类。
public class DrawThread extends Thread{
    private Account acc;
    public DrawThread(Account acc, String name){
        super(name); // 设置线程名称
        this.acc = acc; // 绑定账户
    }
    @Override
    public void run() {
        // 小明  小红  拿账户取钱。
        acc.drawMoney(100000);
    }
}
