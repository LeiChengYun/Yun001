package com.Day05._07网络编程.TCP实现一发一收;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description Server
 * @Author ChengYun
 * @Date 2025-04-05  9:42
 */
public class Server {
    public static void main(String[] args) throws IOException {
        //目标：使用TCP协议创建服务器端ServerSocket对象接收数据
        //注意：在TCP协议通信中，一定要先运行服务器端，在运行客户端
        //1.创建网络通信服务器端SeverSocket对象，指定监听的端口
        ServerSocket serverSocket = new ServerSocket(9090);

        //2.接收客户端请求得到客户端Socket
        System.out.println("开始接收数据；");
        Socket socket = serverSocket.accept();//会阻塞等待客户端连接
        //打印客户端谁连接进来
        System.out.println("客户端：" + socket.getInetAddress().getHostAddress() + ":" + socket.getPort()+"，连接进来");

        //3.读取客户端原始字节输入流
        InputStream inputStream = socket.getInputStream();

        //4.将字节输入流转换为特殊数据输入流
        DataInputStream in = new DataInputStream(inputStream);

        //5.读取数据
        int number = in.readInt();//这里会阻塞等待传递过来的数据
        String content = in.readUTF();//这里会阻塞等待传递过来的数据
        System.out.println("接收到的数据："+number+":"+content);

        //6.释放资源
        in.close();
        serverSocket.close();

    }
}
