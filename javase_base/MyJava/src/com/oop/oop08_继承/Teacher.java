package com.oop.oop08_继承;

/**
 * @Description Name_Util
 * @Author ChengYun
 * @Date 2025-03-18  20:23
 */
public class Teacher extends Name {
    private String skill;

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public Teacher(String name){
        super(name);
    }

    public Teacher(){

    }


}
