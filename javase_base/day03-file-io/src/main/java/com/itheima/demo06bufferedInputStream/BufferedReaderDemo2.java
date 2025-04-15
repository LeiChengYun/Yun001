package com.itheima.demo06bufferedInputStream;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class BufferedReaderDemo2 {
    public static void main(String[] args) {
        // 目标：掌握缓冲字符输入流的使用。
        try (
                // 1、创建文件字符输入流管道与源文件接通
                Reader fr = new FileReader("day03-file-io\\src\\dlei06.txt");
                // 把低级的字符输入流包装成高级的缓冲字符输入流
                BufferedReader br = new BufferedReader(fr);
        ) {
            // 2、准备一个字符数组来读取数据。
//            char[] buffer = new char[1024];
//            int len; // 记住每次读取的字符个数。
//            while ((len = br.read(buffer)) != -1) {
//                // 3、把字符数组转换成字符串：读取多少个字符就转换多少个字符。
//                String rs = new String(buffer, 0, len);
//                System.out.print(rs);
//            }

          /*  System.out.println(br.readLine());
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            System.out.println(br.readLine());*/
            // 定义一个字符串变量记录每次读取的一行数据
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
