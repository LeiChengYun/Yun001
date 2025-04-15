package com.Day03._03IO字节流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @Description Demo_02
 * @Author ChengYun
 * @Date 2025-03-31  16:34
 */
//IO字符输出流
public class Demo_02 {
    public static void main(String[] args) throws IOException {
        //1.获取文件的字节输出流对象
        //OutputStream out = new FileOutputStream("day03-io-file\\a4.txt");//覆盖方式
        OutputStream out = new FileOutputStream("JavaSE_Advance/abc.txt", true);

        //一个字节
        out.write('a');
        out.write('b');
        out.write(97);
        //字符串=》字节数组
        out.write("你好".getBytes());
        //字节数组
        byte[] bytes = {48,49,50};
        out.write(bytes);

        //写入换行
        out.write('\n');
        out.write('a');
        //写入换行，推荐使用，windows换行推荐使用\r\n,不同浏览器适配
        out.write("\r\n".getBytes());
        out.write("你好".getBytes());


        //释放资源
        out.close();






    }
}
