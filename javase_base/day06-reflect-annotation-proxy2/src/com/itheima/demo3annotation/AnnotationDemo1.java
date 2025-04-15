package com.itheima.demo3annotation;

@Mybook(name = "java",  authors = {"itcast", "itheima"})
//@Mybook2(value = "蜘蛛精")
@Mybook2("蜘蛛精") // 默认参数名value可以省略,前提是只能有一个value属性。
public class AnnotationDemo1 {

    @Mybook(name = "前端2", price = 219.9, authors = {"itcast2", "itheima"})
    private int age;

    @Mybook(name = "前端", price = 19.9, authors = {"itcast", "itheima"})
    public static void main( String[] args ) {
    }
}
