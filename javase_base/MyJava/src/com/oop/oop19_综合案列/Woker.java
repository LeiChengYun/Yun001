package com.oop.oop19_综合案列;

/**
 * @Description Woker
 * @Author ChengYun
 * @Date 2025-03-21  17:21
 */
public class Woker extends Person implements MaJiang{
    @Override
    public void maJiang() {
        System.out.println("工人会打麻将");
    }

    @Override
    public void eat() {
        System.out.println("工人会吃饭");

    }
}
