//package com.itheima.demo3annotation;
//
//import org.junit.Test;
//
//import java.lang.reflect.Method;
//import java.util.Arrays;
//
//public class AnnotationDemo3 {
//    // 目标：解析注解
//    @Test
//    public void parseClass() throws Exception {
//        // 1、先获取Class对象
//        Class c = Demo.class;
//        // 2、判断类对象上是否存在这个注解
//        if(c.isAnnotationPresent(MyBook4.class)){
//            // 3、获取这个注解对象。提取里面的数据。
//            MyBook4 myBook4 = (MyBook4) c.getDeclaredAnnotation(MyBook4.class);
//            System.out.println(myBook4.value());
//            System.out.println(myBook4.aaa());
//            System.out.println(Arrays.toString(myBook4.bbb()));
//        }
//    }
//
//    @Test
//    public void parseMethod() throws Exception {
//        // 1、先获取Class对象
//        Class c = Demo.class;
//        Method m = c.getDeclaredMethod("test1");
//        // 2、判断方法对象上是否存在这个注解
//        if(m.isAnnotationPresent(MyBook4.class)){
//            // 3、获取这个注解对象。提取里面的数据。
//            MyBook4 myBook4 = (MyBook4) m.getDeclaredAnnotation(MyBook4.class);
//            System.out.println(myBook4.value());
//            System.out.println(myBook4.aaa());
//            System.out.println(Arrays.toString(myBook4.bbb()));
//        }
//    }
//}
