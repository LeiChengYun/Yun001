package com.Day03._06IO缓冲流;

import java.io.*;

/**
 * @Description Demo_02
 * @Author ChengYun
 * @Date 2025-03-31  21:01
 */
public class Demo_02 {
    public static void main(String[] args) {
        try(
                // 1.获取文件的字符输入流对象
                Reader in = new FileReader("JavaSE_Advance\\123.txt");
                //缓冲字符输入流
                BufferedReader bufferedReader = new BufferedReader(in);

                //2.获取文件的字节输出流对象
                Writer out = new FileWriter("JavaSE_Advance\\abc.txt");
                //缓冲输出流
                BufferedWriter bufferedWriter = new BufferedWriter(out);


                ) {


            //int len = 0;
            //while((len = bufferedReader.read()) != -1){
            //    bufferedWriter.write(len);
            //}
            //System.out.println("复制完成");



            //按行读
            String content =  null;
            //bufferedReader.readLine() 只是读取每一行的数据（不包含换行）
            while ((content = bufferedReader.readLine()) != null) {
                bufferedWriter.write(content);//只是输出数据
                //换行
                bufferedWriter.newLine();
                /*在代码中，bufferedReader.readLine() 方法读取的是每一行的内容，但不包含换行符。
                 如果直接将读取的内容写入到输出文件中而不添加换行符，最终生成的文件会将所有内容连在一起，没有分行显示。
                通过调用 bufferedWriter.newLine();，可以在每行内容后正确地添加换行符，从而保证输出文件的格式与输入文件一致。*/
            }
            System.out.println("复制完成");



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
