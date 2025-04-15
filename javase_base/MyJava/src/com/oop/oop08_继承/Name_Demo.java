package com.oop.oop08_继承;

/**
 * @Description Name_Demo
 * @Author ChengYun
 * @Date 2025-03-18  20:29
 */
public class Name_Demo {
    public static void main(String[] args) {
        //Teacher类继承了Name类，就拥有了Name类中的属性和方法
        Teacher teacher = new Teacher();
        teacher.setName("张三");

        //创建Teacher对象，teacher1的构造方法中通过super调用父类的构造方法
        Teacher teacher1 = new Teacher("Leilei");

        Consultant consultant = new Consultant();
        consultant.setName("李四");

        System.out.println(teacher.getName());
        System.out.println(consultant.getName());
//        System.out.println(teacher1.getName());

    }
}
