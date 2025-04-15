package com.itheima.demo2reflect;

public class Dog {
    private String name;
    private int age;

    public void eat(){
        System.out.println("狗吃东西...");
    }

    private String eat(String name){
        System.out.println("狗吃" + name);
        return "谢谢！谢谢！";
    }

    public Dog() {
    }

    private Dog(String name){
        this.name = name;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
