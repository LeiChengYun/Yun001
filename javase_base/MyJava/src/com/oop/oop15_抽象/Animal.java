package com.oop.oop15_抽象;

/**
 * @Description Animal
 * @Author ChengYun
 * @Date 2025-03-21  10:53
 */
public abstract class Animal {   //动态类是抽象的
    public abstract void run();    //抽象方法；要求子类必须重写抽象方法,这样就不用写方法体了，因为父类写方法体没有意义
}
