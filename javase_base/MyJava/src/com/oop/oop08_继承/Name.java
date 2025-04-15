package com.oop.oop08_继承;

/**
 * @Description Name
 * @Author ChengYun
 * @Date 2025-03-18  20:22
 */
public class Name {
    private String name;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Name(String name)
    {
        this.name = name;
    }

    public Name()
    {

    }

    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                '}';
    }
}
