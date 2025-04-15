package com.Day01._04泛型接口;

/**
 * @Description Student
 * @Author ChengYun
 * @Date 2025-03-27  16:21
 */
public class Student {
    private int id;
    private String name;
    private int age;

    public Student() {

    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
