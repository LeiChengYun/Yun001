package com.itheima.demo4fileinputStream;

import java.io.*;

public class CopyDemo6 {
    public static void main(String[] args) {
        // 目标：资源释放
        InputStream is = null;
        OutputStream os = null;
        try {
            // 1、创建文件字节输入流管道与源文件接通
            is = new FileInputStream("E:/resource/liuyan.jpg");
            // 2、创建文件字节输出流管道与目标文件接通
            os = new FileOutputStream("E:/resource/liuyan-new.jpg");
            // 3、创建一个字节数组。
            byte[] buffer = new byte[1024]; // 1KB
            // 4、定义一个变量记录每次读取了多少个字节
            int len;
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
            System.out.println("复制完毕！");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("=======================finally===================");
            // 5、释放资源
            try {
                if (os != null) os.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (is != null) is.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
