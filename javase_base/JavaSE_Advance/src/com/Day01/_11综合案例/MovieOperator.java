package com.Day01._11综合案例;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description MovieOperator
 * @Author ChengYun
 * @Date 2025-03-28  19:45
 */
public class MovieOperator {
    private static List<Movie> list = new ArrayList<>();

    static {
        list.add(new Movie(1, "《哪吒》", "哪吒", 9.5, "饺子"));
        list.add(new Movie(2, "《战狼》", "吴京", 9.5, "吴京"));
        list.add(new Movie(3, "《流浪地球》", "吴京", 9.5, "郭帆"));
        list.add(new Movie(4, "《倚天屠龙记》", "张三", 9.5, "李四"));

    }

    private static Scanner sc = new Scanner(System.in);


    public static void start() {
        while (true) {
            System.out.println("请选择操作的命令序号：");
            System.out.println("1.上架电影");
            System.out.println("2.查询电影");
            System.out.println("3.下架某部电影");
            System.out.println("4.下架指定主演的全部电影");
            System.out.println("5.退出");
            System.out.println("请选择：");

            //获取输入的选择
            int number = sc.nextInt();

            switch (number) {
                case 1:
                    addMovie();
                    break;
                case 2:
                    queryMovie();
                    break;
                case 3:
                    deleteMovie();
                    break;
                case 4:
                    //下架某个主演参演的全部电影,自己实现
                    deleteByNameMovie();
                    break;
                case 5:
                    //退出
                    return;//退出系统
                default:
                    System.out.println("输入有误，请重新输入！");
                    break;


            }
        }
    }

    private static void deleteByNameMovie() {
        System.out.println("执行下架某个主演参演的全部电影操作：");
        System.out.println("请输入要删除的演员名字：");
        String name = sc.next();
        Boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)){
                list.remove(i);
                i--;
                flag = true;
            }
        }
        if(flag){
            System.out.println("下架成功！");
        }
        if (!flag){
            System.out.println("没有找到该演员，请重新输入！");
        }
    }

    private static void deleteMovie() {
        System.out.println("执行下架电影操作：");
        System.out.println("请输入要删除的电影编号：");
        int id = sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id){
                list.remove(i);
                System.out.println("下架成功！");
                return;
            }
        }
        System.out.println("没有找到该电影编号，请重新输入！");

    }

    private static void queryMovie() {
        System.out.println("执行查询电影操作：");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    private static void addMovie() {
        System.out.println("执行上架电影操作：");
        System.out.println("请输入电影编号：");
        int id = sc.nextInt();
        System.out.println("请输入电影名称：");
        String movieName = sc.next();
        System.out.println("请输入电影评分：");
        double score = sc.nextDouble();
        System.out.println("请输入电影主演名字：");
        String name = sc.next();
        System.out.println("请输入导演名字：");
        String actor = sc.next();

        Movie movie = new Movie(id, movieName, name, score, actor);

        list.add(movie);
        System.out.println("上架成功！");

    }




}