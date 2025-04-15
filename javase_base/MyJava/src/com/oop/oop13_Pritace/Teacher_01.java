package com.oop.oop13_Pritace;

/**
 * @Description Teacher_01
 * @Author ChengYun
 * @Date 2025-03-20  20:43
 */
public class Teacher_01 extends Person_01 {
    public Teacher_01(String name, int age) {
        super(name, age);
    }

    public void teach() {
        System.out.println(getName() + "正在教课");
    }


}
