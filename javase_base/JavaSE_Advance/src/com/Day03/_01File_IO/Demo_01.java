package com.Day03._01File_IO;

import java.io.File;
import java.io.IOException;

/**
 * @Description Demo_01
 * @Author ChengYun
 * @Date 2025-03-30  19:46
 */
public class Demo_01 {
    public static void main(String[] args) throws IOException {
        // 目标：创建File创建对象代表文件（文件/目录），搞清楚其提供的对文件进行操作的方法。
        // 1、创建File对象，去获取某个文件的信息(绝对路径)
        //绝对路径：D:\code\itheima200\javase-advance\day03-io-file\a.txt
        //在构造器中路径“\”需要写成“\\”，因为有特殊符号“\n”，所以需要转义。"\\n"代表路径，不代表换行
        //   如果是"/"不需要转义
        File file = new File("D:\\code\\itheima200\\javase-advance\\day03-io-file\\a.txt");
        System.out.println("文件大小："+file.length()+"字节");


        // 2、可以使用相对路径定位文件对象。
        //相对路径：要从项目根目录下的模块名写起(推荐方式)
        File file2 = new File("day03-io-file/a.txt");
        System.out.println("文件大小："+file2.length()+"字节");

        // 3、创建对象代表不存在的文件路径。
        File file3 = new File("day03-io-file/a2.txt");
        System.out.println("file2文件是否存在："+file2.exists());//true
        System.out.println("file3文件是否存在："+file3.exists());//false

        // 4、创建对象代表不存在的文件夹路径。
        File file4 = new File("day03-io-file2");
        System.out.println("文件夹是否存在："+file4.exists());//false

        // 5、创建File对象代表存在的文件，然后删除它
        File file5 = new File("day03-io-file/b.txt");
        file5.delete();

        // 6、创建File对象代表存在的文件夹，然后删除它(只能删除空文件夹，非空文件夹删除不了)
        File file6 = new File("d:");//这样写路径是错误的
        file6.delete();

        File file7 = new File("d:/");//这样写路径是对的
        file7.delete();

        File file8 = new File("d:/xxx");//这个xxx空目录是可以删除的
        file8.delete();

        // 7、创建文件
        File file9 = new File("day03-io-file/a2.txt");
        boolean isNewFile = file9.createNewFile();
        System.out.println("创建文件是否成功："+isNewFile);

        // 8、创建文件夹（目录）
        //   mkdir()创建一级目录
        File file10 = new File("day03-io-file/a");
        file10.mkdir();
        //   mkdirs()创建多级目录
        File file11 = new File("day03-io-file/b/c/d");
        file11.mkdirs();

        // 9、可以获取某个目录下的全部一级文件名称 .list()
        File file12 = new File("day03-io-file/");
        String[] list = file12.list();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("--------------------");
        // 10、可以获取一级文件对象。(重点)
        File file13 = new File("day03-io-file/");
        File[] files = file13.listFiles();
        for (File s : files) {
            System.out.println(s.getName());
        }
        // 11、判断File对象是文件isFile()还是文件夹isDirectory()。
        File file14 = new File("day03-io-file/");
        System.out.println(file14.isDirectory());//true
        System.out.println(file14.isFile());//false

    }

}
