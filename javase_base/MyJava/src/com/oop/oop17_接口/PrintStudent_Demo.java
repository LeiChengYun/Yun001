package com.oop.oop17_接口;

import com.oop.oop08_继承.Name;

/**
 * @Description PrintStudent_Demo
 * @Author ChengYun
 * @Date 2025-03-21  16:08
 */
public class PrintStudent_Demo {
    public static void main(String[] args) {
        Student[]  students = {
                new Student("xiaohua", 18, Gender.MALE),
                new Student("xiaohong", 19, Gender.FEMALE),
                new Student("xiaobai", 20, Gender.MALE),
                new Student("xiaohuang", 21, Gender.FEMALE)
                };

        Print_All print_all = new Print_All();
        //print_all.printMsg(students);
        run(print_all, students);


        Print_Gender print_gender = new Print_Gender();
        //print_gender.printMsg(students);
        run(print_gender, students);




        }


        public static void run(Print print, Student[] students){
                    print.printMsg(students);
        }


    }

