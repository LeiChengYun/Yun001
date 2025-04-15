package com.Day04._05多线程并发之Lock锁;

/**
 * @Description MyRunnable
 * @Author ChengYun
 * @Date 2025-04-02  20:56
 */
public class MyRunnable implements Runnable{
    private Account account;
    private ATM atm;

    public MyRunnable(Account account, ATM atm) {
        this.account = account;
        this.atm = atm;
    }

    @Override
    public void run() {
        atm.drawMoney(account,100000);

    }
}
