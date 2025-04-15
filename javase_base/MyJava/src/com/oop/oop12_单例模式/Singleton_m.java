package com.oop.oop12_单例模式;

/**
 * @Description Singleton_m
 * @Author ChengYun
 * @Date 2025-03-20  19:55
 */
/**
 音频播放器对象：单例模式-懒汉方式
 单例模式：只能创建对象一次
 懒汉方式：比较懒，第一次使用对象的时候才创建对象, 注意：线程并发的时候不安全（以后讲）
 */
public class Singleton_m {
    //实现步骤1：构造器私有化，不让外部创建对象
    private Singleton_m(){

    }



    //实现步骤2：定义私有静态成员当前类变量成员，不初始化
    private static Singleton_m instance;



    //实现步骤3：定义公共静态成员方法，返回当前类变量成员，如果为空就创建对象
    public static Singleton_m getInstance(){
        //如果运行多次，会存在线程安全问题
        if(instance == null){
            instance = new Singleton_m();
        }
        return instance;
    }

}
