package com.Day06._01反射;

public class Cat extends CatParent{

    private String name;
    private Integer age;
    public String hobby;

    public Cat(){
        System.out.println("++++公有构造+++++");
    }

    public Cat(Integer age){
        System.out.println("++++公有构造+++++"+age);
    }

    public Cat(String name,Integer age){
        System.out.println("++++公有构造+++++"+name+"+"+age);
    }

    private Cat(String name){
        System.out.println("++++私有构造+++++"+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String dance1(String a,Integer b){
        return "跳舞1";
    }

    public String dance2(String a,int b){
        return "跳舞2";
    }

    private String sing(){
        return "唱歌";
    }

}
