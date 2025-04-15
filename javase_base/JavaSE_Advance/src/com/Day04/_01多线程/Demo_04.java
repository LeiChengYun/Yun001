package com.Day04._01多线程;

/**
 * @Description Demo_04
 * @Author ChengYun
 * @Date 2025-04-02  17:20
 */
//多线程常用方法
public class Demo_04 {
    public static void main(String[] args) throws InterruptedException {
        My_Thread my_thread = new My_Thread("thread-0");
        my_thread.start();

        Thread thread = new Thread(()->{
            for (int i = 0; i < 10; i++) {

                System.out.println(Thread.currentThread().getName() + ":子线程正在运行...");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }, "thread-1");
        thread.start();




        //Thread.sleep(10);
        //Thread.currentThread() 获取当前执行的线程对象Thread
        //Thread对象.getName() 获取线程名称
        for (int i = 0; i < 10; i++) {
            //if (i == 5){
            //    thread.interrupt();//中断线程
            //}

            if(i==3){
                thread.join();//阻塞等待当前线下运行完当前线程（主线程）才能继续运行（优先运行当前子线程）
            }


            System.out.println(Thread.currentThread().getName() + ":主线程正在运行...");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

}

//1.定义类，继承Thread
class My_Thread extends Thread{

    public My_Thread(String name){
        super(name);//给线程起名字
    }

    //2.重写线程任务执行的run方法
    @Override
    public void run() {
        System.out.println( Thread.currentThread().getName()+":子线程正在运行...");//thread-0，如果起名字就按照起的名字
    }
}
