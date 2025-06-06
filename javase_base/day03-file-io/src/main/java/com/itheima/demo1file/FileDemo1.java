package com.itheima.demo1file;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) throws Exception {
        // 目标：创建File创建对象代表文件（文件/目录），搞清楚其提供的对文件进行操作的方法。
        // 1、创建File对象，去获取某个文件的信息
//        File f1 = new File("E:/resource/dlei.jpg");
        File f1 = new File("E:\\resource\\dlei.jpg");
        System.out.println(f1.length());

        // 2、可以使用相对路径定位文件对象。
        // 相对路径：不带盘符，默认到当前工程目录下寻找！
        File f2 = new File("day03-file-io\\src\\dlei01.txt");
        System.out.println(f2.length()); // 4

        // 3、创建对象代表不存在的文件路径。
        File f3 = new File("E:\\resource\\dleidleidlei.txt");
        System.out.println(f3.exists()); // false

        // 4、创建对象代表不存在的文件夹路径。
        File f4 = new File("E:\\resource\\mimimeinv");
        System.out.println(f4.exists()); // false

        // 5、创建File对象代表存在的文件，然后删除它
        File f5 = new File("day03-file-io\\src\\aaa.txt");
        boolean b = f5.delete();
        System.out.println(b);

        // 6、创建File对象代表存在的文件夹，然后删除它(只能删除空文件夹，非空文件夹删除不了)
        File f6 = new File("E:\\resource\\eee777");
        boolean b1 = f6.delete();
        System.out.println(b1);

        // 创建文件
        File ff1 = new File("day03-file-io\\src\\dlei02.txt");
        System.out.println(ff1.createNewFile()); // true

        // 创建文件夹（目录）
        File ff2 = new File("day03-file-io\\src\\aaa\\bbb\\ccc");
        // System.out.println(ff2.mkdir()); // 只能创建一级文件夹，不能创建多级文件夹
        System.out.println(ff2.mkdirs()); // 可以创建多级文件夹

        // 8、可以获取某个目录下的全部一级文件名称
        File f7 = new File("D:\\广州校区\\JavaSE进阶");
        String[] names = f7.list();
        for (String name : names) {
            System.out.println(name);
        }

        // 9、可以获取一级文件对象。(重点)
        File[] files = f7.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath()); // 取绝对路径
        }

        // 10、判断File对象是文件还是文件夹。
        File f8 = new File("D:\\广州校区\\JavaSE进阶");
        System.out.println(f8.isFile()); // 是否是文件？ false
        System.out.println(f8.isDirectory()); // 是否是文件夹？ true
    }
}
