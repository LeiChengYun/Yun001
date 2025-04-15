package com.Day05._07网络编程.TCP一个客户多发多收;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Description Client
 * @Author ChengYun
 * @Date 2025-04-05  9:46
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //目标：使用tcp协议Socket发送数据，1个用户多发多收

        //1.创建客户端发送对象
        Socket socket = new Socket("localhost", 9090);

        //2.获取发送数据的字节输出流
        OutputStream outputStream = socket.getOutputStream();

        //3.将字节输出流包装成特殊数据流
        DataOutputStream out = new DataOutputStream(outputStream);

        //4.写出数据给服务器端
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入您发送的消息：");
            String msg = sc.nextLine();
            if(msg.equals("exit")){
                System.out.println("退出程序");
                //5.释放资源
                out.close();//高级流调用关闭，里面会自动调用低级流的关闭
                socket.close();
            }
            out.writeUTF(msg);
            System.out.println("数据["+msg+"]发送成功");
        }
    }
}
