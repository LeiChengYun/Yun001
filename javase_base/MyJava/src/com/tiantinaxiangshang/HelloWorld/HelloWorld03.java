package com.tiantinaxiangshang.HelloWorld;

/**
 * @Description HelloWorld03
 * @Author ChengYun
 * @Date 2025-03-14  20:37
 */
public class HelloWorld03 {

    public static void main(String[] args) {
        // 需要使用浮点数进行运算
        float y; // 声明 y 变量
        // y轴控制的是图像的长度，因为图像打印是由上往下打印，根据图像y从正数开始
        for (y = 1.3f; y > -1.1f; y -= 0.15f) { // 修复 for 循环语法
            float x; // 声明 x 变量
            // x轴控制的是图像的宽度，自左向右打印，根据图像x从负数开始
            for (x = -1.2f; x <= 1.2f; x += 0.05f) {
                // 使用中间变量代替较长的运算
                float temp = x * x + y * y - 1;
                // pow方法作用是获取x的n次方，第一个参数为x，第二个参数为n
                if ((Math.pow(temp, 3) - (x * x * Math.pow(y, 3))) <= 0.0f) {
                    // 由于unicode码不好进行对齐，所以这里使用 * 号代替
                    System.out.print("*");
                } else {
                    // 输出空格
                    System.out.print(" ");
                }
            }
            // 换行
            System.out.println();
        }
    }
}
