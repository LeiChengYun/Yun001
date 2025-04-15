package com.itheima.demo2threadapi;

public class ThreadApiDemo1 {
    public static void main(String[] args) {
        // 目标：搞清楚线程的常用方法。
        Thread t1 = new MyThread("1号线程");
        // t1.setName("1号线程");
        t1.start();
        System.out.println(t1.getName()); // 默认名称：thread-0

        Thread t2 = new MyThread("2号线程");
        // t2.setName("2号线程");
        t2.start();
        System.out.println(t2.getName()); // 默认名称：thread-1

        // 主线程的名称
        // 获取主线程对象: 哪个线程执行这个代码，这个代码就获取到哪个线程对象。
        Thread t3 = Thread.currentThread();
        t3.setName("最牛逼的线程");
        System.out.println(t3.getName()); // main
    }
}

class MyThread extends Thread{
    public MyThread(String name) {
        super(name); // 线程名称
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println(t.getName() + "执行输出--->" + i);
        }
    }
}

