package com.itheima.demo07inputstreamreader;

import java.io.*;

public class Demo2 {
    public static void main(String[] args) {
        // 目标：使用字符输入转换流InputStreamReader解决不同编码读取乱码的问题、
        // 代码：UTF-8   文件 UTF-8  读取不乱码
        // 代码：UTF-8   文件 GBK  读取乱码
        try (
                // 1、提取文件的原始字节输入流。
                InputStream is = new FileInputStream("day03-file-io\\src\\dlei07.txt");
                // 2、把原始的字节输入流转换成字符输入流：指定其字符集
                Reader isr = new InputStreamReader(is, "GBK");
                // 把低级的字符输入流包装成高级的缓冲字符输入流
                BufferedReader br = new BufferedReader(isr);
        ) {
            // 4、按照行读取
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
