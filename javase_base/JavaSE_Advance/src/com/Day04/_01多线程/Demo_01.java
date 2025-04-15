package com.Day04._01多线程;

/**
 * @Description Demo_01
 * @Author ChengYun
 * @Date 2025-04-02  15:26
 */
//多线程创建方式1：继承Thread类
public class Demo_01 {
    //main方法的执行也是一个线程，默认是主线程
    public static void main(String[] args) {

        //目标：创建线程方式1：集成Thread

        //3.创建线程对象
        MyThread myThread = new MyThread();

        //4.启动线程运行（就会运行里面run方法代码）
        myThread.start();//注意这里不可以调用myThread.run()，否则没有使用新的线程运行，而只是一个普通对象调用一个普通方法

        //注意：目前上面两个线程是一起运行的，在同一时间点一个cpu只能执行一个线程
        //     当有多个线程cpu采用轮片执行

        System.out.println("main主线程运行");
        //System.out.println(Thread.currentThread().getName() + ":主线程正在运行...");


    }
}

//1.定义类，继承Thread
class MyThread extends Thread{

    //2.重写线程任务执行的run方法
    @Override
    public void run() {
        System.out.println("子线程正在运行...");
    }
}
