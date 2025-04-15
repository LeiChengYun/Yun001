package com.oop.oop15_抽象;

/**
 * @Description Animal_Demo
 * @Author ChengYun
 * @Date 2025-03-21  10:56
 */

/*
目标: 学习抽象类和抽象方法

    抽象方法的好处:
        1.父类写了抽象方法, 强制子类重写抽象方法, 保证功能完整
        2.父类写了抽象方法, 更好的支持多态, 抽象方法不写方法体更加简化代码
 */
public class Animal_Demo {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        animal1.run();

        Animal animal2 = new Chicken();
        animal2.run();


        //子类对象调用自己的方法
        Dog dog = new Dog();
        dog.run();

    }


}
