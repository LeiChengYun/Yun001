package com.oop.oop12_单例模式;

/**
 * @Description Singleton
 * @Author ChengYun
 * @Date 2025-03-20  17:57
 */
/**
 单例模式-饿汉方式
 单例模式：只能创建对象一次,节省内存
 饿汉方式：很饿，希望早点迟到对象，那就要早点创建对象，类加载的就创建对象
 */
public class Singleton_v {
    //实现步骤1：构造器私有化，不让外部创建对象
    private Singleton_v(){};

    //实现步骤2：定义私有静态成员当前类变量成员并初始化
    //这里的代码只会运行一次（并发线程都是安全的）
    private static Singleton_v instance = new Singleton_v();

    public static Singleton_v getInstance(){
        return instance;
    }

}
