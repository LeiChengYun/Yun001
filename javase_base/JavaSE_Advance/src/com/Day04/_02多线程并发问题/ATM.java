package com.Day04._02多线程并发问题;

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
    public void drawMoney(Account account, double money){

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
