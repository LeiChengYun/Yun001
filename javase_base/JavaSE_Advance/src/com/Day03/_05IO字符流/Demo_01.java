package com.Day03._05IO字符流;

import java.io.*;



/**
 * @Description Demo_01
 * @Author ChengYun
 * @Date 2025-03-31  20:02
 */
//目标：使用字符输入流读取文本文件
public class Demo_01 {
    public static void main(String[] args) {
        try
            (
                    Reader in = new FileReader(new File("JavaSE_Advance\\abc.txt"))
            ) {

            //int c = in.read();
            //System.out.println((char) c);//单个字符用char
            //int b = in.read();
            //System.out.println((char) b);





            char[] chars = new char[15];
            int len ;//义读取字符数组的长度，如果读取不到返回-1
            while((len = in.read(chars)) != -1){
                //将读取到的数据输出，注意读取多少长度，输出多少长度，否则会有残留数据输出
                //注意不要换行，因为文本文件里面有换,就是不要用println输出
                System.out.print(new String(chars,0,len));
            }

            } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
