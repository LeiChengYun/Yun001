package com.itheima.demo2reflect;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class JFrameUtil {
    public static void saveObject(Object obj) throws Exception {
        // obj 可能是猫对象，也可能是老师对象。
        PrintStream ps =
                new PrintStream(new FileOutputStream("day06-reflect-annotation-proxy2\\src\\data.txt", true));

        // 可以获取当前对象的Class对象
        Class c = obj.getClass();
        ps.println("=========================" + c.getSimpleName() + "==========================");
        // 提取这个类中的全部字段
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            // 取字段的名称。
            String name = field.getName();
            // 获取字段值。
            String value = field.get(obj) + "";
            // 写出去
            ps.println(name + "=" + value);
        }
        ps.close(); // 关闭流
    }
}
