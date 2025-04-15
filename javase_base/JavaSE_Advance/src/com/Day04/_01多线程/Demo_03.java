package com.Day04._01多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Description Demo_03
 * @Author ChengYun
 * @Date 2025-04-02  16:34
 */
//多线程创建方式三:实现Callable接口
public class Demo_03 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //一个子线程完成任务，并返回结果
        //long start = System.currentTimeMillis();
        //MyCallable myCallable = new MyCallable(0,1500);
        //FutureTask<Integer> f1 = new FutureTask<>(myCallable);
        //new Thread(f1).start();
        //Integer result = f1.get();//会阻塞等待子线程运行完成得到结果才会往下执行主线程
        //long end = System.currentTimeMillis();
        //System.out.println("计算结果为:"+result+"多线程运行时间:"+(end-start)+"毫秒");

         ////一个子线程完成任务呢
         //long start = System.currentTimeMillis();
         ////3.创建Callable对象
         //MyCallable myCallable = new MyCallable(0, 1500);
         ////4.创建FutureTask任务对象，传入Callable对象
         //FutureTask<Integer> f1 = new FutureTask<>(myCallable);
         ////5.创建线程对象，基于FutureTask创建，并启动线程
         //new Thread(f1).start();
         ////6.获取线程结果
         //Integer result = f1.get();//会阻塞等待子线程运行完成得到结果才会往下执行主线程
         //long end = System.currentTimeMillis();
         //System.out.println("计算结果："+result+",共耗时："+(end-start)+"毫秒");


        long start = System.currentTimeMillis();
        //第一个线程任务
        FutureTask<Integer> f1 = new FutureTask<>(new MyCallable(0, 500));
        new Thread(f1).start();
        //第二个线程任务
        FutureTask<Integer> f2 = new FutureTask<>(new MyCallable(501, 1000));
        new Thread(f2).start();
        //第三个线程任务
        FutureTask<Integer> f3 = new FutureTask<>(new MyCallable(1001, 1500));
        new Thread(f3).start();
        //6.获取线程结果
        Integer result1 = f1.get();
        Integer result2 = f2.get();
        Integer result3 = f3.get();
        long end = System.currentTimeMillis();
        System.out.println("计算结果："+(result1+result2+result3)+",共耗时："+(end-start)+"毫秒");
        //得出结果：3个线程做需要1000多毫秒






    }
}

class MyCallable implements Callable<Integer>{
    private Integer start;
    private Integer end;

    public MyCallable(Integer start, Integer end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
            System.out.println("第"+i+"次累加,结果:"+sum);
            Thread.sleep(2);
        }
        return sum;
    }
}
