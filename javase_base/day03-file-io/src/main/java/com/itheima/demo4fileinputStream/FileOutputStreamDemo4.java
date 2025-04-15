package com.itheima.demo4fileinputStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStreamDemo4 {
    public static void main(String[] args) throws Exception {
        // 目标：学会使用文件字节输出流。
        // 1、创建文件字节输出流管道与目标文件接通
//        OutputStream fos = new FileOutputStream("day03-file-io\\src\\dlei05-out.txt"); // 覆盖管道
        OutputStream fos = new FileOutputStream("day03-file-io\\src\\dlei05-out.txt", true); // 追加管道

        // 2、写入数据
        //  public void write(int b) ： 每次只能写一个字节输出
        fos.write(97);
        fos.write(98);
        fos.write('a');
//        fos.write('徐'); // 写出去会出错的。。
        fos.write("\r\n".getBytes()); // 换行

        // 3、写一个字节数组出去
        // public void write(byte[] b)
        byte[] bytes = "我爱你中国abc".getBytes();
        fos.write(bytes);
        fos.write("\r\n".getBytes()); // 换行


        // 4、写一个字节数组的一部分出去
        // public void write(byte[] b, int pos, int len)
        fos.write(bytes, 0, 9);
        fos.write("\r\n".getBytes()); // 换行

        // 关闭资源。
        // 刷新数据出去，通知缓冲区的数据立即同步到文件中去。这样就不会丢失数据。刷新后流可以继续使用。
        // fos.flush();

        // 关闭包含了刷新，关闭后，流将不可使用！
        fos.close();

    }
}
