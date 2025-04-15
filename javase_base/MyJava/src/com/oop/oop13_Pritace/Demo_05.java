package com.oop.oop13_Pritace;

/**
 * @Description Demo_05
 * @Author ChengYun
 * @Date 2025-03-21  20:43
 */

/*定义一个父类Anima1包含name，weight属性和一个抽象的eat方法定义两个子类Dog和Cat，Dog特有方法lookHome，
Cat特有方法catchMouse；并且重写eat方法，Dog吃骨头，Cat吃鱼要求：使用多态形式创建Dog和cat对象，
调用eat方法，并且使用向下转型，如果是Cat类型调用catchMouse功能，如果是Dog类型调用lookHome功能*/

public class Demo_05 {
    public static void main(String[] args) {

        Animal_05 animal_dog = new Dog_05();
        animal_dog.eat();
        work(animal_dog);


        Animal_05 animal_cat = new Cat_05();
        animal_cat.eat();
        work(animal_cat);

    }


    public static void work(Animal_05 animal){
        if (animal instanceof Dog_05){
            //在调用lookDoor()之前，确保animal是Dog_05类型，并进行强制转换。

            /*如果没有添加强制类型转换会报错，原因是Animal_05类中没有定义lookDoor()方法，
             而work方法中直接调用了animal.lookDoor()。
             尽管animal可能是Dog_05类型的实例，但编译器无法确定这一点，因此报错。*/
            ((Dog_05) animal).lookDoor();
        }
        if (animal instanceof Cat_05){
            ((Cat_05) animal).catchMouse();
        }
    }
}
