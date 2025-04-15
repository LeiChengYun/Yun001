package com.itheima.demo1create;

public class ThreadDemo1 {
    // main方法本身是由一条主线程负责推荐执行的。
    // 默认是主线程执行main方法的
    public static void main(String[] args) {
        // 目标：认识多线程，掌握创建线程的方式一：继承Thread类来实现
        // 3、创建线程类的对象代表一个线程。
        Thread t = new MyThread();
        // 4、启动线程：向cpu注册一条新线程，并执行run方法
        t.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("main线程执行输出--->" + i);
        }
    }
}

// 1、创建一个线程类，继承Thread类
class MyThread extends Thread{
    // 2、重写run方法，设置线程任务
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("子线程执行输出--->" + i);
        }
    }
}
