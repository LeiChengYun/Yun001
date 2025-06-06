package com.oop.oop02_javaBean;

/**
 * @Description Student
 * @Author ChengYun
 * @Date 2025-03-17  17:28
 */
public class Student {
    private String name;
    private int chinese;
    private int math;

    public Student(){

    }

    public Student(String name, int chinese, int math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public String toString(){
        return "Student{" +
                "name='" + name + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                '}';
    }
}
