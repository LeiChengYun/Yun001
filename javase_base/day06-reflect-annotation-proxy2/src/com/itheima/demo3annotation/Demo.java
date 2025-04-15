package com.itheima.demo3annotation;


@MyBook4(value = "从入门到入土", aaa = 11.5, bbb = {"赵无极", "赵敏", "张无忌"})
@Mybook3
public class Demo {
    @MyBook4(value = "从入门到发疯", aaa = 1.5, bbb = {"阿猫", "阿狗"})
    public void test1(){
    }
}
