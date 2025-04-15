package com.oop.oop14_枚举;

/**
 * @Description Enum_Demo
 * @Author ChengYun
 * @Date 2025-03-21  10:16
 */
public class Enum_Demo {
    public static void main(String[] args) {
        Person person1 = new Person("李雷",Gender.MALE);
        Person person2 = new Person("韩梅梅",Gender.FEMALE);

        System.out.println(person1);
        System.out.println(person2);


        Gender gender = person2.getGender();
        switch (gender){
            case MALE :
                System.out.println("男");
                break;
            case FEMALE:
                System.out.println("女");
                break;
            default:
                System.out.println("其他");
        }

        //方式2：三目运算符
        System.out.println(gender == Gender.MALE? "男" : "女");



    }
}
