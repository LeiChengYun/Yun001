package com.oop.oop22_lamdba;

@FunctionalInterface
public interface SiwmAble_02 {

    //lambda使用前提：接口或抽象类中只有一个抽象方法, 能替换的是函数式接口匿名内部类代码
    //函数式接口: 只有一个抽象方法就是，可以使用@FunctionalInterface注解标识
    void swimming();
}
