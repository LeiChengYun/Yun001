package com.itheima.demo3annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationDemo4 {
    // 目标：搞清楚注解的应用场景：模拟junit框架。有MyTest注解的方法就执行，没有的就不执行。

    public void test1(){
        System.out.println("test1方法执行了。。。");
    }

    @MyTest
    public void test2(){
        System.out.println("test2方法执行了。。。");
    }

    public void test3(){
        System.out.println("test3方法执行了。。。");
    }

    @MyTest
    public void test4(){
        System.out.println("test4方法执行了。。。");
    }


    public static void main(String[] args) throws Exception {
        AnnotationDemo4 a = new AnnotationDemo4();
        // 1、提取Class对象
        Class c = AnnotationDemo4.class;

        // 2、提取全部方法对象
        Method[] methods = c.getDeclaredMethods();

        // 3、判断方法上是否加了MyTest注解，加了就跑它
        for (Method method : methods) {
            if(method.isAnnotationPresent(MyTest.class)){
                // 跑它
                method.invoke(a);
            }
        }
    }
}


