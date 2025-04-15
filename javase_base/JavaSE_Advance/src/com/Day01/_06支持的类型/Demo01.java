package com.Day01._06支持的类型;

/**
 * @Description Demo01
 * @Author ChengYun
 * @Date 2025-03-27  20:03
 */
public class Demo01 {
    public static void main(String[] args) {
        // 目标：搞清楚泛型和集合不支持基本数据类型，只能支持对象类型（引用数据类型）。
        // 0、泛型和集合都不支持基本数据类型。
        //ArrayList<int> arrayList = new ArrayList<int>(); 报错，泛型不支持基本数据类型

        int a1 = 10;

        //int a2 = new int(a1); 报错，基本数据类型不支持new

        //Integer a2 = new Integer(a1);已废弃

        //对于-128~127之间整数，jdk会从缓存池获取，不会分配新的储空间地址
        Integer a2 = Integer.valueOf(a1);

        //面试题
        // Integer i3 = 100;
        // Integer i4 = 100;
        // System.out.println（i3==i4）;
        // true,100没有分配新的内存空间，直接从缓存池获取地址一样
        // Integer i5 = 200;
        // Integer i6 = 200;
        // System.out.println(i5==i6);
        // faLse,200每次都分配新的内存空间地址，内存地址不一样



        //2、把基本数据类型变成包装类对象。Java支持自动装箱：基本类型的数据可以直接变成包装类型的对象。
        Integer a4 = 300;

        //3、把包装类对象变成基本数据类型。Java支持自动拆箱：包装类对象可以直接变成基本数据类型。
        int a5 = a4;

        //注意：以后推荐使用包装类型，因为包装类型可以接收值为nuLL和有成员数据（成员变量和成员方法)
        // int c= nuLL；报错，基本类型不可以赋值为nuLL


        //包装类型可以赋值为nuLL，非常符合前端传递数据给后端，可能没有传递导致端接收为nuLL
        Integer a6 = null;



        // 4、包装类新增的一些功能。
        // - 把基本数据类型变成字符串。Integer.toString(基本类型)
        System.out.println(Integer.toString(10));//"10"
        System.out.println(a4.toString());//"300"
        // - 把字符串的数值变成基本数据类型。Integer.parseInt(字符串数字)
        int d = Integer.parseInt("123");







    }
}
