package com.tiantinaxiangshang.HelloWorld;

/**
 * @Description HelloWorld05
 * @Author ChengYun
 * @Date 2025-03-19  20:01
 */
public class HelloWorld05 {
    public static void main(String[] args) {

        Chinese chinese = new Chinese();
        chinese.sayHello();

    }


   static abstract class People{ //静态抽象类
        public abstract void sayHello();//抽象方法
    }
   static class Chinese extends People{
        @Override
        public void sayHello() {//实现抽象方法
            System.out.println("你好");
        }
    }
    class Japanese extends People{
        @Override
        public void sayHello() {//实现抽象方法
            System.out.println("口你七哇");
        }
    }
    class American extends People{
        @Override
        public void sayHello() {//实现抽象方法
            System.out.println("hello");
        }
    }


}
