package com.Day05._07网络编程.UDP实现多发多收;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


/**
 * @Description Server
 * @Author ChengYun
 * @Date 2025-04-03  16:51
 */
public class Server {
    public static void main(String[] args) throws Exception {
        //目标：创建服务器端接收数据

        //1.创建服务器端接收数据对象
        DatagramSocket socket = new DatagramSocket(9999);

        //2.创建数据包对象，用于封装接收到的数据
        byte[] bytes = new byte[1024*64];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);

        //3.阻塞等待接收数据
        System.out.println("开始准备接收客户端的数据：");
        while(true){
            socket.receive(datagramPacket);//阻塞等待接收数据，接收到的数据存储到bytes数组里面，有数据以后才往下走

            //4.解析数据包，获取数据，并打印出来
            int length = datagramPacket.getLength();//真正接收到数据的长度
            String data = new String(bytes, 0, length);
            System.out.println("服务器接收到数据：" + data);

            //5.获取客户端ip地址和端口（想知道是谁发过来的）
            InetAddress ipClient = datagramPacket.getAddress();//得到客户端ip地址对象
            String ip = ipClient.getHostAddress();//客户端ip地址
            int port = datagramPacket.getPort();//客户端端口号
            System.out.println("客户端："+ip+":"+port);
        }

        //6.释放资源
        //socket.close(); 不停接收不用关闭服务器端
    }

}
