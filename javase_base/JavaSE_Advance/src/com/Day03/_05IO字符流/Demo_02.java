package com.Day03._05IO字符流;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @Description Demo_02
 * @Author ChengYun
 * @Date 2025-03-31  20:27
 */
//目标：使用字符输出流输出文本数据
public class Demo_02 {
    public static void main(String[] args) {
        try
            (
                    Writer out = new FileWriter("JavaSE_Advance\\123.txt",true);
                    //public FileWriter(String filepath，boolean append)
                    //创建字节输出流管道与源文件路径接通，可追加数据
                    //如果原文件有内容，就会被覆盖



            ) {
            out.write(97);//a
            out.write(98);//b
            out.write("美丽新世界",0,3);

            out.write(new char[]{'a','b','c','雷',98});

            out.write(new char[]{'a','b','c','雷',98},0,3);

            out.flush();//新流，确保数据写入到文件（输出流可能有部分数据缓存没有写入文件，这样研据也写入文件)

            //注意：cLose方法会先调用fLush刷新方法，再进行关闭,关闭流的操作，包含了刷新！



            } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
