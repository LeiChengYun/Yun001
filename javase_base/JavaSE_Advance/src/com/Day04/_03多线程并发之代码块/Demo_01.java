package com.Day04._03多线程并发之代码块;

/**
 * @Description Demo_01
 * @Author ChengYun
 * @Date 2025-04-02  20:45
 */
public class Demo_01 {
    public static void main(String[] args) {
        Account account = new Account("123456", 100000);

        ATM atm1 = new ATM();

        ATM atm2 = new ATM();
        //4，创建第一个线程让第一个ATM执行取钱任务
        new Thread(new MyRunnable(account, atm1), "小明").start();
        //5。创建第二个线程让第二个ATM执行取钱任务
        new Thread(new MyRunnable(account, atm2), "小红").start();

        //结论：都取款成功，这就是并发多线程不安全问题演示
    }

}
