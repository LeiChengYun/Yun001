package com.itheima.demo3charset;

import java.util.Arrays;

public class CharSetDemo1 {
    public static void main(String[] args) throws Exception {
        // 目标：写程序实现字符编码和解码
        // 1、编码
        String name = "我爱你中国abc666";

        byte[] bytes = name.getBytes(); // 默认编码UTF-8
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        byte[] bytes1 = name.getBytes("GBK");
        System.out.println(bytes1.length);
        System.out.println(Arrays.toString(bytes1));

        // 2、解码
        String rs1 = new String(bytes); // 默认编码UTF-8
        System.out.println(rs1);

        String rs2 = new String(bytes1, "GBK");
        System.out.println(rs2);
    }
}
