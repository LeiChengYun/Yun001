package com.itheima.demo4fileinputStream;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyDemo5 {
    public static void main(String[] args) throws Exception {
        // 目标：完成文件复制。
        // 源文件：E:\resource\liuyan.jpg
        // 1、创建文件字节输入流管道与源文件接通
        InputStream is = new FileInputStream("E:/resource/liuyan.jpg");
        // 2、创建文件字节输出流管道与目标文件接通
        OutputStream os = new FileOutputStream("E:/resource/liuyan-new.jpg");
        // 3、创建一个字节数组。
        byte[] buffer = new byte[1024]; // 1KB
        // 4、定义一个变量记录每次读取了多少个字节
        int len;
        while ((len = is.read(buffer)) != -1) {
            os.write(buffer, 0, len);
        }
        System.out.println("复制完毕！");

        // 5、释放资源
        os.close();
        is.close();
    }
}
