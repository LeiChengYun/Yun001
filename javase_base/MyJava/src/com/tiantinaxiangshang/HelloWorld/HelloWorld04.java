package com.tiantinaxiangshang.HelloWorld;

/**
 * @Description HelloWorld04
 * @Author ChengYun
 * @Date 2025-03-19  15:31
 */
public class HelloWorld04 {

    public static void main(String[] args) {
        // 根据图像要求，创建一个行长为12，列长为13的二维数组
        int[][] arr = new int[12][13];

        // 第一行像素点的赋值
        for (int i = 2, j = 10; i < 5; ++i, --j) {
            arr[0][i] = 1;
            arr[0][j] = 1;
        }

        // 第二行像素点的赋值
        int index = 1;
        arr[index][1] = 1;
        arr[index][5] = 1;
        arr[index][11] = 1;
        arr[index][7] = 1;

        // 中间独自一个的格子
        int n = arr[0].length;
        arr[index + 1][(n - 1) / 2] = 1;

        // 第二行到第五行像素点的赋值
        for (int i = 2; i < 6; ++i) {
            arr[i][0] = 1;
            arr[i][n - 1] = 1;
        }

        // 第六行到最后一行的格子
        int left = 1;
        int right = n - 2;
        for (int i = 6; i < arr.length; ++i) {
            arr[i][left++] = 1;
            arr[i][right--] = 1;
        }

        // 内部填满
        InternalMarkup(arr);

        // 输出函数
        Effect_Output(arr);
    }

    // 将爱心内部填满
    public static void InternalMarkup(int[][] arr) {
        for (int i = 1; i < arr.length; ++i) {
            // 寻找左边界
            int left = 0;
            while (arr[i][left++] == 0);
            left--; // 回退一步

            // 寻找右边界
            int right = arr[i].length - 1;
            while (arr[i][right--] == 0);
            right++; // 回退一步

            // 左右边界内的格子标记为 1 ，爱心内部填满
            for (int k = left; k <= right; ++k) {
                arr[i][k] = 1;
            }
        }

        // 第一行中间格子需要为零
        arr[1][arr[1].length / 2] = 0;
    }

    // 按传递的参数输出爱心图案
    public static void Effect_Output(int[][] arr) {
        // 爱心符号的unicode码
        char target = '\u2764';
        // ANSI转义码设置红色
        String redColor = "\u001B[31m";
        // ANSI转义码重置文本格式
        String resetColor = "\u001B[0m";

        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                // 判断该下标的值是否为 1 ，是则输出爱心图案，反之输出空格
                if (arr[i][j] == 1) {
                    System.out.print(redColor + target + resetColor + " \t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println(); // 换行
        }
    }
}
