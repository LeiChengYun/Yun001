package com.Day03._01File_IO;

import java.io.File;

/**
 * @Description Demo_06
 * @Author ChengYun
 * @Date 2025-03-31  11:35
 */
public class Demo_06 {
    public static void main(String[] args) {
    searchFile(new File("D:\\Test"),"leilei.txt");

    }

    public static void searchFile(File path, String fileName) {

        //1.判断目录有效性，无效直接结束
        //分析 对象为空，目录不存在，是文件都不用进行到目录中搜索文件
        //这个思想：拦截思想，来自阿里巴巴规范卫语句规范
        if (path == null || fileName == null || !path.exists() || path.isFile()){
            return;
        }

            // 获取指定目录下的所有文件列表
            File[] files = path.listFiles();
            if (files == null || files.length == 0) return;

            //System.out.println(files);
            for (File file : files) {
                if(file.isFile()){
                    //判断是否是文件，是的只直接匹配包含leilei.txt
                    if (file.getName().equals(fileName)) {
                        //打印文件的绝对路径
                        System.out.println(file.getAbsolutePath());
                        return;
                    }
                }else{
                    //是文件夹，又要进入这个文件夹里面查找包含leilei.txt
                    //递归函数
                    searchFile(file,fileName);
                }
            }


    }
}
