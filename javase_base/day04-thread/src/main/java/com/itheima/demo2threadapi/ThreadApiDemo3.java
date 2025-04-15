package com.itheima.demo2threadapi;

public class ThreadApiDemo3 {
    public static void main(String[] args) throws Exception {
        // 目标：搞清楚线程的join方法：线程插队：让调用这个方法的线程先执行完毕，再执行自己。
        MyThread2 t1 = new MyThread2("线程1");
        t1.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + "执行输出--->" + i);
            if(i == 2){
                // 让子线程t1先执行完毕后，再执行自己
                t1.join();
            }
        }
    }
}


class MyThread2 extends Thread{
    public MyThread2(String name) {
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

