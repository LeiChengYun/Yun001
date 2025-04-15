package com.oop.oop05_Utils;

/**
 * @Description oop_Utils
 * @Author ChengYun
 * @Date 2025-03-18  15:57
 */
public class oop_Utils {
    //工具类，无产构造函数被私有了，无法创建对象；
   private oop_Utils(){

    }

    public static String getCode(int count){
        String code = "";
        for (int i = 0; i < count; i++) {
            int num = (int)(Math.random()*10);
            code += num;
        }
        return code;
    }
}
