package com.oop.oop23_引用方法;

/**
 * @Description Stu_01
 * @Author ChengYun
 * @Date 2025-03-23  10:21
 */
public class Stu_01 implements Siw_01{
    private String name;

    private int age;

    public Stu_01() {
    }

    @Override
    public void swimming() {
        System.out.println("学生在游泳");
    }

    public Stu_01(String name, int age) {
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

    //定义静态方法（替换比较器里面的方法，方法形参与返回值要一样）
    public static int compareAgeASC(Stu_01 s1,Stu_01 s2){
        return s1.age - s2.age;
    }
    public static int compareAgeDESC(Stu_01 s1,Stu_01 s2){
        return s2.age - s1.age;
    }


    //定义实例方法
    public int compareAgeASCObj(Stu_01 s1,Stu_01 s2){
        return s1.age - s2.age;
    }

    public int compareAgeDESCObj(Stu_01 s1,Stu_01 s2){
        return s2.age - s1.age;
    }



}
