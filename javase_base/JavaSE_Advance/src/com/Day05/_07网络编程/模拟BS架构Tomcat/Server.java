package com.Day05._07网络编程.模拟BS架构Tomcat;

import com.Day05._07网络编程.TCP多个客户多发多收.ServerReaderRunnable;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

/**
 * @Description Server
 * @Author ChengYun
 * @Date 2025-04-05  9:53
 */
public class Server {
    public static void main(String[] args) throws Exception {
        //1.创建线程池
        ExecutorService pool = new ThreadPoolExecutor(
                100,// 参数1：核心线程数，相当于正式工，稳定常用的线程。核心线程创建后不会被销毁
                200,// 参数2：最大线程数，最大线索数-核心线程数=临时线程数，临时线程看成临时工，当不忙的时候会销毁临时线程
                //什么时候使用临时线程？答：核心线程没有空闲，工作队列也满了，才会使用临时线程
                10,// 参数3：临时线程存活时间，临时线程空闲了多少秒/毫秒就销毁
                TimeUnit.SECONDS,// 参数4：临时线程存活时间的单位
                new ArrayBlockingQueue<>(1000),//参数5：设置工作队列，核心线程忙不过来就会存入工作对象
                Executors.defaultThreadFactory(),//参数6：设置线程工厂，创建核心线程或临时线程
                new ThreadPoolExecutor.AbortPolicy()//参数7：设置拒绝策略，当临时线程也忙不过来，会拒绝任务抛出异常
        );

        //目标：使用TCP协议创建服务器端ServerSocket对象接收数据
        //1.创建网络通信服务器端SeverSocket对象，指定监听的端口
        ServerSocket serverSocket = new ServerSocket(80);

        //2.接收客户端请求得到客户端Socket
        System.out.println("开始接收数据；");
        while(true){
            Socket socket = serverSocket.accept();//会阻塞等待客户端连接
            System.out.println("有人上线了~~~");
            //交给线程池使用每个线程处理一个客户
            pool.execute(new ServerReaderRunnable(socket));
        }

    }
}
