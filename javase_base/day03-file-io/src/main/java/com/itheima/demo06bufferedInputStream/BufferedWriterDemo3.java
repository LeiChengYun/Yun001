package com.itheima.demo06bufferedInputStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class BufferedWriterDemo3 {
    public static void main(String[] args) {
        // 目标：缓冲字符输出流的使用
        try (
                // 1. 创建一个字符输出流对象，指定写出的目的地。
//                Writer fw = new FileWriter("day03-file-io/src/dlei06-out.txt");
                Writer fw = new FileWriter("day03-file-io/src/dlei06-out.txt", true);
                // 把原始的字符输出流包装成高级的缓冲字符输出流
                BufferedWriter bw = new BufferedWriter(fw);
        ) {

            // 2. 写一个字符出去：  public void write(int c)
            bw.write('a');
            bw.write(98);
            bw.write('徐');
            bw.newLine(); // 换行

            // 3、写一个字符串出去：  public void write(String str)
            bw.write("黑马程序员");
            bw.newLine(); // 换行

            // 4、写字符串的一部分出去：  public void write(String str, int off, int len)
            bw.write("黑马程序员",0, 2);
            bw.newLine(); // 换行

            // 5、写一个字符数组出去：  public void write(char[] cbuf)
            char[] buffer = {'a', 'b', 'c', 'd', 'e'};
            bw.write(buffer);
            bw.newLine(); // 换行

            // 6、写字符数组的一部分出去：  public void write(char[] cbuf, int off, int len)
            bw.write(buffer, 1, 3);
            bw.newLine(); // 换行

//             fw.flush(); // 刷新缓冲区，将缓冲区中的数据全部写出去。
//             fw.close(); // 关闭资源，关闭包含了刷新！关闭后流不能继续使用！

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
