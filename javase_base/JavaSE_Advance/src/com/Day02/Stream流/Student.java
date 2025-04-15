package com.Day02.Stream流;

import java.util.Objects;

/**
 * @Description Student
 * @Author ChengYun
 * @Date 2025-03-28  18:04
 */
//注意：这个类不要使用lombok，否则解决很多问题
//Student类实现了Comparable<Student>接口
public class Student implements Comparable<Student> {

    private String name;
    private int age;
    private double score;
    private String address;

    public Student() {}

    public Student(String name, int age, double score, String address) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.address = address;
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", address='" + address + '\'' +
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(score, student.score) == 0 && Objects.equals(name, student.name) && Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, score, address);
    }





    //重写比较器方法，按照年龄比较
    @Override
    public int compareTo(Student o) {
        //jdk官方比较规则
        //升序规则
        //    当前对象this.getAge() - 传入对象o.getAge() 返回大正整数，代表当前对象大于传入对象
        //    当前对象this.getAge() - 传入对象o.getAge() 返回大负整数，代表当前对象小于传入对象
        //    当前对象this.getAge() - 传入对象o.getAge() 返回值等于0，代表当前对象等于传入对象
        // if(this.getAge() - o.getAge() > 0) return 1;
        // if(this.getAge() - o.getAge() < 0) return -1;
        // if(this.getAge() - o.getAge() == 0) return 0;

        //return o.getAge() - this.getAge();//降序
        return this.getAge() - o.getAge();//升序
    }
}

