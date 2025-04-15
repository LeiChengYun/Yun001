package com.Day01._02自定义异常;

/**
 * @Description Demo02
 * @Author ChengYun
 * @Date 2025-03-27  19:53
 */
public class Demo02 {
    public static void main(String[] args) {

        //目标：设置有效的年龄,有效年龄范围0~200，当年龄无效抛出年龄不合法的自定义异常

        try {
            setAge(100);
            setAge(201);
        } catch (AgeIllegalException e) {
            e.printStackTrace();//打印异常堆栈信息到控制台（异常完整信息，以后会写入日志文件），给开发人员看的
            //给用户看的（后面，这个信息会给到前端）
            System.out.println("发生错误："+e.getMessage()+"，请重新输入年龄");
        }
    }

    public static void setAge(int age) throws AgeIllegalException {
        if(age<0 || age>200){

            //3.抛出自定义编译时时异常
            //throw new 异常类型("友好的异常消息")
            throw new AgeIllegalException("年龄不合法");
        }
        System.out.println(age+"岁年龄合法，保存成功");
    }
}
