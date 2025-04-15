package com.Day03._03IO字节流;

import java.io.*;

/**
 * @Description Demo_03
 * @Author ChengYun
 * @Date 2025-03-31  17:09
 */
public class Demo_03 {
    public static void main(String[] args) throws Exception {
        InputStream in = new FileInputStream("D://2.jpg");
        OutputStream out = new FileOutputStream("D://红楼梦//123.jpg");

        byte[] bytes = new byte[1024];//1kb
        int len = 0;
        while ((len = in.read(bytes)) != -1){
            out.write(bytes,0,len);
        }

        /*为什么不直接写成 out.write(bytes)？
        这个方法会将整个字节数组 b 的内容写入输出流，而不管数组中是否所有元素都被有效填充。
        在本例中，bytes 数组的大小为 1024，但最后一次读取可能不足 1024 字节。
        如果直接使用 out.write(bytes)，可能会将未初始化的部分（即数组中剩余的垃圾值）写入输出流，导致文件内容错误。
        因此，必须明确指定写入的长度 len，以确保只写入实际有效的数据。*/


        //4.释放资源
        out.close();
        in.close();
        System.out.println("复制完成");

    }
}
