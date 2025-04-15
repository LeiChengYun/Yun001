package com.itheima.demo4fileinputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        // 目标：掌握文件字节输入流读取文件中的字节到内存中来。
        // 1、创建一个文件字节输入流管道与源文件接通。
        InputStream is = new FileInputStream("day03-file-io\\src\\dlei04.txt");

        // 2、读取文件中的一个字节: public int read(): 返回一个字节，如果返回-1，则表示文件已经读完。
//        int b1 = is.read();
//        System.out.println((char) b1); // a

//        int b2 = is.read();
//        System.out.println((char) b2);

//        int b3 = is.read();
//        System.out.println(b3); // -1 代表读取完了！

        // 3、使用循环读取
        int b; // 记住每次读取的字节编号。
        while ((b = is.read()) != -1) {
            System.out.print((char) b);
        }

        // 拓展：
        // 每次读取一个字符，性能很差。无法避免读取汉字乱码的问题。
        // 禁止使用！

        // 关闭资源: 释放系统的资源。
        is.close();
    }
}
