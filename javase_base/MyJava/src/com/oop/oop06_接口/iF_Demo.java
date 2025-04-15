package com.oop.oop06_接口;


import java.util.ArrayList;
import java.util.List;

/**
 * @Description iF_Demo
 * @Author ChengYun
 * @Date 2025-03-19  13:58
 */
public class iF_Demo {
    public static void main(String[] args) {
        // 创建一个 Shape 类型的列表，用于存储 Shape 类的实例
        List<Shape> shapes = new ArrayList<>();
        // 添加一个 Circle 类的实例到 shapes 列表中
        shapes.add(new Circle());
        // 添加一个 Square 类的实例到 shapes 列表中
        shapes.add(new Square());

        /*这段代码是一个增强型 for 循环的语法，用于遍历集合或数组中的元素。以下是对其的详细解释：
        功能： 遍历 shapes 列表中的每个元素，并将每个元素依次赋值给变量 shape。
        语法结构：
        Shape shape：声明了一个类型为 Shape 的变量 shape，用于存储每次迭代时从 shapes 列表中取出的元素。
        shapes：这是一个 List<Shape> 类型的集合，包含了多个 Shape 对象。
        执行过程：
        每次循环会从 shapes 列表中取出一个元素，赋值给变量 shape。
        在循环体内部，可以对 shape 进行操作（例如调用其方法）。
        应用场景： 适用于需要对集合或数组中的每个元素进行操作的场景，相比传统 for 循环更加简洁易读。*/

        for (Shape shape : shapes){
            System.out.println(shape.name());
        }


    }
}
