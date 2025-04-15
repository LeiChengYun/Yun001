package com.Day03._09IO特殊数据流;


import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @Description Demo_01
 * @Author ChengYun
 * @Date 2025-04-02  11:26
 */
public class Demo_01 {
    public static void main(String[] args) {
        try(
                //1.定义资源
                OutputStream out = new FileOutputStream("JavaSE_Advance\\bbc.txt");

                //2.特殊数据输出流
                DataOutputStream dataOutputStream = new DataOutputStream(out);
                ){

            dataOutputStream.writeInt(100);
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeDouble(66.6);
            dataOutputStream.writeUTF("黑马程序员");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}