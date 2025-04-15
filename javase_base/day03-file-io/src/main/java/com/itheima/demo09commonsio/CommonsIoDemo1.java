package com.itheima.demo09commonsio;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class CommonsIoDemo1 {
    public static void main(String[] args) throws Exception {
        // 目标：IO框架
        FileUtils.copyFile(new File("day03-file-io\\src\\dlei06.txt"),
                new File("day03-file-io\\src\\new.txt"));
//
//        FileUtils.copyDirectory(new File("E:\\resource\\图片服务器"), new File("D:\\aaaddd"));

        // 删除非空文件夹
        FileUtils.deleteDirectory(new File("D:\\aaaddd"));

        //Java提供的
        Files.copy(Path.of("day03-file-io\\src\\dlei06.txt"), Path.of("day03-file-io\\src\\dlei06-new.txt"));
    }
}
