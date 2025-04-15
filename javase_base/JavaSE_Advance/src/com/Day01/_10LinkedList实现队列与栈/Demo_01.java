package com.Day01._10LinkedList实现队列与栈;

import java.util.LinkedList;

/**
 * @Description Demo_01
 * @Author ChengYun
 * @Date 2025-03-28  18:21
 */
public class Demo_01 {
    public static void main(String[] args) {
        //List<String> list = new ArrayList<>(); 非常重要的代码，以后使用非常多

        //目标：使用LinkedList实现队列（先进先出，后进后出）
        LinkedList<String> queue = new LinkedList<>();
        //排队打饭(入队)
        queue.addLast("1号");
        queue.addLast("2号");
        queue.addLast("3号");
        queue.addLast("4号");
        queue.addLast("5号");
        System.out.println(queue);
        //打完饭出队（出队）
        queue.removeFirst();//1号移除了
        queue.removeFirst();//2号移除了
        queue.removeFirst();//3号移除了
        System.out.println(queue);


        //目标：使用LinkedList实现栈（先进后出，后进先出）
        LinkedList<String> stack = new LinkedList<>();
        //上子弹(入栈\压栈)
        stack.push("第1颗子弹");
        stack.push("第2颗子弹");
        stack.push("第3颗子弹");
        stack.push("第4颗子弹");
        stack.push("第5颗子弹");
        System.out.println(stack);
        //打子弹（出栈\弹栈）
        stack.pop();//第5颗子弹答打出
        stack.pop();//第4颗子弹答打出
        stack.pop();//第3颗子弹答打出
        System.out.println(stack);






    }
}
