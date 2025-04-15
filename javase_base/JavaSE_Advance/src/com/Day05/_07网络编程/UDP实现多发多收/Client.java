package com.Day05._07网络编程.UDP实现多发多收;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * @Description Client
 * @Author ChengYun
 * @Date 2025-04-03  16:51
 */
public class Client {

    public static void main(String[] args) throws Exception {
        //目标：UDP实现多发多收

        DatagramSocket socket = new DatagramSocket();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请输入要发送的内容：");
            String line = scanner.nextLine();
            if (line.equals("exit")) {
                System.out.println("程序退出");
                socket.close();
                break;
            }


            byte[] bytes = line.getBytes();
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length,
                    InetAddress.getLocalHost(), 9999);

            socket.send(datagramPacket);

            System.out.println("客户端发送数据成功:" + line);


        }
    }
}