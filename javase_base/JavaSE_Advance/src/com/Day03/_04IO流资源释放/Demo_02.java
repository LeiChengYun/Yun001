package com.Day03._04IO流资源释放;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @Description Demo_02
 * @Author ChengYun
 * @Date 2025-03-31  18:27
 */
public class Demo_02 {
    public static void main(String[] args) throws Exception {
        //目标：try-with-resources释放资源,从jdk7开始有的语法
        //原理：try和catch运行完会自动调用资源的close方法(AutoCloseable接口的方法，每个资源都实现了这个接口重写了close方法)
        //优点：代码优雅，释放资源失败会抛出异常

        try( InputStream in = new FileInputStream("D://2.jpg");
             OutputStream out = new FileOutputStream("D://红楼梦//123.jpg");

             //定义自己的资源，也会自动调用close方法
             MyResource mr = new MyResource();

                ){
            byte[] bytes = new byte[1024];//1kb
            int len = 0;
            while ((len = in.read(bytes)) != -1){
                out.write(bytes,0,len);
            }
            System.out.println("复制完成");

        }catch (Exception e){
            e.printStackTrace();//给开发人员看
            System.out.println("文件复制失败，请重启电脑再试...");
        }

    }
}

class MyResource implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("释放MyResource的资源");
    }
}
