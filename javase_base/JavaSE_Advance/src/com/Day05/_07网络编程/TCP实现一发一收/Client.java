package com.Day05._07网络编程.TCP实现一发一收;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Description Client
 * @Author ChengYun
 * @Date 2025-04-05  9:43
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //目标：使用tcp协议Socket发送数据，1发1收

        //1.创建客户端发送对象
        Socket socket = new Socket("localhost", 9090);

        //2.获取发送数据的字节输出流
        OutputStream outputStream = socket.getOutputStream();

        //3.将字节输出流包装成特殊数据流
        DataOutputStream out = new DataOutputStream(outputStream);

        //4.写出数据给服务器端
        out.writeInt(100);
        out.writeUTF("黑马程序员");
        System.out.println("数据发送成功");

        //5.释放资源
        out.close();//高级流调用关闭，里面会自动调用低级流的关闭
        socket.close();

    }
}
