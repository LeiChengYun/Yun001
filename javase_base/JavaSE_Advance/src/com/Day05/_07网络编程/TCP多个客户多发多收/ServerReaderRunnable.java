package com.Day05._07网络编程.TCP多个客户多发多收;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * @Description ServerReaderRunnable
 * @Author ChengYun
 * @Date 2025-04-05  9:48
 */
public class ServerReaderRunnable implements Runnable{
    private Socket socket;//接收到的客户端通信对象

    public ServerReaderRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //3.读取客户端原始字节输入流
            InputStream inputStream = socket.getInputStream();

            //4.将字节输入流转换为特殊数据输入流
            DataInputStream in = new DataInputStream(inputStream);

            //5.读取数据
            while(true){
                String content = in.readUTF();//这里会阻塞等待传递过来的数据
                System.out.println("接收客户端" + socket.getInetAddress().getHostAddress() + ":" + socket.getPort()+"的数据：:"+content);
            }
        } catch (IOException e) {
            System.out.println("客户端" + socket.getInetAddress().getHostAddress() + ":" + socket.getPort()+"，下线了");
        }
    }
}
