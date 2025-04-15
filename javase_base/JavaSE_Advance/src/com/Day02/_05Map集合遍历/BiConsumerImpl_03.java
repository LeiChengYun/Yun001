package com.Day02._05Map集合遍历;

import java.util.function.BiConsumer;

/**
 * @Description BiConsumerImpl_03
 * @Author ChengYun
 * @Date 2025-03-29  10:41
 */
public class BiConsumerImpl_03 implements BiConsumer<String,Integer> {

    @Override
    public void accept(String s, Integer integer) {
        System.out.println(s + "=" + integer);
    }
}
