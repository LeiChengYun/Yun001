package com.Day03._01File_IO;

/**
 * @Description Demo_04
 * @Author ChengYun
 * @Date 2025-03-31  10:10
 */
//阶乘
public class Demo_04 {
    public static void main(String[] args) {

        System.out.println(f(5));
    }

    public static int f(int a){
        if(a==1){
            return 1;
        }else {
            return a* f(a-1);
        }
    }
}
