package com.oop.oop02_javaBean;

/**
 * @Description StudentOperator
 * @Author ChengYun
 * @Date 2025-03-17  17:58
 */
public class StudentOperator {
   //求学生平均成绩
    //求学生总成绩
    public void printSum(Student student){
        System.out.println(student.getName()+"学生总成绩:"+(student.getChinese()+student.getMath()));
    }

    public void printAvg(Student student){
        System.out.println(student.getName()+"学生平均成绩:"+((student.getChinese()+student.getMath())/2));
    }




}
