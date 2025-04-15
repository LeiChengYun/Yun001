package com.itheima.demo7executorService;

import java.util.concurrent.*;

public class ExecutorServiceDemo1 {
    public static void main(String[] args) {
        // 目标：创建线程池对象来使用。
        // 1、使用线程池的实现类ThreadPoolExecutor声明七个参数来创建线程池对象。
        /**
         * 参数一：核心线程数量
         * 参数二：最大线程数量
         * 参数三：临时线程的空闲时间上限
         * 参数四：时间单位
         */
        ExecutorService pool = new ThreadPoolExecutor(3,5,10, TimeUnit.SECONDS,
               new ArrayBlockingQueue<>(3), Executors.defaultThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());

        // 2、使用线程池处理任务！看会不会复用线程？
        Runnable target = new MyRunnable();
        pool.execute(target);  // 把任务交给线程池去执行。
        pool.execute(target);  // 把任务交给线程池去执行。
        pool.execute(target);  // 把任务交给线程池去执行。

        pool.execute(target);  // 把任务交给线程池去执行。
        pool.execute(target);  // 把任务交给线程池去执行。
        pool.execute(target);  // 把任务交给线程池去执行。

        pool.execute(target);  // 把任务交给线程池去执行。
        pool.execute(target);  // 把任务交给线程池去执行。

        pool.execute(target);  // 触发任务拒绝策略！。

        // 临时线程的出现时机？？ 核心线程在忙，任务队列满了，新线程过来才会开临时线程。

//        pool.shutdown(); // 等任务都执行完，再关闭线程池。
//        pool.shutdownNow(); // 立即关闭线程池，不再接受新任务，并且打断正在执行的任务。
    }
}













