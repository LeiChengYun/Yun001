package com.Day06._01反射;

import java.io.File;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description Demo_01
 * @Author ChengYun
 * @Date 2025-04-05  14:27
 */
public class Demo_01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        System.out.println("-----------------获取class对象------------------");
        System.out.println("----------------通过类名获取---------------------");
        Class catClass1 = Cat.class;
        System.out.println(catClass1);

        System.out.println("----------------通过对象获取---------------------");
        Class catClass2 = Class.forName("com.Day06._01反射.Cat");
        System.out.println(catClass2);

        System.out.println("----------------通过对象的getCalss方法获取---------------------");
        Class catClass3 = new Cat().getClass();
        System.out.println(catClass3);

        System.out.println(catClass1 == catClass2);







        System.out.println("-----------------------------------获取构造方法----------------------------------------------------");

        System.out.println("----------------获取所有public的构造器---------------------");
        Constructor<?>[] constructors = catClass1.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println("----------------获取所有构造器---------------------");
        Constructor<?>[] constructors2 = catClass1.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors2) {
            System.out.println(constructor);
        }

       System.out.println("----------------获取指定构造器(只能是public)---------------------");
        Constructor constructor1 = catClass1.getConstructor(Integer.class);
        System.out.println(constructor1);

        //获取多个参数的构造器
        Constructor constructor2 = catClass1.getConstructor(String.class,Integer.class);
        System.out.println(constructor2);
        //不存在会抛异常
        //Constructor notExistConstructor = catClass1.getConstructor(Long.class);
        //获取私有也会抛异常
        //Constructor privateConstructor = catClass1.getConstructor(String.class);

        System.out.println("----------------获取指定参数的构造器(只要存在就能拿到)---------------------");
        Constructor constructor3 = catClass1.getDeclaredConstructor(String.class);
        System.out.println(constructor3);


        System.out.println("----------------获取类构造器的作用：依然是初始化对象返回---------------------");
        System.out.println("----------------创建对象---------------------");
        Cat cat1 = (Cat) constructor1.newInstance(34);

        Cat cat2 = (Cat) constructor2.newInstance("xiaohua", 17);

        System.out.println(cat1);
        System.out.println(cat2);


        System.out.println("-----------------私有构造器创建对象-------------------");
        //必须先设置访问权限
        constructor3.setAccessible(true);
        Cat cat3 = (Cat) constructor3.newInstance("");
        System.out.println(cat3);











        System.out.println("-------------------------------------获取成员变量------------------------------------");
        System.out.println("----------------获取所有public的成员变量---------------------");
        Field[] fields1 = catClass1.getFields();
        for(Field field : fields1){
            System.out.println(field);
        }

        System.out.println("----------------获取所有成员变量(不包含父类)---------------------");
        Field[] fields2 = catClass1.getDeclaredFields();
        for(Field field : fields2){
            System.out.println(field);
        }


        System.out.println("----------------获取指定成员变量(只能是public)---------------------");
        Field field1 = catClass1.getField("hobby");
        System.out.println(field1);
        //不存在会抛异常
        //Field notExistHobbyField = catClass1.getField("hobby2");
        //获取私有会抛异常
        //Field privateNameField = catClass1.getField("name");


        System.out.println("----------------获取指定成员变量(不包含父类)---------------------");
        Field field2 = catClass1.getDeclaredField("name");
        System.out.println(field2);


        System.out.println("-----------------获取到成员变量的作用：依然是赋值、取值-----------------。");
        System.out.println(cat1.getHobby());
        field1.set(cat1,"跳跳跳");
        System.out.println(cat1.getHobby());

        //还可以通过反射获取到成员变量的值
        System.out.println(field1.get(cat1));

        //私有字段的赋值和取值
        field2.setAccessible(true);
        System.out.println("名称是"+field2.get(cat2));
        field2.set(cat2,"小明");
        System.out.println("名称是"+field2.get(cat2));








        System.out.println("--------------------------------------------获取成员方法-----------------------------------");
        System.out.println("----------------获取所有public的成员方法---------------------");
        Method[] method1 = catClass1.getMethods();
        for (Method method : method1) {
            System.out.println(method);
        }

        System.out.println("----------------获取所有成员方法(不包含父类)---------------------");
        Method[] method2 = catClass1.getDeclaredMethods();
        for (Method method : method2) {
            System.out.println(method);
        }

        System.out.println("----------------获取特定名称的成员方法（只能获取public）---------------------");
        //无参
        Method getNameMethod = catClass1.getMethod("getName");
        System.out.println(getNameMethod);
        //有参
        Method setNameMethod = catClass1.getMethod("setName", String.class);
        System.out.println(setNameMethod);
        //多个参
        Method dance1Method = catClass1.getMethod("dance1", String.class,Integer.class);
        System.out.println(dance1Method);
        //要注意基本数据类型和包装类的情况，基本数据类型也有class对象，不然会抛异常
        //Method dance2Method = catClass1.getMethod("dance2", String.class,Integer.class);
        Method dance2Method = catClass1.getMethod("dance2", String.class,int.class);
        System.out.println(dance2Method);
        //不存在会抛异常
        //Method notExistDance3Method = catClass1.getMethod("dance3",String.class);
        //参数列表不对应也会抛异常
        //Method wrongArgDance1Method = catClass1.getMethod("dance1",Long.class);
        //参数顺序不对应也会抛异常
        //Method wrongArgDance1Method = catClass1.getMethod("dance1",Integer.class,String.class);
        //获取私有会抛异常
        //Method privateSingMethod = catClass1.getMethod("sing");

        System.out.println("----------------获取特定名称的成员方法(不包含父类)---------------------");
        Method privateSingMethod = catClass1.getDeclaredMethod("sing");
        System.out.println(privateSingMethod);

        System.out.println("----------------成员方法执行---------------------");
        String result = (String) getNameMethod.invoke(cat2);
        System.out.println(result);
        //有参数
        setNameMethod.invoke(cat2, "小东");
        System.out.println(cat2.getName());
        //多个参数
        String dance1Result = (String) dance1Method.invoke(cat2,"a",1);
        System.out.println(dance1Result);
        //参数列表有误会抛异常
        //String dance2Result = (String) dance2Method.invoke(cat2,"a","b");
        //调用私有会抛异常
        privateSingMethod.setAccessible(true);
        String singResult = (String) privateSingMethod.invoke(cat2);
        System.out.println(singResult);

        System.out.println("----------------反射可以绕过泛型检查---------------------");
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        //不允许
        //list.add(1);
        //使用反射
        Field elementDataField = list.getClass().getDeclaredField("elementData");
        elementDataField.setAccessible(true);
        Object[] elementData = (Object[]) elementDataField.get(list);
        elementData[0] = 123;
        System.out.println(list);
    }
}





























