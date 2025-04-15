package com.itheima.demo3annotation;
// 注解。
public @interface Mybook {
    String name();
    double price() default 9.9;
    String[] authors();
}
