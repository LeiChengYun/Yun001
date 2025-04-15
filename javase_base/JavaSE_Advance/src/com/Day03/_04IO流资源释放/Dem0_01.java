package com.Day03._04IO流资源释放;

import java.io.*;

/**
 * @Description Dem0_01
 * @Author ChengYun
 * @Date 2025-03-31  18:24
 */
public class Dem0_01 {
    public static void main(String[] args) {
        //目标：try-catch-finally释放资源
        InputStream in = null;
        OutputStream out = null;
        try {
            //1.获取文件的字节输入流对象
            in = new FileInputStream("D:\\imgs\\1.jpg");

            //2.获取文件的字节输出流对象
            out = new FileOutputStream("D:\\demo2\\2.jpg");

            //3.输入流读取数据输出给输出流
            byte[] bytes = new byte[1024];//1KB
            int len = 0;//定义读取字节长度
            while((len=in.read(bytes))!=-1){
                out.write(bytes,0,len);
            }

            System.out.println("复制完成");
            //int a = 1/0;
        } catch (IOException e) {
            e.printStackTrace();//给开发人员看
            System.out.println("文件复制失败，请重启电脑再试...");
        }finally{
            System.out.println("finally运行了");
            //finally无论try里面的代码是否出现异常，finally里面的代码都会运行
            try {
                if(in!=null) in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(out!=null)out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }




    }



}
