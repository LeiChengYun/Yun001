package com.Day03._07IO字符输入转换流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

/**
 * @Description Demo_01
 * @Author ChengYun
 * @Date 2025-04-02  10:24
 */
public class Demo_01 {
    public static void main(String[] args) {
        try(
                Reader reader = new FileReader("JavaSE_Advance\\bbc.txt");

                BufferedReader br = new BufferedReader(reader);

                ){
            char[] chs = new char[1024];
            int len ;
            while((len = br.read(chs)) != -1){
                System.out.println(new String(chs,0,len));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
