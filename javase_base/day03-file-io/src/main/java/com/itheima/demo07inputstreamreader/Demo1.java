package com.itheima.demo07inputstreamreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Demo1 {
    public static void main(String[] args) {
        // 目标：演示一个问题：不同编码读取乱码的问题、
        // 代码：UTF-8   文件 UTF-8  读取不乱码
        // 代码：UTF-8   文件 GBK  读取乱码
        try (
                // 1、创建文件字符输入流管道与源文件接通
                Reader fr = new FileReader("day03-file-io\\src\\dlei07.txt");
                // 把低级的字符输入流包装成高级的缓冲字符输入流
                BufferedReader br = new BufferedReader(fr);
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
