package com.Day03._01File_IO;

/**
 * @Description Demo_5
 * @Author ChengYun
 * @Date 2025-03-31  10:47
 */
//猴子吃桃问题
public class Demo_05 {
    //目标：猴子吃桃
    //分析：
    //  递归公式：  f(n)=?
    //       推导公式：  f(n)-f(n)/2-1 = f(n+1)
    //         推导去掉除数，两边乘以2： f(n)*2-f(n)-2 = 2* f(n+1)
    //                              f(n)-2 = 2* f(n+1)
    //                              f(n) = 2* f(n+1) +2
    //  结束条件： n=10,返回1个桃子

    //  向终点方向结束：  =<10的到10结束，大于>10只直接结束
    public static void main(String[] args) {
        System.out.println("第1天还有"+f(1));
        System.out.println("第9天还有"+f(9));

    }
    public static int f(int n){
        if(n==10){
            return 1;
        }else{
            return 2 * f(n+1) + 2;
        }

    }
}
