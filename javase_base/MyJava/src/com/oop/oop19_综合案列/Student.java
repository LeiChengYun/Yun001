package com.oop.oop19_综合案列;

/**
 * @Description Student
 * @Author ChengYun
 * @Date 2025-03-21  17:20
 */
public class Student extends Person implements DriveCar, MaJiang{

    @Override
    public void driveCar() {
        System.out.println("学生可以开车");
    }

    @Override
    public void maJiang() {
        System.out.println("学生可以打麻将");

    }

    @Override
    public void eat() {
        System.out.println("学生可以吃饭");

    }
}
