package com.itheima.demo08rintstream;

import java.io.PrintStream;

public class PrintStreamDemo1 {
    public static void main(String[] args) {
        // 目标：打印流的使用。
       try (
               PrintStream ps = new PrintStream("day03-file-io\\src\\dlei08-out.txt");
//               PrintWriter ps = new PrintWriter("day03-file-io\\src\\dlei08-out.txt");
               ){
           ps.println("hello world");
           ps.println(97);
           ps.println('a');
           ps.println(true);
           ps.println(66.8);

       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
