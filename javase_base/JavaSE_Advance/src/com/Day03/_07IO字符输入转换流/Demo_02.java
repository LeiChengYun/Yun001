package com.Day03._07IO字符输入转换流;

import java.io.*;

/**
 * @Description Demo_02
 * @Author ChengYun
 * @Date 2025-04-02  10:58
 */
public class Demo_02 {
    public static void main(String[] args) {
        //目标：使用字符输入转换流指定码表读取文件
        //当前文件 Demo091.java（utf-8）使用的 指明以GBK码表读取at.txt（GBK）文件不会乱码
        try(
                //1.定义字节输入流（原始流，里面的字节没有被破坏）
                InputStream inputStream = new FileInputStream("JavaSE_Advance\\bbc.txt");

                //2.定义字符输入转换流
                Reader r = new InputStreamReader(inputStream, "GBK");

                //3.缓冲流提供性能
                BufferedReader br = new BufferedReader(r);
        ){

            char[] chs = new char[1024];
            int len = -1;
            while((len = br.read(chs)) != -1){
                System.out.println(new String(chs,0,len));
            }

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
