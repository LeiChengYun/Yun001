package com.itheima.demo7executorService;


// 1、定义一个类实现Runnable接口
class MyRunnable implements Runnable {
    // 2、重写run方法，编写线程执行体
    @Override
    public void run() {
        for (int i = 1; i <= 2; i++) {
            System.out.println(Thread.currentThread().getName()
                    + "执行输出--->" + i);
            if(i == 1){
                try {
                    Thread.sleep(Integer.MAX_VALUE);
                } catch (Exception e) {
                   e.printStackTrace();
                }
            }
        }
    }
}
