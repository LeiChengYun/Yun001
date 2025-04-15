package com.itheima.demo5fileReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderDemo1 {
    public static void main(String[] args) {
        // 目标：掌握文件字符输入流读取字符内容到程序中来。
        try (
                // 1、创建文件字符输入流管道与源文件接通
                Reader fr = new FileReader("day03-file-io\\src\\dlei06.txt")
        ) {
            // 2、准备一个字符数组来读取数据。
            char[] buffer = new char[3];
            int len; // 记住每次读取的字符个数。
            while ((len = fr.read(buffer)) != -1) {
                // 3、把字符数组转换成字符串：读取多少个字符就转换多少个字符。
                String rs = new String(buffer, 0, len);
                System.out.print(rs);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



