package com.oop.oop19_综合案列;

/**
 * @Description Pmd_Demo
 * @Author ChengYun
 * @Date 2025-03-21  17:23
 */
public class Pmd_Demo {
    public static void main(String[] args) {
        Student student = new Student();
        eat(student);
        dirveCar(student);
        maJing(student);

        Woker woker = new Woker();
        eat(woker);
        maJing(woker);

        Teacher teacher = new Teacher();
        eat(teacher);




    }


    //外部方法操作对象实现不同的 多态行为
    public static void eat(Person person){
        person.eat();
    }

    public static void dirveCar(DriveCar driveCar){
        driveCar.driveCar();
    }

    public static void maJing(MaJiang maJiang){
        maJiang.maJiang();
    }






}
