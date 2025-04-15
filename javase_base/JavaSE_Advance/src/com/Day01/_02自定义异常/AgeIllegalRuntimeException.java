package com.Day01._02自定义异常;

/**
 * @Description AgeIllegalException
 * @Author ChengYun
 * @Date 2025-03-27  11:51
 */
//目标：自定义编译时异常类，专门用于处理年龄不合法的异常
//1.定义类并继承Exception
public class AgeIllegalRuntimeException extends Exception {
//    2.重写构造器
//    定义无参
    public void AgeIllegalException(){

    };

    public AgeIllegalRuntimeException(String msg){
        //调用父类有参构造器初始化异常消息
        super(msg);
    }


}
