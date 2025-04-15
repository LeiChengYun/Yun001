package com.oop.oop17_接口;

/**
 * @Description Print_All
 * @Author ChengYun
 * @Date 2025-03-21  15:47
 */
public class Print_All implements Print{
    public void printMsg(Student[] students) {
        System.out.println("打印全部学生信息:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
