package com.Day03._03IO字节流;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @Description Demo_01
 * @Author ChengYun
 * @Date 2025-03-31  16:06
 */
//目标：使用字节流读取文本数据
public class Demo_01 {
    public static void main(String[] args) throws Exception {
        //1.获取文件的字节输入流对象
        InputStream in = new FileInputStream("JavaSE_Advance/abc.txt");

        //2.读取字节数据(一个一个字节读取)
        // int r = in.read();
        // System.out.println((char)r);//a
        //
        // r = in.read();
        // System.out.println((char)r);//b
        //
        // r = in.read();
        // System.out.println((char)r);//c

        // r = in.read();
        // System.out.println((char)r);//肯定不是“你”

        // byte[] bytes = new byte[3];
        //  r = in.read(bytes);//r是读取的字节数组里面存储数据的长度
        // System.out.println("字节数组读取数据的长度："+r);
        // System.out.println("读到的数据："+new String(bytes));

        byte[] bytes = new byte[3];
        int len = -1;//因为读取文件读不到数据就会返回读取长度为-1

        while((len=in.read(bytes))!=-1){
            //不能直接打印bytes，有可能bytes残留上一次读取的字节数据，所以本次读取多少长度就转换为字符串对应的长度
            //读取len长度，将从0位置开始+读取的字节长度转化为字符串输出
            System.out.print(new String(bytes,0,len));
        }
        //3.释放资源
        in.close();
    }
}
