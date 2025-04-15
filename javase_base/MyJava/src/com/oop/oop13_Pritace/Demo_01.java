package com.oop.oop13_Pritace;

/**
 * @Description Demo_01
 * @Author ChengYun
 * @Date 2025-03-20  20:59
 */
public class Demo_01 {
    public static void main(String[] args) {
        Coder_01 coder = new Coder_01("马化腾", 45);
        coder.eat();
        coder.sleep();
        coder.code();

        Teacher_01 teacher = new Teacher_01("马云",50);
        teacher.eat();
        teacher.sleep();
        teacher.teach();



    }
}
