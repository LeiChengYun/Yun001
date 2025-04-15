package com.itheima.demo2reflect;

public class ReflectDemo5 {
    public static void main(String[] args) throws Exception {
        Cat c = new Cat("小花", 3);
        JFrameUtil.saveObject(c);

        Teacher t = new Teacher("小明", 18, "男", "北京");
        JFrameUtil.saveObject(t);
    }
}
