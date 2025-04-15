package com.oop.oop24_员工管理系统;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Description Demo
 * @Author ChengYun
 * @Date 2025-03-23  21:00
 */
public class Demo {

    public static ArrayList<Consumer> consumers = new ArrayList<>();

    public static ArrayList<UserData> userData = new ArrayList<>();

    static {
        consumers.add(new Consumer("admin", "123456"));
        consumers.add(new Consumer("user", "123456"));

        userData.add(new UserData(1, "张三", "男", "5000", "技术部"));
        userData.add(new UserData(2, "李四", "女", "6000", "销售部"));
        userData.add(new UserData(3, "王五", "男", "7000", "财务部"));
        userData.add(new UserData(4, "赵六", "女", "8000", "人事部"));

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("------------欢迎使用员工管理系统------------------");
            System.out.println("1.登录");
            System.out.println("2.退出");
            System.out.println("请输入您的选择:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Login();
                    break;
                case 2:
                    System.out.println("退出系统");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
                    break;
            }


        }


    }

    private static void Login() {
        Scanner scanner = new Scanner(System.in);
        int attempts = 1;

        while (true) {
            while (attempts < 3){
                System.out.println("请输入用户名:");
                String userName = scanner.next();
                System.out.println("请输入密码:");
                String userPassword = scanner.next();

                for (Consumer consumer : consumers) {
                    if (consumer.getUserName().equals(userName) && consumer.getUserPassword().equals(userPassword)) {
                        System.out.println("----登录成功----");
                        while (true) {
                            System.out.println("------------员工管理系统-----------");
                            System.out.println("1.查看员工信息");
                            System.out.println("2.添加员工信息");
                            System.out.println("3.修改员工信息");
                            System.out.println("4.删除员工信息");
                            System.out.println("5.退出系统");
                            System.out.println("请输入您的选择:");
                            int choice = scanner.nextInt();
                            switch (choice) {
                                case 1:
                                    //System.out.println("查看员工信息");
                                    ShowUserData();
                                    break;
                                case 2:
                                    //System.out.println("添加员工信息");
                                    AddUserData();
                                    break;
                                case 3:
                                    //System.out.println("修改员工信息");
                                    ReviseUserData();
                                    break;
                                case 4:
                                    //System.out.println("删除员工信息");
                                    DeleteUserData();
                                    break;
                                case 5:
                                    System.out.println("退出系统");
                                    scanner.close();
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("输入错误，请重新输入");
                                    break;
                            }
                        }
                    }else {
                        System.out.println("用户名或密码错误，请重新输入,还有"+(3-attempts)+"次机会");
                        attempts++;
                    }
                }

            }
            scanner.close();
            System.exit(0);
        }
    }

    private static void DeleteUserData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的员工编号:");
        int id = scanner.nextInt();
        for(int i=0 ;i < userData.size();i++){
            if(id == userData.get(i).getId()){
                userData.remove(i);
                System.out.println("删除员工信息成功!");
            }
        }
    }

    private static void ReviseUserData() {
        //id查询要修改的员工信息
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要修改的员工编号:");
        int id = scanner.nextInt();
        for(int i=0 ;i < userData.size();i++){
            if(id == userData.get(i).getId()){
                System.out.println("请输入员工工资:");
                String salary = scanner.next();
                userData.get(i).setSalary(salary);
                System.out.println("请输入员工部门:");
                String department = scanner.next();
                userData.get(i).setDepartment(department);
                System.out.println("修改员工信息成功!");

            }
        }
    }

    private static void AddUserData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要添加员工的信息:");
        System.out.println("请输入员工编号:");
        int id = scanner.nextInt();
        System.out.println("请输入员工姓名:");
        String name = scanner.next();
        System.out.println("请输入员工性别:");
        String sex = scanner.next();
        System.out.println("请输入员工工资:");
        String salary = scanner.next();
        System.out.println("请输入员工部门:");
        String department = scanner.next();
        userData.add(new UserData(id,name,sex,salary,department));
        System.out.println("添加员工信息成功啦!");
        ShowUserData();
    }

    private static void ShowUserData() {
        for(UserData users : userData){
            System.out.println(users);
        }
    }

}
