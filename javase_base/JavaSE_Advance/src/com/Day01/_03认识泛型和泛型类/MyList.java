package com.Day01._03认识泛型和泛型类;

import java.util.ArrayList;

/**
 * @Description MyList
 * @Author ChengYun
 * @Date 2025-03-27  15:45
 */
public class MyList<E> {
    ArrayList<E> list = new ArrayList<>();

    public void add(E e){
        list.add(e);
    }

    public E get(int index){
        return list.get(index);
    }

    public void remove(int index){
        list.remove(index);
    }

    @Override
    public String toString() {
        return "MyList{" +
                "list=" + list +
                '}';
    }
}
