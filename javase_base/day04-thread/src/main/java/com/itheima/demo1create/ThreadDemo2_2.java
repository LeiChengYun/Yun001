package com.itheima.demo1create;

public class ThreadDemo2_2 {
    public static void main(String[] args) {
        // 目标：掌握多线程的创建方式二：使用Runnable接口的匿名内部类来创建
        Runnable target = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("线程1执行输出--->" + i);
                }
            }
        };
        Thread t = new Thread(target);
        t.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("线程2执行输出--->" + i);
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("线程3执行输出--->" + i);
            }
        }).start();

    }
}
