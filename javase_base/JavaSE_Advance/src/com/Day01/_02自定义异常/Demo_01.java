package com.Day01._02自定义异常;

/**
 * @Description Demo_03
 * @Author ChengYun
 * @Date 2025-03-27  11:44
 */
public class Demo_01 {
    public static void main(String[] args) {
        try {
            age_test(300);
        } catch (AgeIllegalRuntimeException e) {
            //打印异常堆栈信息到控制台（异常完整信息，以后会写入日志文件），给开发人员看的
            e.printStackTrace();
            //给用户看的（后面，这个信息会给到前端）
            System.out.println("发生错误，"+e.getMessage()+"，请检查");
        } catch (Exception e){
            //打印异常堆栈信息到控制台（异常完整信息，以后会写入日志文件），给开发人员看的
            //如果解决不了，向上传递
            e.printStackTrace();
            //给用户看的（后面，这个信息会给到前端）
            System.out.println("系统繁忙！稍后重试");
        }

    }

    public static void age_test(int a) throws AgeIllegalRuntimeException {
        if(a<=0 || a>=200){
            throw new AgeIllegalRuntimeException("年龄不合法");

        }
        System.out.println(a);
    }
}
