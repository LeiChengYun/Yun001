package com.oop.oop21_内部类;

/**
 * @Description Student_02
 * @Author ChengYun
 * @Date 2025-03-22  10:26
 */
public class Student_02 implements SiwmAble_02{
    private String name;

    private int age;

    public Student_02() {
    }

    @Override
    public void swimming() {
        System.out.println("学生在游泳");
    }

    public Student_02(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student_02{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
