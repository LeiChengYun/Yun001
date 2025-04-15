package com.itheima.demo08rintstream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataStreamDemo2 {
    public static void main(String[] args) {
        // 目标：特殊数据流的使用。
        try (
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("day03-file-io/src/data.txt"));
                ){
            dos.writeInt(100);
            dos.writeDouble(66.6);
            dos.writeBoolean(true);
            dos.writeChar('a');
            dos.writeUTF("我爱中国");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
