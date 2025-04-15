package com.数组;

/**
 * @Description array02
 * @Author ChengYun
 * @Date 2025-03-16  9:23
 */
public class array02 {
    public static void main(String[] args) {
        //随机生成[3,9)的整数随机数
        System.out.println(sjs(3,9));
        //生成【1-10】的整数随机数
        System.out.println((int)(Math.random()*10)+1);

    }

    public static int sjs(int min,int max){
        return (int) (Math.random() * (max -min) + min);
    }
}
