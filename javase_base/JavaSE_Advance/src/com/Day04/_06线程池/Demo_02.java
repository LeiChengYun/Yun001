package com.Day04._06线程池;

import java.util.concurrent.*;

/**
 * @Description Demo_02
 * @Author ChengYun
 * @Date 2025-04-03  11:38
 */
//创建和执行Callable任务
public class Demo_02 {
    public static void main(String[] args) throws Exception {
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

        long start = System.currentTimeMillis();
        Future<Integer> future1 = pool.submit(new MyCallable(0,500));
        Future<Integer> future2 = pool.submit(new MyCallable(501,1000));
        Future<Integer> future3 = pool.submit(new MyCallable(1001,1500));

        Integer i1 = future1.get();
        Integer i2 = future2.get();
        Integer i3 = future3.get();

        long end = System.currentTimeMillis();

        System.out.println("计算结果："+(i1+i2+i3)+",共耗时："+(end-start)+"毫秒");

    }

}

//1.定义类实现Callable接口
class MyCallable implements Callable<Integer> {

    private Integer start;//累加开始数
    private Integer end;//累加结束数

    public MyCallable(Integer start, Integer end) {
        this.start = start;
        this.end = end;
    }

    //2.重写call方法执行任务代码
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (Integer i = start; i <= end; i++) {
            sum += i;
            System.out.println("第"+i+"次累加，结果："+sum);
            Thread.sleep(2);

        }
        return sum;
    }
}
