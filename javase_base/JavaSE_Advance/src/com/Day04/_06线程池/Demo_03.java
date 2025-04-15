package com.Day04._06线程池;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Description Demo_03
 * @Author ChengYun
 * @Date 2025-04-03  15:17
 */
//Executors工具类创建
public class Demo_03 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //目标：使用ExecutorService接口实现类ThreadPoolExecutor创建线程池。

        //1.创建线程池
        ExecutorService pool = Executors.newFixedThreadPool(3);

        //2.从线程池里面获取线程做任务
        long start = System.currentTimeMillis();
        Future<Integer> f1 = pool.submit(new MyCallable(0, 500));
        Future<Integer> f2 = pool.submit(new MyCallable(501, 1000));
        Future<Integer> f3 = pool.submit(new MyCallable(1001, 1500));
        Integer r1 = f1.get();
        Integer r2 = f2.get();
        Integer r3 = f3.get();
        long end = System.currentTimeMillis();
        System.out.println("计算结果："+(r1+r2+r3)+",共耗时："+(end-start)+"毫秒");
    }
}
