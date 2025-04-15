package com.itheima.demo3annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE}) // 只能注解在方法和类上
@Retention(RetentionPolicy.RUNTIME) // 声明注解活到运行时保留
public @interface Mybook3 {
}
