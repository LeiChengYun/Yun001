package com.Work.Day02;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Description TDemo_03
 * @Author ChengYun
 * @Date 2025-03-29  16:35
 */
//创建一个 Student 类，包含姓名和成绩两个属性。使用 ArrayList 存储多个学生信息，并根据成绩对学生进行排序。

class Student {
    private String name;

    private int score;



    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', score=" + score + "}";
    }
}

public class TDemo_03 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 70));
        students.add(new Student("Charlie", 90));

        students.sort(Comparator.comparingInt(Student::getScore));
        for (Student student : students) {
            System.out.println(student);
        }
    }

}


