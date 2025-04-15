package com.Day03._08IO打印流;

import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * @Description Demo_01
 * @Author ChengYun
 * @Date 2025-04-02  11:05
 */
public class Demo_01 {
    public static void main(String[] args) {
        try(
                //打印字节流PrintStream输出数据
                PrintStream ps = new PrintStream("JavaSE_Advance\\asd.txt");
                ) {
            ps.println(98);
            ps.println(true);
            ps.println(66.67);
            ps.println('a');

        }catch (Exception e){
            e.printStackTrace();
        }













        //目标：使用打印字符流PrintWriter输出数据(tomcat（web）服务器响应数据就是使用这个输出流)
        //作用：更加高效，更加方便，打印啥就输出啥
        //try(
        //        PrintWriter pw = new PrintWriter("JavaSE_Advance\\bbc.txt");
        //        ){
        //    pw.println("你好");
        //    pw.println("世界");
        //    pw.println("java");
        //}catch (Exception e){
        //    e.printStackTrace();
        //}
    }
}
