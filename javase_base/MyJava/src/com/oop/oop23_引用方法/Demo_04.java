package com.oop.oop23_引用方法;

/**
 * @Description Demo_04
 * @Author ChengYun
 * @Date 2025-03-28  11:50
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 工厂设计模式：使用工厂创建对象（专门有一个类用来创建指定产品（复杂结构）的对象）
 当前这个工厂专门创建Car对象的工厂
 */
@FunctionalInterface
interface CarFactory{
    Car create(String name);
}
@Data
@NoArgsConstructor
@AllArgsConstructor// public Car(String name){this.name=name;}
class Car{
    private String name;
}

public class Demo_04 {
    public static void main(String[] args) {
        //方式一: 匿名内部类
        CarFactory c1 = new CarFactory() {
            @Override
            public Car create(String name) {
                return new Car(name);
            }
        };
        Car car1 = c1.create("保时捷");
        System.out.println(car1);


        //方式二：lambda表达式
        CarFactory c2 = (name) -> new Car(name);
        Car car2 = c2.create("奔驰");
        System.out.println(car2);


        //方式3：构造器引用方式 (新知识)
        // 语法：类名：:new
        // 作用：优化指定Lambda表达式
        // 使用前提：Lambda表达式方法体只有一句创建对象调用构造器的代码，并且重写方法参数与构造器参数

        //替Lambda表达式方法体中new Car(name)
        CarFactory c3 = Car::new;
        Car car3 = c3.create("保时米");
        System.out.println(car3);







    }
}
