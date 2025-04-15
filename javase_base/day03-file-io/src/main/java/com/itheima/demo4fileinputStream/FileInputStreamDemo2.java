package com.itheima.demo4fileinputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws Exception {
        // 目标：掌握文件字节输入流读取文件中的字节数组到内存中来。
        // 1、创建文件字节输入流管道于源文件接通
        InputStream is = new FileInputStream("day03-file-io\\src\\dlei04.txt");

        // 2、开始读取文件中的字节并输出： 每次读取多个字节
        byte[] buffer = new byte[3]; // 每次读取3个字节。
        int len; // 记住每次读取了多少个字节。
        while ((len = is.read(buffer)) != -1){
            // 3、读取多少就倒出多少
            String rs = new String(buffer, 0, len);
            System.out.print(rs);
        }

        // 4、释放资源
        is.close();

        // 拓展：性能得到提升，但是依然无法避免读取汉字输出乱码的问题。
    }
}
