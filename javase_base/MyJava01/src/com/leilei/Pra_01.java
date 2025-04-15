package com.leilei;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description Pra_01
 * @Author ChengYun
 * @Date 2025-03-14  20:50
 */


public class Pra_01 {
 // 构造方法,空参构造方法在类被实例化时自动调用，打印Hello World
    public Pra_01() {
        System.out.println("Hello World");
    }

    {
        System.out.println("代码初始化块");
    }




    public static void main(String[] args) {
    // 构造方法,空参构造方法在类被实例化时自动调用，打印Hello World
        new Pra_01();

    }


}
