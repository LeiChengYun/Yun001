package com.oop.oop04_static;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description Student
 * @Author ChengYun
 * @Date 2025-03-18  14:39
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name;
    private int chinese;
    private int math;

    static String teacherName;

}
