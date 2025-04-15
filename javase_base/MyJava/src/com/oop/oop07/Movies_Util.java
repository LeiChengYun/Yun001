package com.oop.oop07;

import javax.xml.stream.FactoryConfigurationError;
import java.util.Scanner;

/**
 * @Description Movies_Util
 * @Author ChengYun
 * @Date 2025-03-18  17:24
 */
public class Movies_Util {
    static Movies[] movies = {
            new Movies(1,"《肖申克的救赎》","9.6","罗伯托·贝尼尼"),
            new Movies(2,"《哪吒》","9.6","罗伯托·贝尼尼"),
            new Movies(3,"《美丽新世界》","9.6","罗伯托·贝尼尼"),
            new Movies(4,"《功夫足球》","9.6","罗伯托·贝尼尼"),
            new Movies(5,"《泰坦尼克号》","9.6","罗伯托·贝尼尼"),
    };

    // 打印电影数据
    public static void printMovies(){
        System.out.println("电影数据列表:");
        System.out.println("电影编号"+"\t电影名称");
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i].getId()+"\t"+movies[i].getName());
        }
    }

    // 根据电影编号查询电影信息
    public static void selectMovies(){
        System.out.println("请输入电影编号:");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        Boolean flag = false;
        for (int i = 0; i < movies.length; i++) {
            if (id == movies[i].getId()){
                System.out.println("电影编号"+"\t"+"电影名称"+"\t"+"电影评分"+"\t"+"导演");
                System.out.println(movies[i].getId()+"\t"+movies[i].getName()+"\t"+movies[i].getScore()+"\t"+movies[i].getDirector());
                flag = !flag;
                return;
            }
        }
        if(!flag){
            System.out.println("没有找到该id为"+id+"的电影");
        }

    }

}
