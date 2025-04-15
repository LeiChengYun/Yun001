package com.itheima.demo1create;


public class ThreadDemo2 {
    public static void main(String[] args) {
        // 目标：掌握多线程的创建方式二：实现Runnable接口来创建。
        // 3、创建Runnbale的实现类对象，代表一个任务对象。
        Runnable target = new MyRunnable();
        // 4、把任务对象交给线程对象来处理: public Thread(Runnable target) {
        Thread t = new Thread(target);
        // 5、启动线程：向cpu注册一条新线程，并执行run方法
        t.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("main线程执行输出--->" + i);
        }
    }
}

// 1、定义一个类实现Runnable接口
class MyRunnable implements Runnable {
    // 2、重写run方法，编写线程执行体
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("子线程执行输出--->" + i);
        }
    }
}
