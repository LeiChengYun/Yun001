package com.Day03._06IO缓冲流;

import java.io.*;

/**
 * @Description Demo_01
 * @Author ChengYun
 * @Date 2025-03-31  20:43
 */
//字节输出缓冲流
public class Demo_01 {
    public static void main(String[] args) {
        try (   //取文件的字节输入流对象
                InputStream in = new FileInputStream("JavaSE_Advance\\abc.txt");
                //缓冲输出流
                BufferedInputStream bufferedInputStream = new BufferedInputStream(in);
                //取文件的字节输入流对象
                OutputStream out = new FileOutputStream("JavaSE_Advance\\123.txt");
                //缓冲输出流
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(out);





                ){

            byte[] bytes = new byte[20];
            int len = 0;
            while((len = bufferedInputStream.read(bytes)) != -1){
                bufferedOutputStream.write(bytes,0,len);
            }
            System.out.println("复制完成");



        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
