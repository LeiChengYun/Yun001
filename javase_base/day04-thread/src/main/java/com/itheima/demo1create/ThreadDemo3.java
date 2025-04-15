package com.itheima.demo1create;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadDemo3 {
    public static void main(String[] args) {
        // 目标：掌握多线程的创建方式三：实现Callable接口，方式三的优势：可以获取线程执行完毕后的结果的。
        // 3、创建一个Callable接口的实现类对象。
        Callable<String> call1 = new MyCallable(200);
        // 4、把Callable对象封装成一个真正的线程任务对象FutureTask对象。
        /**
         * 未来任务对象的作用？
         *    a、本质是一个Runnable线程任务对象，可以交给Thread线程对象处理。
         *    b、可以获取线程执行完毕后的结果。
         */
        FutureTask<String> f1 = new FutureTask<>(call1);
        // 5、把未来任务对象交给线程对象来处理: public Thread(Runnable target) {}
        Thread t1 = new Thread(f1);
        // 6、启动线程：向cpu注册一条新线程，并执行run方法
        t1.start();

        Callable<String> call2 = new MyCallable(300);
        FutureTask<String> f2 = new FutureTask<>(call2);
        Thread t2 = new Thread(f2);
        t2.start();


        // 线程执行完毕后取结果
        try {
            // 主线程执行这里获取第一个线程的结果时，如果发现第一个线程还没有执行完毕，会等待第一个线程执行完毕后才往下走！！
            String result = f1.get();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            // 主线程执行这里获取第二个线程的结果时，如果发现第二个线程还没有执行完毕，会等待第二个线程执行完毕后才往下走！！
            String result = f2.get();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


// 1、定义一个Callable任务类实现Callable接口
class MyCallable implements Callable<String>{
    private int n;
    public MyCallable(int n) {
        this.n = n;
    }

    // 2、重写Call方法，声明线程返回的结果。
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return "子线程求和1-" + n + "结果是：" + sum;
    }
}