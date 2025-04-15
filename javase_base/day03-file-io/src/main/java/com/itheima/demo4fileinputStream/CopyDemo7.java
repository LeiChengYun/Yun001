package com.itheima.demo4fileinputStream;


import java.io.*;

public class CopyDemo7 {
    public static void main(String[] args) {
        // 目标：资源释放
        try (
                // 注意：这里只能放置资源对象。这些资源用完毕后会被自动调用close关闭资源。
                // 1、创建文件字节输入流管道与源文件接通
                InputStream is = new FileInputStream("E:/resource/liuyan.jpg");
                // 2、创建文件字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream("E:/resource/liuyan-new.jpg");

                MyConnection mc = new MyConnection();
        ) {
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
        }
    }
}

class MyConnection implements Closeable{
    @Override
    public void close() throws IOException {
        System.out.println("有人调用我的close方法关闭我~~~");
    }
}
