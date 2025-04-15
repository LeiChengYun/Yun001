package com.Work.Day03;

import java.io.File;

/**
 * @Description Del_Document
 * @Author ChengYun
 * @Date 2025-04-01  14:44
 */
//需求：删除非空文件夹
//分析：
//①：File默认不可以删除非空文件夹
//②：我们需要遍历文件夹，先删除里面的内容，再删除自己。
public class Del_Document {
    private static boolean flag = false;

    public static void main(String[] args) {
        //目标：删除D:\test2 目录下或及其子目录下所有文件和文件夹
        deleteDir(new File("D:\\test2"));
        System.out.println("删除成功");
    }

    private static void deleteDir(File dir) {

        //1.判断目录有效性，无效直接结束
        if (dir == null || !dir.exists() || dir.isFile()) return;

        //2.获取当前目录的一级子文件或文件夹
        File[] files = dir.listFiles();
        if (files == null || files.length == 0) {
            System.out.print(dir.getAbsoluteFile() + ":");
            boolean delete = dir.delete();
            System.out.println(delete);
            return;
        }

        //3.遍历子文件或文件夹逐个删除
        for (File file : files) {
            //删除子文件
            if (file.isFile()) {
                System.out.print(file.getAbsoluteFile() + ":");
                boolean delete = file.delete();
                System.out.println(delete);
            } else {
                //递归删除目录里面的文件
                deleteDir(file);
            }
        }

        //4.子文件或子文件夹删除后，再删除当前目录
        System.out.print(dir.getAbsoluteFile() + ":");
        boolean delete = dir.delete();
        System.out.println(delete);


    }
}