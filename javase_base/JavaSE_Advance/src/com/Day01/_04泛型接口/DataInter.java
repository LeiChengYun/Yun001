package com.Day01._04泛型接口;

public interface DataInter<T> {
    void add(T t);
    T get(int index);
    void remove(int id);
    void update(int id,T t);

}
