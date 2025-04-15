package com.Day05._07网络编程.UDP实现一发一收;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @Description Client
 * @Author ChengYun
 * @Date 2025-04-03  16:19
 */
public class Client {
    public static void main(String[] args) throws Exception {

        DatagramSocket socket = new DatagramSocket();

        byte[] bytes = "我是客户端".getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length,
                InetAddress.getLocalHost(),9999);

        socket.send(datagramPacket);
        System.out.println("客户端发送数据成功");

        socket.close();
    }
}
