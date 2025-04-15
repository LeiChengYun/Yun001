package com.oop.oop17_接口;

/**
 * @Description Print_Gender
 * @Author ChengYun
 * @Date 2025-03-21  16:03
 */
public class Print_Gender implements Print {

    @Override
    public void printMsg(Student[] students) {

        System.out.println("打印性别为男的同学的名字：");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGender() == Gender.MALE){
                System.out.println(students[i]);
            }
        }

        System.out.println("打印性别为女的同学的名字：");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGender() == Gender.FEMALE){
                System.out.println(students[i]);
            }
        }

    }
}
