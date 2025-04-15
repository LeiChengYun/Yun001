package com.Day04._01多线程;

/**
 * @Description Demo_02
 * @Author ChengYun
 * @Date 2025-04-02  15:47
 */
//多线程创建方式二: 实现Runnable接口
public class Demo_02 {
    public static void main(String[] args) throws InterruptedException {
        //方式一:常规 实现Runnable接口
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr);
        t.start();//启动子线程


        //方式二:简写
        new Thread(new MyRunnable()).start();



        //方式三:匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类创建线程");
            }
        }).start();




        //方式四：Lambda表达式
        new Thread(()->{
            System.out.println("Lambda表达式创建线程");
        }).start();





        //线程休眠（睡一会）
        Thread.sleep(50);//单位毫秒

        System.out.println("主线程运行");


    }

}

//1.创建类实现Runnable接口
class MyRunnable implements Runnable{

    //2.重写run方法执行线程任务代码
    @Override
    public void run() {

        System.out.println("子线程运行");
    }
}