package com.itheima.demo2recursion;

import java.io.File;
import java.io.IOException;

public class FileSearchTest4 {
    public static boolean flag = false;
    public static void main(String[] args) {
        // 目标：完成文件搜索。找出D:盘下的QQ.exe的位置。
        try {
            searchFile(new File("D:/"), "QQ3323.exe");

            if(!flag){
                System.out.println("没有找到！");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 递归搜索文件
     * @param dir 文件夹
     * @param fileName 文件名
     */
    public static void searchFile(File dir, String fileName) throws Exception {
        // 1、做极端判断：
        if(dir == null || fileName == null || !dir.exists() || dir.isFile()){
            return; // 不搜索，打回去
        }

        // 2、提取当前目录下的全部一级文件对象。
        File[] files = dir.listFiles();

        // 3、判断当前是否获取到了一级文件对象。
        if(files == null || files.length == 0) {
            return;
        }

        // 4、开始遍历全部一级文件对象，一个一个看是否是自己想要的。
        for (File file : files) {
            // 5、判断当前遍历到的文件对象是文件还是文件夹
            if(file.isFile()) {
                // 说明当前遍历的是文件，是文件，需要看是否是自己正在找的文件
                if(file.getName().contains(fileName)){
                    System.out.println("找到了：" + file.getAbsolutePath());
                    flag = true;
                    // 找到这个文件后，直接用虚拟机启动它
                    Runtime r = Runtime.getRuntime();
                    r.exec(file.getAbsolutePath());
                }
            }else {
                // 说明当前遍历的是文件夹，需要继续递归搜索。
                searchFile(file, fileName);
            }
        }
    }
}
