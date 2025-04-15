package com.itheima.demo08rintstream;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataStreamDemo3 {
    public static void main(String[] args) {
        // 目标：特殊数据流的使用。
        try (
                DataInputStream dis = new DataInputStream(new FileInputStream("day03-file-io/src/data.txt"));
                ){
            // 读取特殊数据
            int num = dis.readInt();
            double db = dis.readDouble();
            boolean b = dis.readBoolean();
            char c = dis.readChar();
            String str = dis.readUTF();

            System.out.println(num);
            System.out.println(db);
            System.out.println(b);
            System.out.println(c);
            System.out.println(str);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
