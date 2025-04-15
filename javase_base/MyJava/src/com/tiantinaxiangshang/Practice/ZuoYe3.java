package com.tiantinaxiangshang.Practice;

import java.util.Scanner;

/**
 * @Description ZuoYe3
 * @Author ChengYun
 * @Date 2025-03-12  14:56
 */
public class ZuoYe3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //获取用户输入的性别,String 类型
        System.out.println("请输入您的性别:");
        String gender = scanner.next();

        //获取用户的输入的年龄,int类型
        System.out.println("请输入您的年龄:");
        int age = scanner.nextInt();

        //获取用户的输入的体重,Float类型
        System.out.println("请输入您的体重(kg):");
        Float weight = scanner.nextFloat();

        //获取用户输入的身高，Float类型
        System.out.println("请输入您的身高(cm):");
        Float height = scanner.nextFloat();

        System.out.printf("您的性别为:"+gender+"\n"+"您的年龄为:"+age+"\n"+"您的体重为:"+weight+"kg\n"+"您的身高为:"+height+"cm\n\n");
        System.out.print("您的指标如下:\n");
        System.out.printf("您的基础代谢率BMR为:%.2f卡路里/天\n",BMR(age,weight,height,gender));
        System.out.printf("您的BMI指数为:%.2f\n",BMI(weight,height,gender));
        System.out.println("您的BMI指数属于:\t"+Check(BMI(weight,height,gender)));




    }

    public static double BMR(int age, float weigth, float height, String gender) {
        double bmr = 0;
        if (gender.equals("男")) {
            bmr = 88.326 + 13.397 * weigth + 4.799 * height - 5.677 * age;
            return bmr;
        } else if (gender.equals("女")) {
            bmr = 447.593 + 9.247 * weigth + 3.098 * height - 4.330 * age;
            return bmr;
        } else {
            System.out.println("请输入正确的性别!!!");
        }
        return 0;
    }

    public static double BMI(float weight, float height, String gender){
        if (gender.equals("男") ||  gender.equals("女")){
            double heightInMeters = height / 100.0;
            return weight / (heightInMeters * heightInMeters);
        }
        return 0;
    }

    public static String Check(double bmi){
        if (bmi < 18.5){
            return "体重过轻";
        }else if (bmi > 18.5 && bmi < 24.9) {
            return "体重正常";
        }else if (bmi > 24.9 && bmi < 29.9){
            return "体重过重";
        }else{
            return "体重肥胖";
        }
    }


    }


