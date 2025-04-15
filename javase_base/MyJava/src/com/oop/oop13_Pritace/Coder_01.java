package com.oop.oop13_Pritace;

/**
 * @Description Coder_01
 * @Author ChengYun
 * @Date 2025-03-20  20:42
 */
public class Coder_01 extends Person_01 {
    public Coder_01(String name, int age) {
        super(name, age);
    }

    public void code() {
        System.out.println(getName()+"敲代码");
    }


}
