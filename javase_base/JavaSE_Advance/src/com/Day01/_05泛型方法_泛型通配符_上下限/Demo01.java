package com.Day01._05泛型方法_泛型通配符_上下限;

import java.util.ArrayList;

/**
 * @Description Demo01
 * @Author ChengYun
 * @Date 2025-03-27  17:28
 */
public class Demo01 {
    public static void main(String[] args) {
        //目标：使用泛型通配符？，在使用泛型的时候用，代表一切类型
        // 泛型通配符？
        //   下限: ? extends Car, 代表可以是父类Car，也可以是Car的子类
        //   上限: ? super Car, 代表可以是Car，也可以是Car的父类
        ArrayList<BWM> arrayList1 = new ArrayList<>();
        arrayList1.add(new BWM());
        arrayList1.add(new BWM());
        go(arrayList1);


//        报错原因是go2方法的参数类型为ArrayList<Car>，而传入的是ArrayList<BWM>。
//        尽管BWM是Car的子类，但ArrayList<BWM>并不是ArrayList<Car>的子类，
//        Java泛型不支持直接的子类型继承关系。
//        go2(arrayList1);

        ArrayList<BENZ> arrayList2 = new ArrayList<>();
        arrayList2.add(new BENZ());
        go(arrayList2);



        ArrayList<Car> arrayList3 = new ArrayList<>();
        arrayList3.add(new Car());
        go(arrayList3);
        go2(arrayList3);
        go3(arrayList3);



        ArrayList<cat> arrayList4 = new ArrayList<>();
        arrayList4.add(new cat());
        go3(arrayList4);


    }


    public static void go(ArrayList<? extends Car> arrayList) {
    }


    //注意：这种要求传入的泛型必须且只能是Car, 不写框架源码这种方式使用最多。
    public static void go2(ArrayList<Car> arrayList) {
    }


    //这里只有？可以代表任何类型，不推荐使用，类型没有限制.
    public static void go3(ArrayList<?> arrayList) {
    }
}

class Car {
}

class BWM extends Car {
}

class BENZ extends Car {
}

class XIAOMI extends Car {
}

class cat {
}
