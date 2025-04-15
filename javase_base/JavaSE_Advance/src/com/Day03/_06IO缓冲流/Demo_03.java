package com.Day03._06IO缓冲流;

import java.io.*;

/**
 * @Description Demo081
 * @Author songyu
 * @Date 2025-04-02  9:36
 */
// 缓冲流，低级流的性能分析。
public class Demo_03 {

    private static final String SRC_FILE = "F:\\chuanzhiboke\\itheima\\200就业班课程\\02-JavaSE基础加强6天课程\\day03-FIle、字符集、IO流\\视频\\02-复习1.wmv";

    private static final String DEST_FILE = "D:\\";
    public static void main(String[] args) {
        // 目标：缓冲流，低级流的性能分析。
       // copy01(); // 低级的字节流一个一个字节复制：慢的简直无法忍受，直接淘汰，禁止使用！！
       //  copy02(); // 使用低级的字节流按照字节数组的形式复制文件:  相对较慢！可以接受
       //  copy03();  // 使用高级的缓冲字节流按照一个一个字节的形式复制文件：超级慢，直接淘汰
        copy04(); // 使用高级的缓冲字节流按照一个一个字节数组的形式复制文件：极快，推荐使用。
    }

    // 使用低级的字节流按照一个一个字节的形式复制文件。
    public static void copy01(){
        long start = System.currentTimeMillis(); // 开始时间：返回的是 1970-1-1 0:0:0 走到此刻的总毫秒值。 1s = 1000ms
        try (
                // 1、创建字节输入流管道与源文件接通
                InputStream is = new FileInputStream(SRC_FILE);
                // 2、创建字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream(DEST_FILE + "1.wmv");
        ){
            // 3、开始一个一个字节的转移数据
            int b;
            while ((b = is.read()) != -1){
                os.write(b);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("低级的字节流按照一个一个字节的形式复制文件耗时：" + (end - start) / 1000.0 + "s");
    }

    // 使用低级的字节流按照字节数组的形式复制文件。
    public static void copy02(){
        long start = System.currentTimeMillis(); // 开始时间：返回的是 1970-1-1 0:0:0 走到此刻的总毫秒值。 1s = 1000ms
        try (
                // 1、创建字节输入流管道与源文件接通
                InputStream is = new FileInputStream(SRC_FILE);
                // 2、创建字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream(DEST_FILE + "2.wmv");
        ){
            // 3、开始一个一个字节数组的转移数据
            byte[] buffer = new byte[1024*8];
            int len;
            while ((len = is.read(buffer)) != -1){
                os.write(buffer, 0, len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("低级的字节流按照一个一个字节数组的形式复制文件耗时：" + (end - start) / 1000.0 + "s");
    }

    //使用高级的缓冲字节流按照一个一个字节的形式复制文件。
    public static void copy03(){
        long start = System.currentTimeMillis(); // 开始时间：返回的是 1970-1-1 0:0:0 走到此刻的总毫秒值。 1s = 1000ms
        try (
                // 1、创建字节输入流管道与源文件接通
                InputStream is = new FileInputStream(SRC_FILE);
                BufferedInputStream bis = new BufferedInputStream(is);
                // 2、创建字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream(DEST_FILE + "3.wmv");
                BufferedOutputStream bos = new BufferedOutputStream(os);
        ){
            // 3、开始一个一个字节的转移数据
            int b;
            while ((b = bis.read()) != -1){
                bos.write(b);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("高级的缓冲字节流按照一个一个字节的形式复制文件耗时：" + (end - start) / 1000.0 + "s");
    }

    //使用高级的缓冲字节流按照字节数组的形式复制文件。
    public static void copy04(){
        long start = System.currentTimeMillis(); // 开始时间：返回的是 1970-1-1 0:0:0 走到此刻的总毫秒值。 1s = 1000ms
        try (
                // 1、创建字节输入流管道与源文件接通
                InputStream is = new FileInputStream(SRC_FILE);
                BufferedInputStream bis = new BufferedInputStream(is);
                // 2、创建字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream(DEST_FILE + "4.wmv");
                BufferedOutputStream bos = new BufferedOutputStream(os);
        ){
            // 3、开始一个一个字节数组的转移数据
            byte[] buffer = new byte[1024 * 256];
            int len;
            while ((len = bis.read(buffer)) != -1){
                bos.write(buffer, 0, len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("高级的的缓冲字节流按照一个一个字节数组的形式复制文件耗时：" + (end - start) / 1000.0 + "s");
    }
}
