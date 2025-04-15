package com.Work.Day01;

/**
 * @Description Student_01
 * @Author ChengYun
 * @Date 2025-03-27  22:11
 */
public class Student_01 {
    private int id;
    private String name;
    private double score;

    public Student_01(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public Student_01() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student_01{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
