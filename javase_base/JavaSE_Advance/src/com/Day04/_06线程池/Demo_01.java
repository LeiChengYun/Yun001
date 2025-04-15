package com.Day04._06线程池;


import java.util.concurrent.*;

/**
 * @Description Demo_01
 * @Author ChengYun
 * @Date 2025-04-03  10:06
 */

public class Demo_01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //目标：使用ExecutorService接口实现类ThreadPoolExecutor创建线程池。
        ExecutorService pool = new ThreadPoolExecutor(
                3,//参数1：核心线程数，相当于正式工，稳定常用的线程。核心线程创建后不会被销毁
                5,//参数2：最大线程数，最大线索数-核心线程数=临时线程数，临时线程看成临时工，当不忙的时候会销毁临时线程
                //什么时候使用临时线程？答：核心线程没有空闲，工作队列也满了，才会使用临时线程
                10,//参数3：临时线程存活时间，临时线程空闲了多少秒/毫秒就销毁
                TimeUnit.SECONDS,//参数4：临时线程存活时间的单位
                new ArrayBlockingQueue<>(3),//参数5：设置工作队列，核心线程忙不过来就会存入工作对象
                Executors.defaultThreadFactory(),//参数6：设置线程工厂，创建核心线程或临时线程
                // newThreadPooLExecutor.AbortPoLicy（）// 参数7：设置拒绝策略，当临时线程也忙不过来，会拒绝任务抛出异常
                new ThreadPoolExecutor.DiscardPolicy()//参数7：设置拒绝策略，将任务交给调佣线程池的线程去处理 (这里是main主线程)
        );


        //从线程池中获取线程执行任务
        pool.execute(new MyRunnalble()); //将任务给到线程池去处理，核心线程数来做
        pool.execute(new MyRunnalble()); //将任务给到线程池去处理，核心线程数来做
        pool.execute(new MyRunnalble()); //将任务给到线程池去处理，核心线程数来做
        pool.execute(new MyRunnalble()); //将任务给到线程池去处理，加入队列
        pool.execute(new MyRunnalble()); //将任务给到线程池去处理，加入队列
        pool.execute(new MyRunnalble()); //将任务给到线程池去处理，加入队列
        pool.execute(new MyRunnalble()); //将任务给到线程池去处理，核心线程没有空闲，队列也满了，会使用临时线程
        pool.execute(new MyRunnalble()); //将任务给到线程池去处理，核心线程没有空闲，队列也满了，会使用临时线程
        pool.execute(new MyRunnalble()); //会执行拒绝策略









    }
}

class MyRunnalble implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println(Thread.currentThread().getName()+"===>"+i);
            //try {
            //    //目的让核心线程不能空闲
            //    Thread.sleep(Integer.MAX_VALUE);
            //} catch (InterruptedException e) {
            //    e.printStackTrace();
            //}
        }
    }
}
