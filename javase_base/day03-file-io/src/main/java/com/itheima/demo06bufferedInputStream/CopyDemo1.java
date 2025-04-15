package com.itheima.demo06bufferedInputStream;

import java.io.*;

public class CopyDemo1 {
    public static void main(String[] args) {
        // 目标：掌握缓冲字节流的使用。
        try (
                // 1、创建文件字节输入流管道与源文件接通
                InputStream is = new FileInputStream("E:/resource/dlei.jpg");
                // 把低级的字节输入流包装成高级的缓冲字节输入流
                BufferedInputStream bis = new BufferedInputStream(is);

                // 2、创建文件字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream("E:/resource/dlei-new.jpg");
                // 把低级的字节输出流包装成高级的缓冲字节输出流
                BufferedOutputStream bos = new BufferedOutputStream(os);
        ) {
            // 目标：完成文件复制。
            // 3、准备一个字节数组（桶）
            byte[] buffer = new byte[1024]; // 1KB
            // 4、定义一个变量记录每次读取了多少个字节
            int len;
            // 5、使用循环开始转移字节
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            System.out.println("复制完毕！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

