package com.oop.oop09_多态;

/**
 * @Description P_Demo
 * @Author ChengYun
 * @Date 2025-03-20  11:21
 */
public class P_Demo {
    public static void main(String[] args) {

        //目标：在多态使用的情况下（父类引用子类对象）如何安全的调用子类对象独有成员

        //父类引用子类对象
        People people = new Student();
        System.out.println(people.name);//人类

        //访问name为“学生”就需要调用子类对象独有成员变量, 这里需要强制类型转换
        Student student = (Student) people;
        System.out.println( student.name);//学生


//        Student student = new Student();
//        PrintMsg(student);
//
//        Teacher teacher = new Teacher();
//        PrintMsg(teacher);




//        People[] people = {new Student(),new Teacher()};
//        for(People p :people){
//            p.run();
//        }


        //多态的好处：可以简化代码，降低代码维护成本
        //定义方法，传入参数老师或学生对象，传入的是学生调用学生跑步方法，传入是老师调用老师跑步方法
        //方式1：代码冗余，如果有100个子类，那么就要定义100方法
        // public static void run(Student student) {
        //     student.run();
        // }
        // public static void run(Teacher teacher) {
        //     teacher.run();
        // }



        //结论：继承关系中父子强制类型转换不安全
        //问题：如何避免多态类型转换异常?
        //instanceof: 用于判断对象实例所属类型是否是指定类型， 如判断父类对象是否里面真实类型是具体子类类型
        //    jdk16版本以前使用语法（老方式）：
        //          1.先父类对象引用 instanceof 子类类型；返回结果： 返回true代表是,返回false代表不是
        //          2.如果是，再进行显示转换： 子类类型 子类对象名 = (子类类型)父类对象引用
        //          3.调用子类对象独有方法：子类对象名.独有方法()
        //    jdk16及以后版本使用语法（新方式）：
        //          1.先父类对象引用 instanceof 子类类型 隐式转换子类对象名；
        //            返回结果： 返回true代表是并自动隐式转换,返回false代表不是
        //          2.调用子类对象独有方法：隐式转换子类对象名.独有方法()

        //老方式
        if(people instanceof Student){
            //访问name为“学生”就需要调用子类对象独有成员变量
            Student s = (Student) people;
            System.out.println( s.name);//学生
        }else if(people instanceof Teacher){
            Teacher teacher = (Teacher) people;
            System.out.println( teacher.name);//老师
        }


        //新方式
//        if(people instanceof Student s){
//            System.out.println( s.name);//学生
//        }else if(people instanceof Teacher t){
//            System.out.println( t.name);//老师
//        }


    }

    public static void PrintMsg(People people){
        people.run();
    }





}
