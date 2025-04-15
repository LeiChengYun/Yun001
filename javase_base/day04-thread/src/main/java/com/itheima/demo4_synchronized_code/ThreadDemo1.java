package com.itheima.demo4_synchronized_code;

public class ThreadDemo1 {
    public static void main(String[] args) {
        // 目标：线程同步的解决方案-同步代码块。
        // 1、设计一个账户类：用于创建小明和小红的共同账户对象，存入10万。
        Account acc = new Account("ICBC-111", 100000);
        // 2、设计线程类：创建小明和小红两个线程，模拟小明和小红同时去同一个账户取款10万。
        new DrawThread(acc, "小明").start();
        new DrawThread(acc, "小红").start();
    }
}
