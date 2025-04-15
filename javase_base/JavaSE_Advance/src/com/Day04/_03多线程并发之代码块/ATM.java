package com.Day04._03多线程并发之代码块;

/**
 * @Description ATM
 * @Author ChengYun
 * @Date 2025-04-02  20:52
 */
public class ATM {
    /**
     * 取钱方法
     * @param account
     * @param money
     */

    //解决多线程并发安全问题方式1：同步代码块
    //语法：synchronized (同步锁){存在不安全的代码}
    //同步锁说明：
    //    共享资源对象（推荐）， 例如Account对象，小红和小明竞争这个第一个账户锁, 小张和小李竞争第二个账户锁
    //    this, 调用当前方法的对象，这里就是ATM对象，有4个ATM就会有4个锁
    //    类.class， 类对象，全局只有一份，所有人都竞争这一个锁.
    public void drawMoney(Account account, double money){
        synchronized (account){

            if(account.getMoney() >= money){
                try {
                    Thread.sleep(20);
                    //该代码片段通过 Thread.sleep(20) 模拟了线程在执行取款操作时的延迟（例如网络请求或数据库操作的延迟）。
                    //这种延迟可能会暴露多线程并发问题，例如多个线程同时访问共享资源时可能导致数据不一致。
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                //提示取消成功
                account.setMoney(account.getMoney() - money);
                System.out.println(Thread.currentThread().getName() + "："+account.getCardNo() + "卡号取款成功，取款金额：" + money );
                System.out.println(Thread.currentThread().getName() +"取钱后余额："+account.getMoney());
            }else{
                System.out.println(Thread.currentThread().getName() +"取款失败，余额不足！！！");
            }
        }


    }

}
