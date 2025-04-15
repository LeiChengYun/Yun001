package com.itheima.demo2threadapi;

public class ThreadApiDemo2 {
    public static void main(String[] args) throws Exception {
        // 目标：搞清楚Thread类的Sleep方法（线程休眠）
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            // 让当前执行的线程休眠1s.
            // 场景：项目经理让我加上这行代码，如果用户交钱了我就注释掉。
            Thread.sleep(1000);
        }
    }
}
