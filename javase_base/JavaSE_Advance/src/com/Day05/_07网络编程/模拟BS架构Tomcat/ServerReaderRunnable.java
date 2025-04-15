package com.Day05._07网络编程.模拟BS架构Tomcat;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @Description ServerReaderRunnable
 * @Author ChengYun
 * @Date 2025-04-05  9:54
 */
public class ServerReaderRunnable implements Runnable{
    private Socket socket;//接收到的客户端通信对象

    public ServerReaderRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //获取数据数据给浏览器的输出字节流
            OutputStream outputStream = socket.getOutputStream();

            //将字节流包装成打印流 PrintWriter
            PrintWriter ps = new PrintWriter(outputStream);

            //打印输出（按照http协议响应数据格式打印）
            ps.println("HTTP/1.1 200 OK"); //响应行
            //响应头
            ps.println("Content-Type:text/html;charset=utf-8");
            ps.println(); // 必须空一行。
            //响应体：输出正文，给网页展现的数据
            ps.println("<span style='color:red;font-size:120px;'>黑马程序员</span>");
            ps.close();
            socket.close();
        } catch (Exception e) {
            System.out.println("客户端" + socket.getInetAddress().getHostAddress() + ":" + socket.getPort()+"，下线了");
        }
    }

}
